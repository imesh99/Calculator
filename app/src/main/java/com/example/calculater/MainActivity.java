package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add;
    Button div;
    Button sub;
    Button mul;
    Button ac;
    Button pr;

    EditText num1;
    EditText num2;

    TextView out;
    double sum=0.0;
    double first,second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button) findViewById(R.id.add);
        div=(Button) findViewById(R.id.div);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        ac=(Button) findViewById(R.id.ac);
        pr=(Button) findViewById(R.id.pr);

        num1=(EditText) findViewById(R.id.fnum);
        num2=(EditText) findViewById(R.id.snum);

        out=(TextView) findViewById(R.id.out);



            //addition
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String a = num1.getText().toString();
                    first = Double.parseDouble(a);

                    String b = num2.getText().toString();
                    second = Double.parseDouble(b);
                    sum = first + second;
                    String outp = Double.toString(sum);
                    out.setText(outp);

                }
            });
            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String a = num1.getText().toString();
                    first = Double.parseDouble(a);

                    String b = num2.getText().toString();
                    second = Double.parseDouble(b);
                    sum = first - second;
                    String outp = Double.toString(sum);
                    out.setText(outp);
                }
            });
            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String a = num1.getText().toString();
                    first = Double.parseDouble(a);

                    String b = num2.getText().toString();
                    second = Double.parseDouble(b);
                    sum = first / second;
                    String outp = Double.toString(sum);
                    out.setText(outp);
                }
            });
            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String a = num1.getText().toString();
                    first = Double.parseDouble(a);

                    String b = num2.getText().toString();
                    second = Double.parseDouble(b);
                    sum = first * second;
                    String outp = Double.toString(sum);
                    out.setText(outp);
                }
            });

            pr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String a = num1.getText().toString();
                    first = Double.parseDouble(a);

                    String b = num2.getText().toString();
                    second = Double.parseDouble(b);
                    sum = first % second;
                    String outp = Double.toString(sum);
                    out.setText(outp);
                }
            });

            ac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1.setText("");
                    num2.setText("");
                    out.setText(" ");
                }
            });
            mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String a = num1.getText().toString();
                    first = Double.parseDouble(a);

                    String b = num2.getText().toString();
                    second = Double.parseDouble(b);
                    sum = first / second;
                    String outp = Double.toString(sum);
                    out.setText(outp);
                }

            });

    }
}