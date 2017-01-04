package com.xnet.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText mEdit1, mEdit2, mEdit3, mEdit4;
    Button nActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mEdit1 = (EditText) findViewById(R.id.editText1);
        mEdit2 = (EditText) findViewById(R.id.editText2);
        mEdit3 = (EditText) findViewById(R.id.editText3);
        mEdit4 = (EditText) findViewById(R.id.editText4);
        nActivity3 = (Button) findViewById(R.id.toActivity3);
        nActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });
    }

    public void calculate(View v){
        int value1 = Integer.parseInt(mEdit1.getText().toString());
        int value2 = Integer.parseInt(mEdit3.getText().toString());
        //char operatorValue =
        int result = 0;
        switch (mEdit2.getText().toString()) {
            case "+":  result = value1 + value2;
                break;
            case "-":  result = value1 - value2;
                break;
            case "*":  result = value1 * value2;
                break;
            case "/":  result = value1 / value2;
                break;
            default: result = 0;
                break;
        }
        mEdit4.setText(String.format(Integer.toString(result)));
    }
}
