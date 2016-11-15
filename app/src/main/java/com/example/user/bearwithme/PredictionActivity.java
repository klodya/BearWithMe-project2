package com.example.user.bearwithme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 15/11/2016.
 */

public class PredictionActivity extends AppCompatActivity {

    TextView mBadPredictions;
    TextView mMediocrePredictions;
    TextView mGoodPredictions;
    TextView mDrunkPredictions;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brownbear_predictions);

    }

}
