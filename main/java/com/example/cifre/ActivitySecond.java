package com.example.cifre;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView resultTextView = findViewById(R.id.result_text_view);
        Button backButton = findViewById(R.id.back_button);

        String numberString = getIntent().getStringExtra("number");
        int count = numerelePare(numberString);
        resultTextView.setText("Numărul de cifre pare: " + count);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private int numerelePare(String numberString) {
        int count = 0;
        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}