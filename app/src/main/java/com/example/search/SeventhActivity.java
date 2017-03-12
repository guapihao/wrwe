package com.example.search;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SeventhActivity extends AppCompatActivity {
    private Button btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(SeventhActivity.this , EigthActivity.class);
                ////启动
                startActivity(i);
            }
        });
    }
}
