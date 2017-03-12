package com.example.search;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FifthActivity extends AppCompatActivity {
    private Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(FifthActivity.this , SixthActivity.class);
                ////启动
                startActivity(i);
            }
        });
    }
}
