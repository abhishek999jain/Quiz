package com.chippy.letsandroid.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Next extends AppCompatActivity {
    TextView question;
    RadioButton option1;
    RadioButton option2;
    RadioButton option3;
    Button end;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent j = getIntent();
        score = j.getIntExtra("key", 0);
        option1 = (RadioButton) findViewById(R.id.radio0);
        option2 = (RadioButton) findViewById(R.id.radio1);
        option3 = (RadioButton) findViewById(R.id.radio2);
        question = (TextView)findViewById(R.id.textView1);
        question.setText("DVM is based on________?");
        option1.setText("STACK");
        option2.setText("QUEUE");
        option3.setText("REGISTER");
        end =(Button) findViewById(R.id.button2);
        end.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if(option3.isChecked())
                {
                    score ++;
                }
                Intent i=new Intent(Next.this,Score.class);
                i.putExtra("key",score);
                startActivity(i);
            }
        });
    }
}
