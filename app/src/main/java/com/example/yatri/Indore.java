package com.example.yatri;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Indore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indore);


        final ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("one", "lutti", R.drawable.travel));
        words.add(new Object("two", "otiiko", R.drawable.travel));
        words.add(new Object("three", "tolookosu", R.drawable.travel));
        words.add(new Object("four", "oyyisa", R.drawable.travel));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);


    }
}