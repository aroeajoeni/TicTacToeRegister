package com.example.tictactoeregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    TextView display1;
    TextView display2;

    String stvincent1;
    String stvincent2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        display1 = (TextView)findViewById(R.id.displayName);
        display2 = (TextView)findViewById(R.id.displayName2);

        stvincent1 = getIntent().getExtras().getString("Value");
        stvincent2 = getIntent().getExtras().getString("Value2");

        display1.setText(stvincent1);
        display2.setText(stvincent2);



    }
}
