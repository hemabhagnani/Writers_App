package com.example.writers_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text=(TextView)findViewById(R.id.t1);
        Bundle b1=getIntent().getExtras();
        String str=b1.getString("key");
        text.setText(str);
    }

    public void go_back(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}