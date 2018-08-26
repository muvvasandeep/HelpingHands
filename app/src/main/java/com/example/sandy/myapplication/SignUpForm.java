package com.example.sandy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_form);
    }
    public void homePage(View view){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
}
