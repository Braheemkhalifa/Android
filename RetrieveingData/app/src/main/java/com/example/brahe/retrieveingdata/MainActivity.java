package com.example.brahe.retrieveingdata;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Name , Age , Email ;
    Button SaveBtn;

    String LName , LEmail , LAge;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = (EditText) findViewById(R.id.Name);
        Age = (EditText) findViewById(R.id.Age);
        Email = (EditText) findViewById(R.id.Email);

        SaveBtn = (Button) findViewById(R.id.SaveBtn);
        final TextView SavedMessage = (TextView) findViewById(R.id.textView);




        SharedPreferences Preference = PreferenceManager.getDefaultSharedPreferences(this);

        String NLName = Preference.getString("Name","");
        Name.setText(""+NLName);

        String NLAge = Preference.getString("Age","");
        Age.setText(""+NLAge);

        String NLEmail = Preference.getString("Email","");
        Email.setText(""+NLEmail);

        SaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LName = Name.getText().toString();
                LAge = Age.getText().toString();
                LEmail = Email.getText().toString();

                SharedPreferences Preference = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                SharedPreferences.Editor editor = Preference.edit();
                editor.putString("Name",LName);
                editor.putString("Age",LAge);
                editor.putString("Email",LEmail);
                editor.apply();

                SavedMessage.setText("Your Data Saved");
            }
        });
    }
}
