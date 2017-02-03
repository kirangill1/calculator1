package com.example.priyanka.calculator1;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.priyanka.calculator1.R.id.button3;
import static com.example.priyanka.calculator1.R.id.button4;

public class MainActivity extends AppCompatActivity
{
    private EditText firstNumberN1, secondNumberN2;
    private Button buttonB1, buttonB2, buttonB3, buttonB4;
    private TextView resultText;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @SuppressLint("CutPastedId")
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberN1 = (EditText) findViewById(R.id.first);
        secondNumberN2 = (EditText) findViewById(R.id.second);
        buttonB1 = (Button) findViewById(R.id.button1);
        buttonB2 = (Button) findViewById(R.id.button2);
        buttonB3 = (Button) findViewById(R.id.button3);
        buttonB4 = (Button) findViewById(R.id.button4);

        resultText = (TextView) findViewById(R.id.result);


        View.OnClickListener onButtonClick = new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberN1.getText().toString());
                int secondNumber = Integer.parseInt(secondNumberN2.getText().toString());

                if (v.getId() == R.id.button1)
                {
                    int result = firstNumber + secondNumber;
                    resultText.setText(String.valueOf(result));

                }


                if (v.getId() == R.id.button2)
                {
                    int result = firstNumber - secondNumber;
                    resultText.setText(String.valueOf(result));

                }

                if (v.getId() == R.id.button3)
                {
                    int result = firstNumber * secondNumber;
                    resultText.setText(String.valueOf(result));

                }

                if (v.getId() == R.id.button4)
                {

                    int result = firstNumber / secondNumber;
                    resultText.setText(String.valueOf(result));

                }


            }
        };

        buttonB1.setOnClickListener(onButtonClick);
        buttonB2.setOnClickListener(onButtonClick);
        buttonB3.setOnClickListener(onButtonClick);
        buttonB4.setOnClickListener(onButtonClick);
    }
}
