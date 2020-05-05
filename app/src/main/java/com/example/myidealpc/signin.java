package com.example.myidealpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.reflect.Member;

import javax.security.auth.callback.PasswordCallback;

public class signin extends AppCompatActivity {
    EditText fullname,pass,cpass,usrname;
    Button signin;
    DatabaseReference reff;
    member member;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        fullname=(EditText)findViewById(R.id.fullname);
        pass=(EditText)findViewById(R.id.pass);
        cpass=(EditText)findViewById(R.id.cpass);
        usrname=(EditText)findViewById(R.id.usrname);
        signin=(Button)findViewById(R.id.signin);
        member=new member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                member.setFullname(fullname.getText().toString().trim());
                member.setUsrname(usrname.getText().toString().trim());
                member.setPass(pass.getText().toString().trim());
                member.setCpass(cpass.getText().toString().trim());
                reff.push().setValue(member);
                Toast.makeText(signin.this,"data inserted successfully",Toast.LENGTH_LONG).show();


            }



        });



    }
}
