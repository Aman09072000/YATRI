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
        words.add(new Object("Lal Bagh Palace", "2 km\n" +
                "from city center", R.drawable.indore1));
        words.add(new Object("Rajwaada Palace", "0 km\n" +
                "from city center", R.drawable.indore2));
        words.add(new Object("Bada Ganpati", "2 km\n" +
                "from city center", R.drawable.indore3));
        words.add(new Object("Chhappan Dukaan", "3 km\n" +
                "from city center", R.drawable.indore4));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);


    }
}