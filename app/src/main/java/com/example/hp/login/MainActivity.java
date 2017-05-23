package com.example.hp.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button log, sign;
    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log = (Button) findViewById(R.id.loginbutton);
        sign = (Button) findViewById(R.id.signbutton);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
    }
    public void onClick(View v){
        String email1 = email.getText().toString();
        String pass = password.getText().toString();

    }

}
