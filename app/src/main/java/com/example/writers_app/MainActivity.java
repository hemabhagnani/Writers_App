package com.example.writers_app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] ={"hema","amit","dipisha","muskan","riya"};
    String mDescription[]={"gfgtr","gfgtr","gfgtr","gfgtr","gfgtr"};
int image[]={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);

        MyAdapter adapter=new MyAdapter(this,mTitle,mDescription,image);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String>{
        Context context;
                String rTitle[];
        String rDescription[];
        int rImage[];

        MyAdapter(Context c,String title[],String description[],int image[]){
            super(c,R.layout.row,R.id.textview1,title);
            this.context=c;
            this.rTitle=title;
            this.rDescription=description;
            this.rImage=image;
        }

        @NonNull
        @Override

        public  View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent){
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row,parent,false);
            ImageView image=row.findViewById(R.id.image);
            TextView myTitle=row.findViewById(R.id.textview1);
            TextView mydescription=row.findViewById(R.id.textview2);

            image.setImageResource(rImage[position]);
            myTitle.setText(rTitle[position]);
            mydescription.setText(rDescription[position]);

            return row;

        }
    }


}