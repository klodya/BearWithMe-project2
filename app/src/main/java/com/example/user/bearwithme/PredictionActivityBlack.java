package com.example.user.bearwithme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 16/11/2016.
 */

public class PredictionActivityBlack extends AppCompatActivity {

    TextView mPredictionText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackbear_predictions);

        mPredictionText = (TextView) findViewById(R.id.prediction_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String prediction = extras.getString("prediction");

        mPredictionText.setText(prediction);
    }
}
