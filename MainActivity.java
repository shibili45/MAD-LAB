package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText e1,e2;
    private Button a,s,m,d;
    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.n1);
        e2=(EditText) findViewById(R.id.n2);
        a=(Button) findViewById(R.id.add);
        s=(Button) findViewById(R.id.sub);
        m=(Button) findViewById(R.id.mul);
        d=(Button) findViewById(R.id.div);
        t=(TextView) findViewById(R.id.res);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(e1.getText().toString());
                int num2 =Integer.parseInt(e2.getText().toString());
                int sum=num1+num2;
                t.setText(Integer.toString(sum));
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 =Integer.parseInt(e1.getText().toString());
                int num2 =Integer.parseInt(e2.getText().toString());
                int diff=num1-num2;
                t.setText(Integer.toString(diff));

            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 =Integer.parseInt(e1.getText().toString());
                int num2 =Integer.parseInt(e2.getText().toString());
                int sum=num1/num2;
                t.setText(Integer.toString(sum));

            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 =Integer.parseInt(e1.getText().toString());
                int num2 =Integer.parseInt(e2.getText().toString());
                int sum=num1*num2;
                t.setText(Integer.toString(sum));

            }
        });

    }
}
