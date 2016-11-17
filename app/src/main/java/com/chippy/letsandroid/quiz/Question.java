package com.chippy.letsandroid.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Question extends AppCompatActivity {
    int value=5;
    int quen_no=1;
    int marks;
    Button next;
    TextView question;
    CheckBox checkBox4;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    String[] ques_1 = {
            "Q 1 - What are the layouts available in android?",
            "Linear Layout",
            "Frame Layout",
            "Table Layout",
            "All of them",
            "Q 2 - What is Android?",
            "Android is a stack of software's",
            "Google mobile device name",
            "Virtual machine",
            "All of them" ,
            "Q 3 - What is the package name of JSON?",
            "com.json",
            "in.json",
            "com.android.JSON",
            "org.json",
            "Q 4 -Which permissions are required to get a location in android?",
            "ACCESS_FINE and ACCESS_COARSE",
            "GPRS permission",
            "Internet permission",
            "WIFI permission"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        next =(Button) findViewById(R.id.button2);
        question = (TextView)findViewById(R.id.textView1);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        question.setText(ques_1[0]);
        checkBox1.setText(ques_1[1]);
        checkBox2.setText(ques_1[2]);
        checkBox3.setText(ques_1[3]);
        checkBox4.setText(ques_1[4]);
        next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                answer();
                next();
            }
            public void next() {
                // TODO Auto-generated method stub
                if(value<=19)
                {   uncheckAll();
                    quen_no+=1;
                    question.setText(ques_1[value]);
                    checkBox1.setText(ques_1[value+1]);
                    checkBox2.setText(ques_1[value+2]);
                    checkBox3.setText(ques_1[value+3]);
                    checkBox4.setText(ques_1[value+4]);
                }
                value+=5;
            }

            public void answer() {
                // TODO Auto-generated method stub
                if(quen_no==1)
                {
                    if(checkBox1.isChecked()||checkBox3.isChecked()||checkBox2.isChecked()||checkBox4.isChecked()){
                        marks ++;}
                }
                if(quen_no==2 ) {
                    if(checkBox1.isChecked()||checkBox3.isChecked()){
                        marks +=1;}
                }
                if(quen_no==3 && checkBox4.isChecked()){
                    marks +=1;
                }
                if(quen_no==4 && checkBox1.isChecked()){
                    marks +=1;
                }
                if(quen_no==4){
                    Intent i=new Intent(Question.this,TestQuestion.class);
                    i.putExtra("key", marks);
                    startActivity(i);
                }
            }
        });
    }
    public void uncheckAll() {
        // TODO Auto-generated method stub
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
        checkBox4.setChecked(false);

    }
}
