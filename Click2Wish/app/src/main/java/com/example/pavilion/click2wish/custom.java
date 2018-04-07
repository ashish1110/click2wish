package com.example.pavilion.click2wish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class custom extends AppCompatActivity {
    ListView l;
    ArrayList<food> f=new ArrayList<>();
    int Totalamount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        l=(ListView)findViewById(R.id.l1);



        f.add(new food("Guitar Cake",R.drawable.cc1,1200));

        f.add(new food("Snooker Cake",R.drawable.cc2,950));
       
        f.add(new food("Camera Cake",R.drawable.cc3,500));

        f.add(new food("MAC MakeupKit Cake",R.drawable.cc4,700));
        MyAdapter ma=new MyAdapter(this,R.layout.images,f);
        l.setAdapter(ma);
         }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(custom.this,cakes.class);
        startActivity(i);
        finish();
    }

    }

