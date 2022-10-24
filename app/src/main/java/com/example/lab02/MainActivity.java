package com.example.lab02.;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import utils.textCounter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickButton = (Button) findViewById(R.id.btnCount);
        EditText editText = (EditText) findViewById(R.id.edPhrase);
        TextView textViewOutput = (TextView) findViewById(R.id.tvWin);
        Spinner spinner = (Spinner)findViewById(R.id.spSelectionOptions);
        clickButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String textCounting = editText.getText().toString();
                String s_text = spinner.getSelectedItem().toString();
                textCounter word_char = new textCounter();
                if (TextUtils.isEmpty(textCounting)) {
                    Toast.makeText(getApplicationContext(), "WORNING! Text is emty.", Toast.LENGTH_LONG).show();
                }
                else {
                    if (s_text.equalsIgnoreCase(("counting characters"))) {
                        textViewOutput.setText(String.valueOf(word_char.countChars(textCounting)));
                    }
                    else {
                        textViewOutput.setText(String.valueOf(word_char.countWords(textCounting)));
                    }
                }
            }
        });
    }
}



