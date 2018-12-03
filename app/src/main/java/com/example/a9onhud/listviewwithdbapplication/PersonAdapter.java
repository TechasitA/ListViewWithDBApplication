package com.example.a9onhud.listviewwithdbapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class PersonAdapter extends ArrayAdapter<Person> {

    public PersonAdapter(Context context, int resource, List<Person> objects) {
        super(context, R.layout.item_row, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_row, null);

            Person person = getItem(position);

            TextView nameTw = convertView.findViewById(R.id.nameTw);
            TextView nicknameTw = convertView.findViewById(R.id.nicknameTw);
            TextView surnameTw = convertView.findViewById(R.id.surnameTw);

            nameTw.setText(person.getFirstName());
            nicknameTw.setText(person.getNickname());
            surnameTw.setText(person.getLastName());

        }

        return convertView;
    }
}
