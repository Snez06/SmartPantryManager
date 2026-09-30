package com.example.smartpantrymanager;

import android.content.SharedPreferences;import android.os.Bundle;import android.widget.CompoundButton;import android.widget.Switch;import androidx.appcompat.app.AppCompatActivity;import com.google.android.material.bottomnavigation.BottomNavigationView;
public class SettingsActivity extends AppCompatActivity{
    private SharedPreferences prefs;
    @Override protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_settings);setTitle("Settings");prefs=getSharedPreferences("MyPantryPrefs",MODE_PRIVATE);Switch show=findViewById(R.id.switchAlmost);show.setChecked(prefs.getBoolean("show_almost",true));show.setOnCheckedChangeListener((button,checked)->prefs.edit().putBoolean("show_almost",checked).apply());BottomNavHelper.setup(this,(BottomNavigationView)findViewById(R.id.bottomNav),R.id.nav_settings);}
}
