package com.example.work1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.PipedInputStream;
import java.text.DecimalFormat;

public class CalCir extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcir_layout);
        Intent intent = getIntent();
        int r = intent.getIntExtra("R",0);
        double C = 3.141592654*2*r;
        double S = 3.141592654*r*r;
        TextView textView1 = findViewById(R.id.t3);
        DecimalFormat df = new DecimalFormat("#.0000");
        CharSequence c=String.valueOf(df.format(C));
        textView1.setText(c);
        TextView textView2 = findViewById(R.id.t4);
        CharSequence s=String.valueOf(df.format(S));
        textView2.setText(s);
    }
}
