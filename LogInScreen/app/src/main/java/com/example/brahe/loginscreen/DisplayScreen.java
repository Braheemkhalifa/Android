package com.example.brahe.loginscreen;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayinfo);


        SharedPreferences preferences = getSharedPreferences("Mypreps",MODE_PRIVATE);
        String Display = preferences.getString("Display","");

        TextView TextInfo = (TextView) findViewById(R.id.TextInfo);
        TextInfo.setText(Display);
    }
}
