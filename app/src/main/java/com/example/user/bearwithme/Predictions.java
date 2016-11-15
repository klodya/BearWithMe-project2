package com.example.user.bearwithme;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 13/11/2016.
 */

public class Predictions {

    protected ArrayList<String> mPredictions;


    public Predictions() {
        mPredictions = new ArrayList<String>();
    }

    public ArrayList<String> getPredictions() {
        return new ArrayList<>();
    }

    public void createPrediction(String prediction) {
        mPredictions.add(prediction);
    }

    public int getPredictionsLength() {
        return mPredictions.size();
    }

    public String getPredictionAtIndex(int index) {
        return mPredictions.get(index);
    }

    public String getPrediction() {
        Random rand = new Random();
        int listSize = getPredictionsLength();
        int index = rand.nextInt(listSize);
        String prediction = getPredictionAtIndex(index);
        return prediction;
    }
}



