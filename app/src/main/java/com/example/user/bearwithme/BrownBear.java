package com.example.user.bearwithme;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class BrownBear extends Bear {

    Predictions mBadPredictions;
    Predictions mMediocrePredictions;
    Predictions mGoodPredictions;
    Predictions mDrunkPredictions;

    public BrownBear(String type, String name){
        super(type, name);
        this.mBadPredictions = new Predictions();
        setUpBadPredictions();
        this.mMediocrePredictions = new Predictions();
        setUpMediocrePredictions();
        this.mGoodPredictions = new Predictions();
        setUpGoodPredictions();
        this.mDrunkPredictions = new Predictions();
        setUpDrunkPredictions();

        }

    public String bearPredicts() {
        if (bellyCount() == 0) {
            return mBadPredictions.getPrediction();
        }
        if (drunk() == true) {
            return mDrunkPredictions.getPrediction();
        }
        if (bellyCount() < 3) {
            return mMediocrePredictions.getPrediction();
        }
        if (bellyCount() >= 3) {
            return mGoodPredictions.getPrediction();
        }
        return null;
    }

    private void setUpBadPredictions() {
        String[] badPredictions = {
                "Shoo Human",
                "That is irrelevant",
                "I will eat your face."
        };

        for (String badPrediction : badPredictions) {
            mBadPredictions.createPrediction(badPrediction);
        }
    }

    private void setUpMediocrePredictions() {
        String[] mediocrePredictions = {
                "It's hard to tell when I'm still hungry",
                "Maybe a beer would help me think",
                "I like the taste of donuts."
        };

        for (String mediocrePrediction : mediocrePredictions) {
            mMediocrePredictions.createPrediction(mediocrePrediction);
        }
    }

    private void setUpGoodPredictions() {

        String[] goodPredictions = {
                "I would assume that this is possible",
                "Sure, why not.",
                "You are very nice."
        };

        for (String goodPrediction : goodPredictions) {
            mGoodPredictions.createPrediction(goodPrediction);
        }
    }

    private void setUpDrunkPredictions(){
        String[] drunkPredictions = {
                "ooh *hic* that sure..sounds..*hic*",
                "Ooft...BURP..*hic*",
                "Where my honeyz at?!"
        };

        for (String drunkPrediction : drunkPredictions){
            mDrunkPredictions.createPrediction(drunkPrediction);
        }
    }

}


