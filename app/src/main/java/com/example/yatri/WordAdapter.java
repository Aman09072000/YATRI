package com.example.yatri;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
public class WordAdapter extends ArrayAdapter<Object> {

    public WordAdapter(@NonNull Context context, ArrayList<Object> words) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.mylayout, parent, false);
        }

        Object currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.textView1);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.textView2);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView icon = (ImageView)listItemView.findViewById(R.id.imageView);

            icon.setImageResource(currentWord.getmIcon());

//...............................................................................


        return listItemView;
    }
}
