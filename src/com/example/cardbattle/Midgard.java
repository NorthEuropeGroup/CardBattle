package com.example.cardbattle;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.os.Build;

public class Midgard extends ActionBarActivity {
	 private ImageButton button_fight;
	 private ImageButton button_card;
	 private ImageButton button_shop;
	 private ImageButton button_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midgard);
        button_fight = (ImageButton)findViewById(R.id.imageButton1);
        button_fight.setOnClickListener(listener);
        button_card = (ImageButton)findViewById(R.id.imageButton2);
        button_card.setOnClickListener(listener2);
        button_shop = (ImageButton)findViewById(R.id.imageButton3);
        button_shop.setOnClickListener(listener3);
        button_home = (ImageButton)findViewById(R.id.imageButton4);
        button_home.setOnClickListener(listener4);

    }





    private ImageButton.OnClickListener listener = new ImageButton.OnClickListener(){

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            Intent intent = new Intent();
            intent.setClass(Midgard.this,Fight.class);
            startActivity(intent);
            finish();
        }
        
    };
    private ImageButton.OnClickListener listener2 = new ImageButton.OnClickListener(){

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            Intent intent = new Intent();
            intent.setClass(Midgard.this,Card.class);
            startActivity(intent);
            finish();
        }

        
    };
    
    private ImageButton.OnClickListener listener3 = new ImageButton.OnClickListener(){

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            Intent intent = new Intent();
            intent.setClass(Midgard.this,Shop.class);
            startActivity(intent);
            finish();
        }
    };
    private ImageButton.OnClickListener listener4 = new ImageButton.OnClickListener(){

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            Intent intent = new Intent();
            intent.setClass(Midgard.this,Midgard.class);
            startActivity(intent);
            finish();
        }

    };
}
