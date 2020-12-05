package com.example.yatri;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Mumbai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);


        final ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("Marine Drive", "Located in : Fort Mumbai", R.drawable.mumbai));
        words.add(new Object("Gateway of India", "Located in : Fort Mumbai", R.drawable.mumbai2));
        words.add(new Object("Juhu beach", "Located in : Juhu", R.drawable.mumbai3));
        words.add(new Object("Colaba Causeway", "Located in : Colaba", R.drawable.mumbai4));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);
    }
}