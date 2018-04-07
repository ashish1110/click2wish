package com.example.pavilion.click2wish;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Pavilion on 11-11-2017.
 */

class MyAdapter extends ArrayAdapter<food>
{

    ArrayList<food> f=new ArrayList<>();
    public MyAdapter(Context context, int resource, ArrayList<food> objects) {
        super(context, resource,objects);
        f=objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        LayoutInflater lff=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v= lff.inflate(R.layout.images,null);
        TextView t=(TextView)v.findViewById(R.id.t);
        ImageView i=(ImageView)v.findViewById(R.id.i);
        TextView t2=(TextView)v.findViewById(R.id.t2);
        t.setText(f.get(position).getFoodname());
        i.setImageResource(f.get(position).getImageid());
        return v;
    }

}
