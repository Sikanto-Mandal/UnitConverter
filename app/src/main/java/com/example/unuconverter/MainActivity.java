package com.example.unuconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Thank You", Toast.LENGTH_SHORT).show();
//                String s =editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205 * kg;
//                textView.setText("The corresponding value in Pounds is " + pound);
//            }
//        });

    }
        public void calculate(View view){

            Toast.makeText(MainActivity.this, "Thank You", Toast.LENGTH_SHORT).show();
            String s =editText.getText().toString();
            int kg = Integer.parseInt(s);
            double pound = 2.205 * kg;
            textView.setText("The corresponding value in Pounds is " + pound);


    }
}