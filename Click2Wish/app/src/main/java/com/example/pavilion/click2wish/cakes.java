package com.example.pavilion.click2wish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class cakes extends AppCompatActivity {

   Button b;
    ImageView i1,i2,i3,i4,i5;
    CheckBox c1,c2,c3,c4,c5;
    StringBuilder s=new StringBuilder();
    public int Totalamount=0;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.i1:
                Toast.makeText(getApplicationContext(),"Wedding Cakes selected",Toast.LENGTH_SHORT).show();
                Intent itt=new Intent(this,wedding.class);
                startActivity(itt);
                finish();break;
            case R.id.i2:
                Toast.makeText(getApplicationContext(),"Customized Cakes Selected",Toast.LENGTH_SHORT).show();
                Intent in=new Intent(this,custom.class);
                startActivity(in);
                finish();break;
            case R.id.i3:
                Toast.makeText(getApplicationContext(),"Carton Cakes selected",Toast.LENGTH_SHORT).show();
                Intent it=new Intent(this,cartoon.class);
                startActivity(it);
                finish();break;
            case R.id.i4:
                //Toast.makeText(getApplicationContext(),"LogOut selected",Toast.LENGTH_SHORT).show();
                Intent it1=new Intent(this,login.class);
                startActivity(it1);
                finish();break;

        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakes);
       b=(Button)findViewById(R.id.b);
        i1=(ImageView)findViewById(R.id.iv1);
        c1=(CheckBox)findViewById(R.id.c1);
        i2=(ImageView)findViewById(R.id.iv2);
        c2=(CheckBox)findViewById(R.id.c2);
        i3=(ImageView)findViewById(R.id.iv3);
        c3=(CheckBox)findViewById(R.id.c3);
        i4=(ImageView)findViewById(R.id.iv4);
        c4=(CheckBox)findViewById(R.id.c4);
        i5=(ImageView)findViewById(R.id.iv5);
        c5=(CheckBox)findViewById(R.id.c5);

        i1.setImageResource(R.drawable.rv2);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked==true)
                {
                    Totalamount+=600;
                    Toast.makeText(getApplicationContext(),"Red Velvet Cake 600Rs.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        i2.setImageResource(R.drawable.vanilla);
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked==true)
                {
                    Totalamount+=400;
                    Toast.makeText(getApplicationContext(),"Vanilla Cake 400Rs.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        i3.setImageResource(R.drawable.pa);
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked==true)
                {
                    Totalamount+=350;
                    Toast.makeText(getApplicationContext(),"pineapple Cake 350Rs.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        i4.setImageResource(R.drawable.choc);
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked==true)
                {
                    Totalamount+=550;
                    Toast.makeText(getApplicationContext(),"Chocolate Cake 550Rs.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        i5.setImageResource(R.drawable.bs);
        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked==true)
                {
                    Totalamount+=650;
                    Toast.makeText(getApplicationContext(),"Butterscotch Cake 6050Rs.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s.append("total= Rs."+Totalamount);
                Toast.makeText(getApplicationContext(),s.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
