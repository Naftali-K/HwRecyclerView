package com.android.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnLong);
        btn2 = findViewById(R.id.btnShort);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTo("LongList");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTo("ShortList");
            }
        });
    }

    public void moveTo(String address){

        Intent intent = null;
        switch (address){
            case "LongList":
                intent = new Intent(MainActivity.this, LongList.class);
                startActivity(intent);
                break;
            case "ShortList":
                intent = new Intent(MainActivity.this, ShortList.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(MainActivity.this, "Error, try again!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
