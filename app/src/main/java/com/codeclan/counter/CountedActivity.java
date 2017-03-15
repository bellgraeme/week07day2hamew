package com.codeclan.counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class CountedActivity extends AppCompatActivity {

    TextView countedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counted);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String text = extras.getString("text");
        Map<String, Integer> counted = WordCount.wordCount(text);
        String result = WordCount.output(counted);

        countedText = (TextView)findViewById(R.id.counted_text);
        countedText.setText(result);
    }
}
