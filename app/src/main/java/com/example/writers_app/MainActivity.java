package com.example.writers_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        Intent i=new Intent(this,second.class);
        String[] names = {"hema","amit","riya","muskan","dipisha"};
        Random random=new Random();
        int pos=random.nextInt(names.length);
        i.putExtra("key",names[pos]);
        startActivity(i);

    }
}