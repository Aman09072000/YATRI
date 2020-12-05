package com.example.yatri;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Kerala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);


        final ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("Munnar", "known as the 'Kashmir of South India'.\n" +
                "\n", R.drawable.kerala1));
        words.add(new Object("Alleppey", "Officially called Alappuzha", R.drawable.kearala2));
        words.add(new Object("Kochi ", " Called as the Queen of the Arabian Sea", R.drawable.kerala3));
        words.add(new Object(" Thekkady", "Home to the country's largest Tiger Reserve- Periyar,", R.drawable.kerala4));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);
    }
}