package com.example.gauranggoel.assignment1onet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.editText);
        btn= (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(e1.getText().toString().equals("")))
                {

                    int num=Integer.parseInt(e1.getText().toString());

                     int n=num;
                   int y=0;

                    while(n!=0)
                    {
                        y++;
                        n/=10;
                    }
                    if(y>4) {
                        e1.setError("enter max  4 digit number");
                        e1.setText("");
                    }
                    else {

                        if (num % 2 == 0) {
                            Toast.makeText(MainActivity.this, "Welcome to Delhi, your vehical number is"+num, Toast.LENGTH_LONG).show();
                            e1.setText("");
                        }
                        else {
                            Toast.makeText(MainActivity.this, "beta mat ana , your vehical number is"+num, Toast.LENGTH_LONG).show();
                            e1.setText("");
                        }
                    }
                }
                else {
                    e1.setError("enter vehical last 4 digit");
                }
                }
        });
    }
}


/*
*here we need to check whether vehical number is odd or not
* now:- we need to make calculator:- two ET and 4 button +,-,/,* and output will be in toast
* make game using random class :- score 0, attempt 0
                                  ET enter your number between 1,10
                                  ET random number
                                  button on click:- if number is same then score is ++ and attemp ++
                                  if score is not same then only attempt++;

*/