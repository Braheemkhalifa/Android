package com.example.brahe.loginscreen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_log_in);

        final EditText LName = (EditText) findViewById(R.id.LName);
        final EditText LPass = (EditText) findViewById(R.id.LPassword);
        Button SignUpBtn = (Button) findViewById(R.id.SignUpBtn);
        Button LogInBtn = (Button) findViewById(R.id.LogInBtn);



     


        LogInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Name = LName.getText().toString();
                String Pass = LPass.getText().toString();


                SharedPreferences preferences = getSharedPreferences("Mypreps",MODE_PRIVATE);

                String userData = preferences.getString(Name + Pass + "data","UserName or Password Is Wrong");

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString( "Display" , userData);
                editor.commit();

                Intent DisplayScreen = new Intent(LogInActivity.this,DisplayScreen.class);
                startActivity(DisplayScreen);

            }
        });

        SignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent RegistScreen = new Intent(LogInActivity.this,Register.class);
                startActivity(RegistScreen);


            }
        });

    }
}
