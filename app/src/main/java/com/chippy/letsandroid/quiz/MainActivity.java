package com.chippy.letsandroid.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button term;
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        term =(Button) findViewById(R.id.button2);
        start =(Button) findViewById(R.id.button1);

        term.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i =new Intent(MainActivity.this,Term.class);
                startActivity(i);
            }
        });

        start.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i =new Intent(MainActivity.this,Question.class);
                startActivity(i);
            }
        });
    }
}

