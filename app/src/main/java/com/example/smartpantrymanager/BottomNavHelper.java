package com.example.smartpantrymanager;

import android.content.Context;import android.content.Intent;import com.google.android.material.bottomnavigation.BottomNavigationView;
public final class BottomNavHelper{
    private BottomNavHelper(){}
    public static void setup(Context context,BottomNavigationView nav,int selected){nav.setSelectedItemId(selected);nav.setOnItemSelectedListener(item->{Class<?> target=null;if(item.getItemId()==R.id.nav_pantry)target=PantryListActivity.class;else if(item.getItemId()==R.id.nav_recipes)target=SuggestedRecipesActivity.class;else if(item.getItemId()==R.id.nav_settings)target=SettingsActivity.class;if(target!=null&&context.getClass()!=target){context.startActivity(new Intent(context,target).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));return true;}return true;});}
}
