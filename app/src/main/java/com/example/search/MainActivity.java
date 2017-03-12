package com.example.search;
import android.content.Intent;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;

;
public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private  RadioGroup rd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button1);
        rd1=(RadioGroup)findViewById(R.id.gr1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int len = rd1.getChildCount(); // 获得单选按钮组的选项个数
                String msgString = ""; // 给选中的选项值赋值用的，初始化为空
                for (int i = 0; i < len; i++) {
                    CheckBox checkBox = (CheckBox) rd1.getChildAt(i); // 返回Group里的指定位置的视图(也就是按钮了)。
            /*
             * 查看android api 文档RadioButton的 public boolean isChecked
             * ()方法 如果未找到这个方法，往父类上找到，这个方法是用检测是否按钮被选中
             */
                    if (checkBox.isChecked()) {
                        msgString = checkBox.getText().toString();
                        break;
                    }
                }

                Intent i = new Intent(MainActivity.this , SecondActivity.class);
                ////启动
                startActivity(i);
            }
        });
    }

}