package com.example.smartpantrymanager;

public class RecipeIngredient {
    private long id, recipeId;
    private String name, unit;
    private double quantity;
    public RecipeIngredient(long id,long recipeId,String name,double quantity,String unit){this.id=id;this.recipeId=recipeId;this.name=name;this.quantity=quantity;this.unit=unit;}
    public long getId(){return id;} public long getRecipeId(){return recipeId;} public String getName(){return name;} public double getQuantity(){return quantity;} public String getUnit(){return unit;}
}
