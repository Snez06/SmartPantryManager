package com.example.smartpantrymanager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class SuggestedRecipesActivity extends AppCompatActivity {

    private PantryDataSource dataSource;
    private RecyclerView strictList;
    private RecyclerView almostList;
    private TextView empty;
    private TextView almostTitle;
    private TextView almostEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggested_recipes);
        setTitle("Suggested Recipes");

        dataSource = new PantryDataSource(this);
        strictList = findViewById(R.id.rvSuggestions);
        almostList = findViewById(R.id.rvAlmostThere);
        empty = findViewById(R.id.tvRecipeEmpty);
        almostTitle = findViewById(R.id.tvAlmostTitle);
        almostEmpty = findViewById(R.id.tvAlmostEmpty);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
        BottomNavHelper.setup(this, bottomNav, R.id.nav_recipes);
    }

    @Override
    protected void onResume() {
        super.onResume();
        refreshRecipes();
    }

    private void refreshRecipes() {
        dataSource.open();

        ArrayList<PantryItem> pantry = dataSource.getAllIngredients();
        ArrayList<Recipe> matches = dataSource.getSuggestions(pantry);
        ArrayList<Recipe> almost = dataSource.getAlmostThere(pantry);

        dataSource.close();

        strictList.setLayoutManager(new LinearLayoutManager(this));
        strictList.setAdapter(new RecipeAdapter(matches, this::openRecipe));

        empty.setVisibility(matches.isEmpty() ? View.VISIBLE : View.GONE);

        SharedPreferences prefs = getSharedPreferences("MyPantryPrefs", MODE_PRIVATE);
        boolean showAlmostThere = prefs.getBoolean("show_almost", true);

        if (!showAlmostThere) {
            almostTitle.setVisibility(View.GONE);
            almostList.setVisibility(View.GONE);
            almostEmpty.setVisibility(View.GONE);
            return;
        }

        almostTitle.setVisibility(View.VISIBLE);
        almostList.setVisibility(almost.isEmpty() ? View.GONE : View.VISIBLE);
        almostEmpty.setVisibility(almost.isEmpty() ? View.VISIBLE : View.GONE);

        if (!almost.isEmpty()) {
            almostList.setLayoutManager(new LinearLayoutManager(this));
            almostList.setAdapter(new RecipeAdapter(almost, this::openRecipe));
        }
    }

    private void openRecipe(Recipe recipe) {
        Intent intent = new Intent(this, RecipeDetailActivity.class);
        intent.putExtra("recipe_id", recipe.getId());
        startActivity(intent);
    }
}
