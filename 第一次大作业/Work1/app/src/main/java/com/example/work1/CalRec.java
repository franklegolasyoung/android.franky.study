package com.example.work1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalRec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_rec);
        Intent intent = getIntent();
        int a = intent.getIntExtra("A",0);
        int b = intent.getIntExtra("B",0);
        int C = 2*(a+b);
        int S = a*b;
        TextView textView1 = findViewById(R.id.t3);
        CharSequence c=String.valueOf(C);
        textView1.setText(c);
        TextView textView2 = findViewById(R.id.t4);
        CharSequence s=String.valueOf(S);
        textView2.setText(s);
    }
}
