package com.example.work1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Rectangle extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        Button button1 = findViewById(R.id.button_4);
        final EditText editText1 = findViewById(R.id.edit_text1);
        final EditText editText2 = findViewById(R.id.edit_text2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String serch_textip1=editText1.getText().toString().trim();
                String serch_textip2=editText2.getText().toString().trim();
                if(serch_textip1.length()==0)
                { Toast.makeText(Rectangle.this,"请输入长", Toast.LENGTH_LONG).show();}
                else if(serch_textip2.length()==0)
                { Toast.makeText(Rectangle.this,"请输入宽", Toast.LENGTH_LONG).show();}
                else {
                    Intent intent = new Intent(Rectangle.this, CalRec.class);
                    int inputText1 = Integer.parseInt(editText1.getText().toString());
                    int inputText2 = Integer.parseInt(editText2.getText().toString());
                    intent.putExtra("A", inputText1);
                    intent.putExtra("B", inputText2);
                    startActivity(intent);
                }
            }
        });
    }
}
