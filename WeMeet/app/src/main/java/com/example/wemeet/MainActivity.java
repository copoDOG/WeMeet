package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnadd1, btnadd2, btnadd3, btnadd4, btnadd5;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logo1);
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnadd1 = (Button) findViewById(R.id.BtnAdd1);
        btnadd2 = (Button) findViewById(R.id.BtnAdd2);
        btnadd3 = (Button) findViewById(R.id.BtnAdd3);
        btnadd4 = (Button) findViewById(R.id.BtnAdd4);
        btnadd5 = (Button) findViewById(R.id.BtnAdd5);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnadd1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                //num1이나 .num2가 비어 있다면
                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnadd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnadd3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnadd4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT).show();
                } else {
                    //num2 가 0이면 나누지 않는다.
                    if (num2.trim().equals("0")) {
                        Toast.makeText(getApplicationContext(), "0으로 나누면 안됩니다!", Toast.LENGTH_SHORT).show();
                    } else {
                        result = Double.parseDouble(num1) / Double.parseDouble(num2);
                        result = (int) (result * 10) / 10.0; // 소수점 아래 1자리까지만 출력
                        textResult.setText("계산 결과 : " + result.toString(result));
                    }
                }
            }
        });

        btnadd5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT).show();
                } else {
                    //num2 가 0이면 나누지 않는다.
                    if (num2.trim().equals("0")) {
                        Toast.makeText(getApplicationContext(), "0으로 나머지 값이 안됩니다!", Toast.LENGTH_SHORT).show();
                    } else {
                        result = Double.parseDouble(num1) % Double.parseDouble(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            }
        });
    }