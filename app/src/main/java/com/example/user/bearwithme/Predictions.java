package com.example.user.bearwithme;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 13/11/2016.
 */

public class Predictions {

    protected ArrayList<String> mBadPredictions;
    protected ArrayList<String> mMediocrePredictions;
    protected ArrayList<String> mGoodPredictions;


    public Predictions(){
        mBadPredictions = new ArrayList<String>();
        setUpBadPredictions();
        mMediocrePredictions = new ArrayList<String>();
        setUpMediocrePredictions();
        mGoodPredictions = new ArrayList<String>();
        setUpGoodPredictions();
    }

    public Predictions(ArrayList<String> alreadyPredicted){
        mBadPredictions = new ArrayList<String>(alreadyPredicted);
        mMediocrePredictions = new ArrayList<String>(alreadyPredicted);
        mGoodPredictions = new ArrayList<String>(alreadyPredicted);
    }

    public ArrayList<String> getBadPredictions(){
        return new ArrayList<String>(mBadPredictions);
    }

    public ArrayList<String> getMediocrePredictions(){
        return new ArrayList<String>(mMediocrePredictions);
    }

    public ArrayList<String> getGoodPredictions(){
        return new ArrayList<String>(mGoodPredictions);
    }

    public void createBadPrediction(String badPrediction){
        mBadPredictions.add(badPrediction);
    }

    public void createMediocrePrediction(String mediocrePrediction){
        mMediocrePredictions.add(mediocrePrediction);
    }

    public void createGoodPrediction(String goodPrediction){
        mGoodPredictions.add(goodPrediction);
    }

    public int getBadPredictionsLength(){
        return mBadPredictions.size();
    }

    public int getMediocrePredictionsLength(){
        return mMediocrePredictions.size();
    }

    public int getGoodPredictionsLength(){
        return mGoodPredictions.size();
    }

    public String getBadPredictionAtIndex(int index){
        return mBadPredictions.get(index);
    }

    public String getMediocrePredictionAtIndex(int index){
        return mMediocrePredictions.get(index);
    }

    public String getGoodPredictionAtIndex(int index){
        return mGoodPredictions.get(index);
    }

    public String getBadPrediction(){
        Random rand = new Random();
        int listSize = getBadPredictionsLength();
        int index = rand.nextInt(listSize);
        String prediction = getBadPredictionAtIndex(index);
        return prediction;
    }

    public String getMediocrePrediction(){
        Random rand = new Random();
        int listSize = getMediocrePredictionsLength();
        int index = rand.nextInt(listSize);
        String prediction = getMediocrePredictionAtIndex(index);
        return prediction;
    }

    public String getGoodPrediction(){
        Random rand = new Random();
        int listSize = getGoodPredictionsLength();
        int index = rand.nextInt(listSize);
        String prediction = getGoodPredictionAtIndex(index);
        return prediction;
    }

    private void setUpBadPredictions() {

        String[] badPredictions = {
                "Shoo Human",
                "That is irrelevant",
                "I will eat your face."
        };

        for (String badPrediction : badPredictions) {
            mBadPredictions.add(badPrediction);
        }
    }

    private void setUpMediocrePredictions() {

        String[] mediocrePredictions = {
                "It's hard to tell when I'm still hungry",
                "Maybe a beer would help me think",
                "I like the taste of donuts."
        };

        for (String mediocrePrediction : mediocrePredictions) {
            mMediocrePredictions.add(mediocrePrediction);
        }
    }

    private void setUpGoodPredictions() {

        String[] goodPredictions = {
                "I would assume that this is possible",
                "Sure, why not.",
                "You are very nice."
        };

        for (String goodPrediction : goodPredictions) {
            mGoodPredictions.add(goodPrediction);
        }
    }


}




