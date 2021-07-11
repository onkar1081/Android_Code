package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Fruit> ar=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.mylist);

        Fruit f1=new Fruit();
        f1.setFruitName("Apple");
        f1.setFruitImageId(R.drawable.apple1);
        Fruit f2=new Fruit();
        f2.setFruitName("Mango");
        f2.setFruitImageId(R.drawable.mango3);
        Fruit f3=new Fruit();
        f3.setFruitName("Banana");
        f3.setFruitImageId(R.drawable.bananaimg);
        ar.add(f1);
        ar.add(f2);
        ar.add(f3);
        MyAdapter ad;
        ad=new MyAdapter(this,R.layout.listrow,ar);
        lv.setAdapter(ad);
    }
}