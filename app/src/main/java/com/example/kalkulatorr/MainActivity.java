package com.example.kalkulatorr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText firstNum, secNum;
    Button plus, minus, bagi, kali, clear;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum=(EditText) findViewById(R.id.firstNum);
        secNum=(EditText) findViewById(R.id.secNum);
        plus=(Button) findViewById(R.id.plus);
        minus=(Button) findViewById(R.id.minus);
        bagi=(Button) findViewById(R.id.bagi);
        kali=(Button) findViewById(R.id.kali);
        clear=(Button) findViewById(R.id.clear);
        result=(TextView) findViewById(R.id.hasil);

        plus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               if ((firstNum.getText().length()>0) && (secNum.getText().length()>0))
               {
                   double angka1 = Double.parseDouble(firstNum.getText().toString());
                   double angka2 = Double.parseDouble(secNum.getText().toString());
                   double hasil = angka1 + angka2;
                   result.setText(Double.toString(hasil));
               }
               else
               {
                   Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua"
                   , Toast.LENGTH_LONG);
                   toast.show();
               }
            }
        });

        minus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if ((firstNum.getText().length()>0) && (secNum.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(firstNum.getText().toString());
                    double angka2 = Double.parseDouble(secNum.getText().toString());
                    double hasil= angka1 - angka2;
                    result.setText(Double.toString(hasil));
                }
                else
                {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua"
                            , Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if ((firstNum.getText().length()>0) && (secNum.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(firstNum.getText().toString());
                    double angka2 = Double.parseDouble(secNum.getText().toString());
                    double hasil= angka1 / angka2;
                    result.setText(Double.toString(hasil));
                }
                else
                {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua"
                            , Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if ((firstNum.getText().length()>0) && (secNum.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(firstNum.getText().toString());
                    double angka2 = Double.parseDouble(secNum.getText().toString());
                    double hasil= angka1 * angka2;
                    result.setText(Double.toString(hasil));
                }
                else
                {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan angka pertama dan kedua"
                            , Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum.setText("");
                secNum.setText("");
                result.setText("0");
                firstNum.requestFocus();
            }
        });
    }
}