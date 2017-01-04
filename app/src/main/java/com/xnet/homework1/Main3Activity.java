package com.xnet.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    EditText mEditLines;
    TextView tViewLines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mEditLines = (EditText) findViewById(R.id.editTextLines);
        tViewLines = (TextView) findViewById(R.id.textViewLines);
    }

    public void showLines(View v){
        int lines = Integer.parseInt(mEditLines.getText().toString());
        for (int i=0; i<lines; i++){
            tViewLines.append("Linea " + (i+1) + "\n");
        }
    }
}
