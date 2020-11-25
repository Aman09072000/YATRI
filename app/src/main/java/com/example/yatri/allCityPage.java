package com.example.yatri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class allCityPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_city_page);


        LinearLayout mumbai = (LinearLayout) findViewById(R.id.mumbai);
        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(allCityPage.this,Mumbai.class);
                startActivity(intent);
            }
        });


        LinearLayout indore = (LinearLayout) findViewById(R.id.indore);
        indore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(allCityPage.this,Indore.class);
                startActivity(intent);
            }
        });

        LinearLayout k = (LinearLayout) findViewById(R.id.kerala);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(allCityPage.this,Kerala.class);
                startActivity(intent);
            }
        });

        LinearLayout u = (LinearLayout) findViewById(R.id.ujjain);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(allCityPage.this,Ujjain.class);
                startActivity(intent);
            }
        });


        TextView suggestion = (TextView)findViewById(R.id.suggestion);
        suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(allCityPage.this,SuggestionPage.class);
                startActivity(intent);
            }
        });



    }


}