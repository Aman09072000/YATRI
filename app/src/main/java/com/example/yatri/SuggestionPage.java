package com.example.yatri;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SuggestionPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion_page);

        EditText c = (EditText)findViewById(R.id.cityn);
        String cityname = c.getText().toString();

        EditText p = (EditText)findViewById(R.id.placen);
        String placename = p.getText().toString();

        TextView click = (TextView)findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cityname != placename){
                    Toast.makeText(SuggestionPage.this, "Your City is added soon.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SuggestionPage.this, "Fill both entry Correctly.", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}