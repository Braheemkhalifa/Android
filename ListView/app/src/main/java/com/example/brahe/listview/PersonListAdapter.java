package com.example.brahe.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class PersonListAdapter extends ArrayAdapter<Person> {
    private static final String TAG = "PersonListAdapter";
    private  Context mContext ;
    int mresource;

    public PersonListAdapter(Context context, int resource, ArrayList<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mresource =resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
          //GET person InFormation
        String Name = getItem(position).getName();
        String Birthday = getItem(position).getBirthday();
        String Sex = getItem(position).getSex();


        //create the person object with information
        Person person = new Person(Name,Birthday,Sex);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mresource,parent,false);


        TextView RName = (TextView) convertView.findViewById(R.id.textView);
        TextView RBirthday = (TextView) convertView.findViewById(R.id.textView2);
        TextView RSex = (TextView) convertView.findViewById(R.id.textView3);

        RName.setText(Name);
        RBirthday.setText(Birthday);
        RSex.setText(Sex);

        return convertView;
    }
}
