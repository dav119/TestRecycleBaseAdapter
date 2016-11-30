package com.example.user1.testrecyclebaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final int MY_OBJECT_SIZE = 10000;

    ArrayList<MyObject> myObjectArrayList;
    MyRecycleViewAdapter myAdapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myObjectArrayList = new ArrayList<>();
        fillMyObjectArrayList(myObjectArrayList);

        myAdapter = new MyRecycleViewAdapter(this, myObjectArrayList);

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void fillMyObjectArrayList(ArrayList<MyObject> myObjectArrayList) {
        Random random = new Random();

        for (int i = 0; i < MY_OBJECT_SIZE; i++) {
            myObjectArrayList.add(new MyObject("Name " + String.valueOf(i+1), "Surname "  + String.valueOf(i+1), random.nextBoolean()));
        }
    }
}
