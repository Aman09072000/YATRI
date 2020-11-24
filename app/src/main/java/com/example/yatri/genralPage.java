package com.example.yatri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class genralPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genral_page);

        EditText name1 = (EditText) findViewById(R.id.name)  ;
        String name = name1.getText().toString();
        EditText city1 = (EditText)findViewById(R.id.city)  ;
        String city = city1.getText().toString();

        TextView destination = (TextView)findViewById(R.id.cityEntry);
        destination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(genralPage.this,allCityPage.class);
                if(name != null && city != null){

                startActivity(i);}
                else{
                    Toast.makeText(genralPage.this, "Please Fill Name or City Entry.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}