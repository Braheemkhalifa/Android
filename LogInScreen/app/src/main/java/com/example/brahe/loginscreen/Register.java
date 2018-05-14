package com.example.brahe.loginscreen;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final EditText RName = (EditText) findViewById(R.id.RName);
        final EditText RPass = (EditText) findViewById(R.id.RPassword);
        final EditText RMail = (EditText) findViewById(R.id.REmail);
        Button RegisterBtn = (Button) findViewById(R.id.RegisterBtn);


        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences preferences = getSharedPreferences("Mypreps",MODE_PRIVATE);

                String newName = RName.getText().toString();
                String newPass = RPass.getText().toString();
                String newEmail = RMail.getText().toString();


                SharedPreferences.Editor editor = preferences.edit();

                editor.putString(newName + newPass + "data" , newName + "\n" + newEmail);
                editor.commit();

                Intent LoginScreen = new Intent(Register.this,LogInActivity.class);
                startActivity(LoginScreen);

            }
        });
    }


}



