package com.example.search;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EigthActivity extends AppCompatActivity {
    private Button btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eigth);
        btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent( EigthActivity.this , TenthActivity.class);
                ////启动
                startActivity(i);
            }
        });
    }
}
