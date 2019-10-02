package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.PrintStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a=0;
    public void add(View view){
        a=a+1;
        displayForRed(String.format("%04d", a));

    }
    public void displayForRed(String point) {
        TextView scoreView = (TextView) findViewById(R.id.Num);
        scoreView.setText(String.valueOf(point));
    }
}
