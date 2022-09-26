package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.ph);
        e2=(EditText)findViewById(R.id.pass);
    }
    public void login(View view) {

        String usr = e1.getText().toString().trim();
        String psw = e2.getText().toString().trim();

        if (usr.equals("")) {
            Toast.makeText(this, "Enter phone or mail", Toast.LENGTH_SHORT).show();
        } else if (psw.equals("")) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        }

    else {
        Intent in=new Intent(this,Activity3.class);
        startActivity(in);
         }
    }
    public void create(View view){
        Intent crt=new Intent(this,Activity2.class);
        startActivity(crt);
    }
}
