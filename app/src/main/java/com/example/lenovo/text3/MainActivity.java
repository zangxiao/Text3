package com.example.lenovo.text3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button jumpBut;
    private EditText editText1;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jumpBut = (Button)findViewById(R.id.LoginBut);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        jumpBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_temp = editText1.getText().toString();
                int int_temp = Integer.parseInt(editText2.getText().toString());
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("NAME",str_temp);
                intent.putExtra("Int",int_temp);
                startActivity(intent);
            }
        });
    }
}


