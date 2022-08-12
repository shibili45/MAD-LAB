package com.example.regindent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class addition extends AppCompatActivity {
  private EditText t1, t2;
   private Button b;
   private TextView z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);



        t1 = (EditText) findViewById(R.id.num1);
        t2 = (EditText) findViewById(R.id.num2);
        b = (Button) findViewById(R.id.button);
        z = (TextView) findViewById(R.id.x);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(t1));
                int num2 = Integer.parseInt(String.valueOf(t2));
                int summ=num1+num2;
                t1.setText(String.valueOf(summ));
            }
        });

    }}
