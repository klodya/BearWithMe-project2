package com.example.user.bearwithme;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 13/11/2016.
 */

public class Predictions {

    protected ArrayList<String> mPredictions;

    public Predictions(){
    mPredictions = new ArrayList<String>();
//        setUpPredictions();
    }

    public Predictions(ArrayList<String> alreadyPredicted){
        mPredictions = new ArrayList<String>(alreadyPredicted);
    }

    public ArrayList<String> getPredictions(){
        return new ArrayList<String>(mPredictions);
    }

    public void createPrediction(String prediction){
        mPredictions.add(prediction);
    }

    public int getLength(){
        return mPredictions.size();
    }

    public String getPredictionAtIndex(int index){
        return mPredictions.get(index);
    }

    public String getPrediction(){
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String prediction = getPredictionAtIndex(index);
        return prediction;
    }



}




