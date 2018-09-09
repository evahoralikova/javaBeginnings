package com.example.evaho.myapplication.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        TextView textView = findViewById(R.id.myText);
        if(textView.getText().equals("Hello World!")){
            textView.setText("Ahoj");
        }
        else {
            textView.setText("Hello World!");
        }


    }
}
