package com.example.search;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SixthActivity extends AppCompatActivity {
    private Button btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(SixthActivity.this , SeventhActivity.class);
                ////启动
                startActivity(i);
            }
        });
    }
}
