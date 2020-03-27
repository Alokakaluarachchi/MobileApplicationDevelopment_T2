package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    Button Add_button;
    Button Sub_button;
    Button Mul_button;
    Button Div_button;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number1=(EditText) findViewById(R.id.No11);
        number2=(EditText) findViewById(R.id.No22);
        Add_button=(Button) findViewById(R.id.butadd);
        Sub_button=(Button) findViewById(R.id.btnsub);
        Mul_button=(Button) findViewById(R.id.btnmul);
        Div_button=(Button) findViewById(R.id.btndiv);

        result =  (TextView) findViewById(R.id.textView3);

        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                String x =" + ";
                String y =" = ";
                double sum = num1 + num2;

                result.setText(Double.toString(num2)+x+Double.toString(num1)+y+Double.toString(sum));
            }
        });

        Sub_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                double sum = num2 - num1;
                String x =" - ";
                String y =" = ";

                result.setText(Double.toString(num2)+x+Double.toString(num1)+y+ Double.toString(sum));
            }
        });

        Mul_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                double sum = num1 * num2;
                String x =" * ";
                String y =" = ";

                result.setText(Double.toString(num2)+x+Double.toString(num1)+y+Double.toString(sum));
            }
        });

        Div_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                double sum = num2 / num1;
                String x =" / ";
                String y =" = ";
                result.setText(Double.toString(num2)+x+Double.toString(num1)+y+Double.toString(sum));
            }
        });

    }


}