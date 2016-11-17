package com.chippy.letsandroid.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class TestQuestion extends AppCompatActivity {
    Button next;
    TextView tv;
    int score;
    EditText answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_question);
        Intent j = getIntent();
        score = j.getIntExtra("key", 0);
        answer =(EditText) findViewById(R.id.editText1);
        tv= (TextView) findViewById(R.id.text1);
        tv.setText("What is  the full form of DVM ?");
        next= (Button) findViewById(R.id.button1);
        next.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String str = answer.getText().toString();
                // TODO Auto-generated method stub
                if(TextUtils.isEmpty(str)) {
                    Toast.makeText(TestQuestion.this,"Plz type the answer", Toast.LENGTH_LONG).show();
                    return ;
                }
                else if(str.contains("Dalvik Virtual Machine")){
                    score +=2;
                    Intent i=new Intent(TestQuestion.this,Next.class);
                    i.putExtra("key", score);
                    startActivity(i);
                }
                else if(str.contains("dalvik virtual machine")){
                    score++;
                    Intent i=new Intent(TestQuestion.this,Next.class);
                    i.putExtra("key", score);
                    startActivity(i);
                }
                  else  {
                        Intent i=new Intent(TestQuestion.this,Next.class);
                        i.putExtra("key", score);
                        startActivity(i);
                }
            }
        });
    }
}
