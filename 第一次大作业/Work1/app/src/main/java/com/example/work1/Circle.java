package com.example.work1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Circle extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        Button button1 = findViewById(R.id.button_3);
        final EditText editText = findViewById(R.id.edit_text);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String serch_textip=editText.getText().toString().trim();
                if(serch_textip.length()==0)
                {Toast.makeText(Circle.this,"请输入半径", Toast.LENGTH_LONG).show();}
                else {
                    Intent intent = new Intent(Circle.this, CalCir.class);
                    int inputText = Integer.parseInt(editText.getText().toString());
                    intent.putExtra("R", inputText);
                    startActivity(intent);
                }
            }
        });
    }
}
