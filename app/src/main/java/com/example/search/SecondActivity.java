package com.example.search;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;


public class SecondActivity extends AppCompatActivity {
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn2 = (Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                Intent i = new Intent(SecondActivity.this , ThirdActivity.class);
                ////启动
                startActivity(i);
            }
        });
    }
}
