package com.example.learnlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private final int numData = 20;
    String[] mData = new String[numData];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        RecyclerView recyclerView = findViewById(R.id.recycle_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        CustomAdapter customAdapter = new CustomAdapter(mData);
        recyclerView.setAdapter(customAdapter);

    }

    private void setData() {
        for (int i = 0; i < numData; i++) {
            mData[i] = "Hello title: " + i;
        }
    }
}