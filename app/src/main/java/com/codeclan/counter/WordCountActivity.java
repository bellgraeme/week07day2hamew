package com.codeclan.counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    TextView wordCountText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        wordCountText = (TextView) findViewById(R.id.word_count_text);
        countButton = (Button)findViewById(R.id.count_button);
    }



    public void onCountButtonClicked(View button){
        Log.d(getClass().toString(), "Button was Clicked!");
        String text = wordCountText.getText().toString();
        Log.d("the string was: ", text);

        Intent intent = new Intent(this, CountedActivity.class);
        intent.putExtra("text", text);
        startActivity(intent);
    }

}
