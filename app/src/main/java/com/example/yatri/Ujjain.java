package com.example.yatri;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Ujjain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ujjain);


        final ArrayList<Object> words = new ArrayList<Object>();
        words.add(new Object("Mahakaleshwar", "2 km\n" +
                "from city center", R.drawable.ujjain1));
        words.add(new Object(" Kal Bhairav temple", "5 km\n" +
                "from city center", R.drawable.ujjain2));
        words.add(new Object("Ram Mandir Ghat", "2 km\n" +
                "from city center", R.drawable.ujjain3));
        words.add(new Object("Kumbh mela", "3 km\n" +
                "from city center", R.drawable.ujjain4));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_View);
        listView.setAdapter(itemsAdapter);
    }
}