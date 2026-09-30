package com.example.smartpantrymanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

public class PantryDataSource {
    private final PantryDBHelper helper; private SQLiteDatabase db;
    public PantryDataSource(Context context){helper=new PantryDBHelper(context.getApplicationContext());}
    public void open(){db=helper.getWritableDatabase();} public void close(){if(db!=null){db.close();db=null;}}
    public long insertIngredient(PantryItem item){ContentValues v=values(item);return db.insert("pantry_item",null,v);}
    public int updateIngredient(PantryItem item){ContentValues v=values(item);return db.update("pantry_item",v,"_id=?",new String[]{String.valueOf(item.getId())});}
    public int deleteIngredient(long id){return db.delete("pantry_item","_id=?",new String[]{String.valueOf(id)});}
    private ContentValues values(PantryItem i){ContentValues v=new ContentValues();v.put("name",i.getName());v.put("quantity",i.getQuantity());v.put("unit",i.getUnit());v.put("expiry_date",i.getExpiryDate());return v;}
    public ArrayList<PantryItem> getAllIngredients(){ArrayList<PantryItem> list=new ArrayList<>();Cursor c=db.query("pantry_item",null,null,null,null,null,"name COLLATE NOCASE ASC");while(c.moveToNext())list.add(new PantryItem(c.getLong(c.getColumnIndexOrThrow("_id")),c.getString(c.getColumnIndexOrThrow("name")),c.getDouble(c.getColumnIndexOrThrow("quantity")),c.getString(c.getColumnIndexOrThrow("unit")),c.getString(c.getColumnIndexOrThrow("expiry_date"))));c.close();return list;}
    public PantryItem getIngredient(long id){Cursor c=db.query("pantry_item",null,"_id=?",new String[]{String.valueOf(id)},null,null,null);try{if(c.moveToFirst())return new PantryItem(id,c.getString(c.getColumnIndexOrThrow("name")),c.getDouble(c.getColumnIndexOrThrow("quantity")),c.getString(c.getColumnIndexOrThrow("unit")),c.getString(c.getColumnIndexOrThrow("expiry_date")));return null;}finally{c.close();}}
    public ArrayList<Recipe> getAllRecipes(){ArrayList<Recipe> list=new ArrayList<>();Cursor c=db.query("recipe",null,null,null,null,null,"name COLLATE NOCASE ASC");while(c.moveToNext()){long id=c.getLong(c.getColumnIndexOrThrow("_id"));Recipe r=new Recipe(id,c.getString(c.getColumnIndexOrThrow("name")),c.getString(c.getColumnIndexOrThrow("steps")));Cursor ic=db.query("recipe_ingredient",null,"recipe_id=?",new String[]{String.valueOf(id)},null,null,"_id ASC");while(ic.moveToNext())r.addIngredient(new RecipeIngredient(ic.getLong(ic.getColumnIndexOrThrow("_id")),id,ic.getString(ic.getColumnIndexOrThrow("ingredient_name")),ic.getDouble(ic.getColumnIndexOrThrow("quantity")),ic.getString(ic.getColumnIndexOrThrow("unit"))));ic.close();list.add(r);}c.close();return list;}
    public Recipe getRecipe(long id){for(Recipe r:getAllRecipes())if(r.getId()==id)return r;return null;}
    public ArrayList<Recipe> getSuggestions(ArrayList<PantryItem> pantry){ArrayList<Recipe> matches=new ArrayList<>();for(Recipe r:getAllRecipes()){boolean canMake=true;for(RecipeIngredient req:r.getIngredients()){if(!hasSufficientQuantity(pantry,req)){canMake=false;break;}}if(canMake)matches.add(r);}return matches;}
    public ArrayList<Recipe> getAlmostThere(ArrayList<PantryItem> pantry){ArrayList<Recipe> matches=new ArrayList<>();for(Recipe r:getAllRecipes()){int missing=0;for(RecipeIngredient req:r.getIngredients()){if(!hasSufficientQuantity(pantry,req))missing++;}if(missing==1)matches.add(r);}return matches;}
    private boolean hasSufficientQuantity(ArrayList<PantryItem> pantry,RecipeIngredient need){
        String wanted=normalize(need.getName());
        String requiredUnit=normalizeUnit(need.getUnit());
        double available=0;

        for(PantryItem item:pantry){
            if(!normalize(item.getName()).equals(wanted)) continue;
            String pantryUnit=normalizeUnit(item.getUnit());
            if(!compatible(pantryUnit,requiredUnit)) continue;
            available += toBase(item.getQuantity(),pantryUnit);
        }

        return available >= toBase(need.getQuantity(),requiredUnit);
    }

    private String normalize(String s){
        s=s.toLowerCase().trim();
        if(s.endsWith("ies")&&s.length()>3) return s.substring(0,s.length()-3)+"y";
        if(s.endsWith("es")&&s.length()>3) return s.substring(0,s.length()-2);
        if(s.endsWith("s")&&s.length()>2) return s.substring(0,s.length()-1);
        return s;
    }

    private String normalizeUnit(String unit){
        String u=unit.toLowerCase().trim();
        if(u.equals("gram")||u.equals("grams")) return "g";
        if(u.equals("kilogram")||u.equals("kilograms")) return "kg";
        if(u.equals("millilitre")||u.equals("millilitres")||u.equals("milliliter")||u.equals("milliliters")) return "ml";
        if(u.equals("litre")||u.equals("litres")||u.equals("liter")||u.equals("liters")) return "l";
        if(u.equals("piece")||u.equals("pieces")) return "pcs";
        if(u.equals("tablespoon")||u.equals("tablespoons")) return "tbsp";
        if(u.equals("slice")) return "slices";
        if(u.equals("leaf")) return "leaves";
        if(u.equals("clove")) return "cloves";
        return u;
    }

    private boolean compatible(String a,String b){if(a.equals(b))return true;return (a.equals("kg")||a.equals("g"))&&(b.equals("kg")||b.equals("g")) || (a.equals("l")||a.equals("ml"))&&(b.equals("l")||b.equals("ml"));}
    private double toBase(double q,String u){if(u.equals("kg"))return q*1000;if(u.equals("l"))return q*1000;return q;}
}
