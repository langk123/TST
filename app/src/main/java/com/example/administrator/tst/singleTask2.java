package com.example.administrator.tst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/9/26.
 */

public class singleTask2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singletask_activity);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("singletask2");
        Button button = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(singleTask2.this,SingleTaskActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("singletask2","onnewintent");
    }

}
