package com.example.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class News1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news1);

        Intent intent = getIntent();//传递
        String name = intent.getStringExtra("name");
        String time = intent.getStringExtra("time");
        String from = intent.getStringExtra("from");
        String text = intent.getStringExtra("text");
        Bitmap bitmap = intent.getParcelableExtra("bitmap");

        ImageView image = findViewById(R.id.news_image);//传递图片
        TextView sname = findViewById(R.id.news_name);//标题
        TextView stime = findViewById(R.id.news_time);//时间
        TextView sfrom = findViewById(R.id.news_from);//发布
        TextView stext = findViewById(R.id.news_text);//文案

        image.setImageBitmap(bitmap);
        sname.setText(name);
        stime.setText(time);
        sfrom.setText(from);
        stext.setText(text);
    }
}
