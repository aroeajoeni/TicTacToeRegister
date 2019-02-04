package com.example.tictactoeregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //https://www.youtube.com/watch?v=ZKseZ1IK62c

    Button btn; //the submit button
    EditText etName1; //where you request the user name
    EditText etName2;
    String michaeljackson;
    String britneyspears;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        etName1 = (EditText)findViewById(R.id.etName1);
        etName2 = (EditText)findViewById(R.id.etName2);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent ladygaga = new Intent(MainActivity.this, Display.class);


               michaeljackson = etName1.getText().toString();
               ladygaga.putExtra("Value", michaeljackson);


               britneyspears = etName2.getText().toString();
               ladygaga.putExtra("Value2", britneyspears);



               startActivity(ladygaga);
               finish();

            }
        });











    }
}
