package com.example.myidealpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // Intent intent = new Intent(LoginActivity.this,signin.class);
        //startActivity(intent);
        //finish();
        Toast.makeText(LoginActivity.this,"Firebase connection successfull",Toast.LENGTH_LONG).show();
    }
}
