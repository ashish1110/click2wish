package com.example.pavilion.click2wish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class cartoon extends AppCompatActivity {
    ListView l;
    ArrayList<food> f=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoon);
        l=(ListView)findViewById(R.id.l1);

        f.add(new food("Minions Cake",R.drawable.k1,500));
        f.add(new food("BarbieDoll Cake",R.drawable.k2,650));
        f.add(new food("HelloKitty Cake",R.drawable.k3,450));
        f.add(new food("Car Cake",R.drawable.k4,600));
        f.add(new food("Doraemon Cake",R.drawable.k5,450));

        MyAdapter ma=new MyAdapter(this,R.layout.images,f);
        l.setAdapter(ma);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(cartoon.this,cakes.class);
        startActivity(i);
        finish();
    }

}
