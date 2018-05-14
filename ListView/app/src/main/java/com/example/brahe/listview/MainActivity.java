package com.example.brahe.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate: Started");
        ListView List = (ListView) findViewById(R.id.MainList);

        Person Khalifa = new Person("Khalifa","21-06-1996","Male");
        Person Khalifa1 = new Person("Khalifa","21-06-1996","Male");
        Person Khalifa2 = new Person("Khalifa","21-06-1996","Male");
        Person Khalifa3 = new Person("Khalifa","21-06-1996","Male");
        Person Khalifa4 = new Person("Khalifa","21-06-1996","Male");
        Person Khalifa5 = new Person("Khalifa","21-06-1996","Male");
        Person Khalifa6 = new Person("Khalifa","21-06-1996","Male");
        Person Khalifa7 = new Person("Khalifa","21-06-1996","Male");
        Person Khalifa8 = new Person("Khalifa","21-06-1996","Male");
        Person Khalifa9 = new Person("Khalifa","21-06-1996","Male");
        Person Khalifa10 = new Person("Khalifa","21-06-1996","Male");


        ArrayList<Person> PeopleList = new ArrayList<>();
        PeopleList.add(Khalifa);
        PeopleList.add(Khalifa1);
        PeopleList.add(Khalifa2);
        PeopleList.add(Khalifa3);
        PeopleList.add(Khalifa4);
        PeopleList.add(Khalifa5);
        PeopleList.add(Khalifa6);
        PeopleList.add(Khalifa7);
        PeopleList.add(Khalifa8);
        PeopleList.add(Khalifa9);
        PeopleList.add(Khalifa10);

        PersonListAdapter adapter = new PersonListAdapter(this,R.layout.adapter_view,PeopleList);
        List.setAdapter(adapter);
    }
}
