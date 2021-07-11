package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
public class MyAdapter extends ArrayAdapter<Fruit> {
    Context context;
    int resourceId;
    public MyAdapter(@NonNull Context context, int resource, ArrayList<Fruit> objects) {
        super(context, resource,objects);
        this.context=context;
        this.resourceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit f=getItem(position);
        View v= LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView iv=v.findViewById(R.id.imageView);
        TextView tv=v.findViewById(R.id.textView);
        tv.setText(f.getFruitName());
        iv.setImageResource(f.getFruitImageId());
        return v;
    }
}
