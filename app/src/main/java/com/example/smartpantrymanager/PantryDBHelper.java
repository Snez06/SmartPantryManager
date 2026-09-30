package com.example.smartpantrymanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PantryDBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME="smartpantry.db";
    private static final int DB_VERSION=1;
    public PantryDBHelper(Context context){super(context,DB_NAME,null,DB_VERSION);}
    @Override public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE pantry_item (_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL,quantity REAL NOT NULL,unit TEXT NOT NULL,expiry_date TEXT)");
        db.execSQL("CREATE TABLE recipe (_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL,steps TEXT NOT NULL)");
        db.execSQL("CREATE TABLE recipe_ingredient (_id INTEGER PRIMARY KEY AUTOINCREMENT,recipe_id INTEGER NOT NULL,ingredient_name TEXT NOT NULL,quantity REAL NOT NULL,unit TEXT NOT NULL,FOREIGN KEY(recipe_id) REFERENCES recipe(_id) ON DELETE CASCADE)");
        seedRecipes(db);
    }
    @Override public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXISTS recipe_ingredient"); db.execSQL("DROP TABLE IF EXISTS recipe"); db.execSQL("DROP TABLE IF EXISTS pantry_item"); onCreate(db);
    }
    private void insertRecipe(SQLiteDatabase db,String name,String steps,String[][] ingredients){
        ContentValues r=new ContentValues(); r.put("name",name); r.put("steps",steps); long id=db.insert("recipe",null,r);
        for(String[] x:ingredients){ContentValues v=new ContentValues();v.put("recipe_id",id);v.put("ingredient_name",x[0]);v.put("quantity",Double.parseDouble(x[1]));v.put("unit",x[2]);db.insert("recipe_ingredient",null,v);}
    }
    private void seedRecipes(SQLiteDatabase db){
        insertRecipe(db,"Tomato Pasta","Boil pasta. Saute tomato and onion in olive oil. Add pasta, season and serve.",new String[][]{{"pasta","200","g"},{"tomato","3","pcs"},{"onion","1","pcs"},{"olive oil","2","tbsp"}});
        insertRecipe(db,"Vegetable Omelette","Whisk eggs. Cook with onion, tomato and cheese until set.",new String[][]{{"eggs","3","pcs"},{"onion","1","pcs"},{"tomato","1","pcs"},{"cheese","50","g"}});
        insertRecipe(db,"Chicken Rice","Cook rice. Stir-fry chicken, onion and carrot, then combine.",new String[][]{{"rice","200","g"},{"chicken","250","g"},{"onion","1","pcs"},{"carrot","1","pcs"}});
        insertRecipe(db,"Tuna Sandwich","Mix tuna with mayonnaise. Fill bread with tuna and lettuce.",new String[][]{{"tuna","1","can"},{"bread","4","slices"},{"mayonnaise","2","tbsp"},{"lettuce","2","leaves"}});
        insertRecipe(db,"Pancakes","Mix flour, milk and eggs. Fry spoonfuls until golden.",new String[][]{{"flour","200","g"},{"milk","250","ml"},{"eggs","2","pcs"},{"sugar","2","tbsp"}});
        insertRecipe(db,"Garlic Rice","Fry garlic in oil, add cooked rice and season.",new String[][]{{"rice","200","g"},{"garlic","3","cloves"},{"olive oil","1","tbsp"}});
        insertRecipe(db,"Chicken Wrap","Cook chicken and fill tortillas with lettuce, tomato and sauce.",new String[][]{{"chicken","200","g"},{"tortilla","2","pcs"},{"lettuce","2","leaves"},{"tomato","1","pcs"},{"mayonnaise","2","tbsp"}});
        insertRecipe(db,"Vegetable Soup","Simmer vegetables in stock until tender.",new String[][]{{"potato","2","pcs"},{"carrot","2","pcs"},{"onion","1","pcs"},{"stock","500","ml"}});
        insertRecipe(db,"Cheese Toast","Top bread with cheese and toast until melted.",new String[][]{{"bread","2","slices"},{"cheese","60","g"},{"butter","10","g"}});
        insertRecipe(db,"Fruit Smoothie","Blend banana, milk and honey until smooth.",new String[][]{{"banana","1","pcs"},{"milk","250","ml"},{"honey","1","tbsp"}});
        insertRecipe(db,"Bean Salad","Combine beans, tomato, onion and olive oil. Season and serve.",new String[][]{{"beans","1","can"},{"tomato","2","pcs"},{"onion","1","pcs"},{"olive oil","1","tbsp"}});
        insertRecipe(db,"Mac and Cheese","Boil macaroni. Stir through cheese sauce and bake or serve hot.",new String[][]{{"macaroni","200","g"},{"cheese","100","g"},{"milk","250","ml"},{"butter","20","g"}});
        insertRecipe(db,"French Toast","Dip bread in beaten egg and milk. Fry until golden and add sugar.",new String[][]{{"bread","4","slices"},{"eggs","2","pcs"},{"milk","100","ml"},{"sugar","1","tbsp"}});
        insertRecipe(db,"Chicken Stir Fry","Stir-fry chicken with mixed vegetables and soy sauce.",new String[][]{{"chicken","250","g"},{"carrot","1","pcs"},{"onion","1","pcs"},{"soy sauce","2","tbsp"}});
        insertRecipe(db,"Tomato Egg Rice","Fry tomato, add beaten eggs, then serve over cooked rice.",new String[][]{{"tomato","2","pcs"},{"eggs","2","pcs"},{"rice","200","g"},{"olive oil","1","tbsp"}});
        insertRecipe(db,"Potato Hash","Dice and fry potato with onion and pepper until crisp.",new String[][]{{"potato","3","pcs"},{"onion","1","pcs"},{"olive oil","1","tbsp"},{"pepper","1","pcs"}});
        insertRecipe(db,"Banana Oat Bowl","Cook oats with milk and top with banana and honey.",new String[][]{{"oats","80","g"},{"milk","250","ml"},{"banana","1","pcs"},{"honey","1","tbsp"}});
        insertRecipe(db,"Classic Salad","Toss lettuce, tomato, cucumber and olive oil.",new String[][]{{"lettuce","4","leaves"},{"tomato","2","pcs"},{"cucumber","1","pcs"},{"olive oil","1","tbsp"}});
    }
}
