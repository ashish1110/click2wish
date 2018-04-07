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

public class wedding extends AppCompatActivity {

    ListView l;
    ArrayList<food> f=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding);
        l=(ListView)findViewById(R.id.l1);

        f.add(new food("Gold Peach Cake",R.drawable.wc1,800));
        f.add(new food("Ruffle Cake",R.drawable.wc2,1100));
        f.add(new food("Engagement Cake",R.drawable.wc3,700));
        f.add(new food("Stripes Cake",R.drawable.wc4,950));
        f.add(new food("Ring Cake",R.drawable.wc5,1000));

        MyAdapter ma=new MyAdapter(this,R.layout.images,f);
        l.setAdapter(ma);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(wedding.this,cakes.class);
        startActivity(i);
        finish();
    }
}
