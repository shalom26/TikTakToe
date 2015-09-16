package com.example.shalom.tiktaktoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton[][] imageButton = new ImageButton[3][3];
    ImageButton imageButtonRestart;
     Bitmap bitmap;

    int counter=0;
    int counter1=0;
    int xWin,yWin;
    int pp;
    String ppp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton[0][0]=(ImageButton) findViewById(R.id.imageButton1);
        imageButton[0][1]=(ImageButton) findViewById(R.id.imageButton2);
        imageButton[0][2]=(ImageButton) findViewById(R.id.imageButton3);
        imageButton[1][0]=(ImageButton) findViewById(R.id.imageButton4);
        imageButton[1][1]=(ImageButton) findViewById(R.id.imageButton5);
        imageButton[1][2]=(ImageButton) findViewById(R.id.imageButton6);
        imageButton[2][0]=(ImageButton) findViewById(R.id.imageButton7);
        imageButton[2][1]=(ImageButton) findViewById(R.id.imageButton8);
        imageButton[2][2]=(ImageButton) findViewById(R.id.imageButton9);
        imageButtonRestart=(ImageButton) findViewById(R.id.imageButtonRestart);

        imageButton[0][0].setOnClickListener(this);
        imageButton[0][1].setOnClickListener(this);
        imageButton[0][2].setOnClickListener(this);
        imageButton[1][0].setOnClickListener(this);
        imageButton[1][1].setOnClickListener(this);
        imageButton[1][2].setOnClickListener(this);
        imageButton[2][0].setOnClickListener(this);
        imageButton[2][1].setOnClickListener(this);
        imageButton[2][2].setOnClickListener(this);
        imageButtonRestart.setOnClickListener(this);
        imageButtonRestart.setImageResource(R.drawable.restart);





    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButton1) {
            play(imageButton[0][0]);
        }  if (v.getId() == R.id.imageButton2) {
            play(imageButton[0][1]);
        }
        if (v.getId() == R.id.imageButton3) {
            play(imageButton[0][2]);
        }  if (v.getId() == R.id.imageButton4) {
            play(imageButton[1][0]);
        }
        if (v.getId() == R.id.imageButton5) {
            play(imageButton[1][1]);
        }  if (v.getId() == R.id.imageButton6) {
            play(imageButton[1][2]);
        }
        if (v.getId() == R.id.imageButton7) {
            play(imageButton[2][0]);
        }  if (v.getId() == R.id.imageButton8) {
            play(imageButton[2][1]);
        }
        if (v.getId() == R.id.imageButton9) {
            play(imageButton[2][2]);
        }  if (v.getId() == R.id.imageButtonRestart) {
            end();
        }

    }

    public void play(ImageButton but) {

        if (counter == 0) {
            but.setImageResource(R.drawable.x);
            but.setContentDescription("x");
            counter++;
            counter1++;
            but.setEnabled(false);
        } else {
            but.setImageResource(R.drawable.o);
            but.setContentDescription("y");
            counter = 0;
            counter1++;
            but.setEnabled(false);

        }
        for (int i = 0; i < 3; i++) {
            xWin = 0;
            yWin = 0;
            for (int j = 0; j < 3; j++) {
                if (imageButton[i][j].getContentDescription() == "x") {
                    xWin++;
                    if (xWin == 3) {
                        Alet("X");
                    }
                } else if (imageButton[i][j].getContentDescription() == "y") {
                    yWin++;
                    if (yWin == 3) {
                        Alet("Y");
                    }
                }

            }


        }
        for (int i = 0; i < 3; i++) {
            xWin = 0;
            yWin = 0;
            for (int j = 0; j < 3; j++) {
                if (imageButton[j][i].getContentDescription() == "x") {
                    xWin++;
                    if (xWin == 3) {
                        Alet("X");
                    }

                } else if (imageButton[j][i].getContentDescription() == "y") {
                    yWin++;
                    if (yWin == 3) {
                        Alet("Y");

                    }

                }
            }
        }
        xWin=0;
        yWin=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) {
                    if (imageButton[i][j].getContentDescription() == "x") {
                        xWin++;
                        if (xWin == 3) {
                            Alet("X");
                        }

                            }
                        if (imageButton[i][j].getContentDescription() == "y") {
                        yWin++;
                        if (yWin == 3) {
                            Alet("Y");

                        }
                    }
                }
            }
        }
        xWin=0;
        yWin=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j+i==2) {
                    if (imageButton[i][j].getContentDescription() == "x") {
                        xWin++;
                        if (xWin == 3) {
                            Alet("X");
                        }


                        }
                    if (imageButton[i][j].getContentDescription() == "y") {
                        yWin++;
                        if (yWin == 3) {
                            Alet("Y");
                        }
                    }
                }
            }
        }


    }

    public void end (){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                imageButton[i][j].setImageBitmap(bitmap);
                imageButton[i][j].setContentDescription(" ");
                imageButton[i][j].setEnabled(true);
                xWin=0;
                yWin=0;
                counter=0;


            }
        }

    }

    public void Alet(String win){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(win+ " WIN")
                .setMessage(ppp)
                .setCancelable(false)
                .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        end();
                    }
                }).create().show();

    }




}
