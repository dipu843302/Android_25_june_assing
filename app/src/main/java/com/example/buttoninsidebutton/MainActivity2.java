package com.example.buttoninsidebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView startbtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        startbtn2=findViewById(R.id.startbtn2);
        startbtn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent categoryIntent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(categoryIntent);
                finish();
            }
        });

    }

}