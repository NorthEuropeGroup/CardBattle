package com.example.cardbattle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Card extends Activity {
	 private ImageButton button_fight;
	 private ImageButton button_card;
	 private ImageButton button_shop;
	 private ImageButton button_home;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.card);
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
           intent.setClass(Card.this,Fight.class);
           startActivity(intent);
           finish();
       }
       
   };
   private ImageButton.OnClickListener listener2 = new ImageButton.OnClickListener(){

       @Override
       public void onClick(View arg0) {
           // TODO Auto-generated method stub
           Intent intent = new Intent();
           intent.setClass(Card.this,Card.class);
           startActivity(intent);
           finish();
       }

       
   };
   
   private ImageButton.OnClickListener listener3 = new ImageButton.OnClickListener(){

       @Override
       public void onClick(View arg0) {
           // TODO Auto-generated method stub
           Intent intent = new Intent();
           intent.setClass(Card.this,Shop.class);
           startActivity(intent);
           finish();
       }
   };
   private ImageButton.OnClickListener listener4 = new ImageButton.OnClickListener(){

       @Override
       public void onClick(View arg0) {
           // TODO Auto-generated method stub
           Intent intent = new Intent();
           intent.setClass(Card.this,Midgard.class);
           startActivity(intent);
           finish();
       }

   };
}