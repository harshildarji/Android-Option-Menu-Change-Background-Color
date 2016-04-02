package com.example.jarvis.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("Cyan").setIcon(android.R.drawable.ic_menu_call);
        menu.add("Grape");
        menu.add("Light Blue");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        LinearLayout ln=(LinearLayout)findViewById(R.id.mainlayer);
        if(item.getTitle().toString().equals("Cyan"))
            ln.setBackgroundColor(Color.CYAN);
        if(item.getTitle().toString().equals("Grape"))
            ln.setBackgroundColor(Color.parseColor("#5E5A80"));
        if(item.getTitle().toString().equals("Light Blue"))
            ln.setBackgroundColor(Color.parseColor("#ADD8E6"));
        return true;
    }

}
