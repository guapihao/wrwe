package com.example.search;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TenthActivity extends AppCompatActivity {
    private Button btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        btn10 = (Button) findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(TenthActivity.this , ElevenActivity.class);
                ////启动
                startActivity(i);
            }
        });
    }
}
