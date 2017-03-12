package com.example.search;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ElevenActivity extends AppCompatActivity {
    private Button btn11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);
        btn11 = (Button) findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent( ElevenActivity.this , TwnthActivity.class);
                ////启动
                startActivity(i);
            }
        });
    }
}
