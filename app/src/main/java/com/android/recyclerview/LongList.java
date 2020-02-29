package com.android.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class LongList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_list);

        RecyclerView recyclerView = findViewById(R.id.recycle_view); // connecting to view

        ContactAdapter adapter = new ContactAdapter("long");
        recyclerView.setAdapter(adapter);

    }
}
