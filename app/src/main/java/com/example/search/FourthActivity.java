package com.example.search;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FourthActivity extends AppCompatActivity {
    private Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(FourthActivity.this , FifthActivity.class);
                ////启动
                startActivity(i);
            }
        });
    }
}
