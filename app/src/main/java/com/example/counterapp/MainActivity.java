package com.example.counterapp;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private EditText countEditText;
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the TextView object
        countEditText = findViewById(R.id.cntView);
        // Set the input filter to allow only numbers
        countEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
        // Set the initial count value
        countEditText.setText(String.valueOf(count));
            // Set up the increase button
        Button increaseButton = findViewById(R.id.plusButton);
        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(countEditText.getText().toString());
                count++;
                countEditText.setText(String.valueOf(count));
                Log.d(TAG,""+count);

            }
        });

        // Set up the decrease button
        Button decreaseButton = findViewById(R.id.minusButton);
        decreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(countEditText.getText().toString());
                count--;
                countEditText.setText(String.valueOf(count));
                Log.d(TAG,""+count);
            }
        });

        // Set up the reset button
        Button resetButton = findViewById(R.id.reset);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                countEditText.setText(String.valueOf(count));
                Log.d(TAG,"reset");

            }
        });
    }
}

