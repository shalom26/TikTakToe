package com.example.shalom.tiktaktoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton9;
    ImageButton imageButtonRestart;

    int counter=0;
    int counter1=0;
    int pp;
    String ppp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      imageButton1=(ImageButton) findViewById(R.id.imageButton1);
        imageButton2=(ImageButton) findViewById(R.id.imageButton2);
        imageButton3=(ImageButton) findViewById(R.id.imageButton3);
        imageButton4=(ImageButton) findViewById(R.id.imageButton4);
        imageButton5=(ImageButton) findViewById(R.id.imageButton5);
        imageButton6=(ImageButton) findViewById(R.id.imageButton6);
        imageButton7=(ImageButton) findViewById(R.id.imageButton7);
        imageButton8=(ImageButton) findViewById(R.id.imageButton8);
        imageButton9=(ImageButton) findViewById(R.id.imageButton9);
        imageButtonRestart=(ImageButton) findViewById(R.id.imageButtonRestart);

        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
        imageButton7.setOnClickListener(this);
        imageButton8.setOnClickListener(this);
        imageButton9.setOnClickListener(this);
        imageButtonRestart.setOnClickListener(this);





    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButton1) {
            play(imageButton1);
        } else if (v.getId() == R.id.imageButton2) {
            play(imageButton2);
        }
        if (v.getId() == R.id.imageButton3) {
            play(imageButton3);
        } else if (v.getId() == R.id.imageButton4) {
            play(imageButton4);
        }
        if (v.getId() == R.id.imageButton5) {
            play(imageButton5);
        } else if (v.getId() == R.id.imageButton6) {
            play(imageButton6);
        }
        if (v.getId() == R.id.imageButton7) {
            play(imageButton7);
        } else if (v.getId() == R.id.imageButton8) {
            play(imageButton8);
        }
        if (v.getId() == R.id.imageButton9) {
            play(imageButton9);
        } else if (v.getId() == R.id.imageButtonRestart) {
            end();
        }

    }

    public void play(ImageButton but){

        if (counter == 0) {
            but.setImageResource(R.drawable.x);
            but.setContentDescription("x");
            counter++;
            counter1++;
        } else
        {
            but.setImageResource(R.drawable.o);
            but.setContentDescription("y");
            counter = 0;
            counter1++;
        }


    }

    public void end (){

    }




}
