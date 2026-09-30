package com.example.smartpantrymanager;

import android.os.Bundle;import android.widget.TextView;import androidx.appcompat.app.AppCompatActivity;
public class RecipeDetailActivity extends AppCompatActivity{
    @Override protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_recipe_detail);long id=getIntent().getLongExtra("recipe_id",-1);PantryDataSource ds=new PantryDataSource(this);ds.open();Recipe r=ds.getRecipe(id);ds.close();if(r==null){finish();return;}setTitle(r.getName());TextView name=findViewById(R.id.tvDetailName),ings=findViewById(R.id.tvDetailIngredients),steps=findViewById(R.id.tvDetailSteps);name.setText(r.getName());StringBuilder x=new StringBuilder();for(RecipeIngredient i:r.getIngredients())x.append("• ").append(i.getQuantity()).append(" ").append(i.getUnit()).append(" ").append(i.getName()).append("\n");ings.setText(x.toString());steps.setText(r.getSteps());}
}
