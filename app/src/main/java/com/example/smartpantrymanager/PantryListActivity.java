package com.example.smartpantrymanager;

import android.content.Intent;import android.os.Bundle;import android.view.View;import android.widget.TextView;import androidx.appcompat.app.AppCompatActivity;import androidx.recyclerview.widget.LinearLayoutManager;import androidx.recyclerview.widget.RecyclerView;import com.google.android.material.bottomnavigation.BottomNavigationView;import com.google.android.material.floatingactionbutton.FloatingActionButton;import java.util.ArrayList;

public class PantryListActivity extends AppCompatActivity{
    private PantryDataSource dataSource;private ArrayList<PantryItem> items;private RecyclerView recycler;private TextView empty;
    @Override protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_pantry_list);setTitle("My Pantry");dataSource=new PantryDataSource(this);recycler=findViewById(R.id.rvPantry);empty=findViewById(R.id.tvEmpty);FloatingActionButton fab=findViewById(R.id.fabAdd);fab.setOnClickListener(v->startActivity(new Intent(this,AddEditIngredientActivity.class)));BottomNavigationView nav=findViewById(R.id.bottomNav);BottomNavHelper.setup(this,nav,R.id.nav_pantry);}
    @Override protected void onResume(){super.onResume();dataSource.open();items=dataSource.getAllIngredients();dataSource.close();recycler.setLayoutManager(new LinearLayoutManager(this));recycler.setAdapter(new PantryAdapter(items,new PantryAdapter.Listener(){public void onEdit(PantryItem i){Intent x=new Intent(PantryListActivity.this,AddEditIngredientActivity.class);x.putExtra("ingredient_id",i.getId());startActivity(x);}public void onDelete(PantryItem i){dataSource.open();dataSource.deleteIngredient(i.getId());dataSource.close();onResume();}}));empty.setVisibility(items.isEmpty()?View.VISIBLE:View.GONE);}
}
