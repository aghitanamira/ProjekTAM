package com.example.weread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.weread.ui.Home.HomeFragment;
import com.google.android.material.textfield.TextInputLayout;

public class SignUp extends AppCompatActivity {

    Button callSignUp, login_btn;
    ImageView image;
    TextInputLayout username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        callSignUp = findViewById(R.id.signup_screen);
        image = findViewById(R.id.logoImage);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login_btn = findViewById(R.id.login_btn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logIn = new Intent(SignUp.this, Login.class);
                startActivity(logIn);
            }
        });

        callSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUp = new Intent(SignUp.this, HomeFragment.class);
                startActivity(signUp);
            }
        });

    }
}