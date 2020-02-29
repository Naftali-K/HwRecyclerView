package com.android.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ShortList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_list);

        RecyclerView recyclerView = findViewById(R.id.recycle_view);

        ContactAdapter adapter = new ContactAdapter("short");
        recyclerView.setAdapter(adapter);
    }
}
