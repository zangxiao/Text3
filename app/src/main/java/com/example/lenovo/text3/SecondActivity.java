package com.example.lenovo.text3;





import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    private TextView getInt;
    private TextView getString;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        getInt = (TextView)findViewById(R.id.getInt);
        getString = (TextView)findViewById(R.id.getString);
        Intent intent = getIntent();
        String Name = intent.getStringExtra("NAME");
        int int_get =
                intent.getIntExtra("Int",0);
        getInt.setText(""+int_get);
        getString.setText(Name);

    }
}


