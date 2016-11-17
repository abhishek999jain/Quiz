package com.chippy.letsandroid.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Score extends AppCompatActivity {
    TextView displayScore;
    Float score;
    Button toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent j = getIntent();
        score = (float) j.getIntExtra("key", 0);
        score *=100;
        score /=7;
        displayScore=(TextView) findViewById(R.id.text);
        if(score<=40){
            displayScore.setText("Hey u have scored "+score+"% marks........work hard");
        }
        else if(score>=40 && score<=80)
        {
            displayScore.setText("Hey u have scored "+score+"% marks........you can do better next time");
        }
        else
        {
            displayScore.setText("Congrats u have scored "+score+"% marks........keep it up");
        }
        toast=(Button) findViewById(R.id.button1);
        toast.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(Score.this,"you have score "+score+" % marks", Toast.LENGTH_LONG).show();
            }
        });
    }
    }

