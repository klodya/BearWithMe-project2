package com.example.user.bearwithme;

import java.util.ArrayList;


/**
 * Created by user on 13/11/2016.
 */

public abstract class Bear {

    private ArrayList<Feedable> mBelly;
    private String type;
    private String name;

    Predictions mBadPredictions;
    Predictions mMediocrePredictions;
    Predictions mGoodPredictions;
    Predictions mDrunkPredictions;

    public Bear(String type, String name, ArrayList<Feedable> belly) {
        this.type = type;
        this.name = name;
        this.mBelly = new ArrayList<>();
        this.mBadPredictions = new Predictions();
        setUpBadPredictions();
        this.mMediocrePredictions = new Predictions();
        setUpMediocrePredictions();
        this.mGoodPredictions = new Predictions();
        setUpGoodPredictions();
        this.mDrunkPredictions = new Predictions();
        setUpDrunkPredictions();
    }

    public String type() {
        return this.type;
    }

    public String name() {
        return this.name;
    }

    public void setBearName(String name) {
        this.name = name;
    }

    public void feedBear(Feedable food) {
        this.mBelly.add(food);
    }

    public int bellyCount() {
        return this.mBelly.size();
    }

    public Feedable diet() {
        if (bellyCount() > 0) {
            return mBelly.remove(0);
        }
        return null;
    }

    public void foodComa() {
        this.mBelly.clear();
    }

    public boolean drunk() {
        if (mBelly.isEmpty()) {
            return false;
        }

        for (Feedable item : mBelly) {
            if (item.feedableType() != "Beer") {
                return false;
            }
        }
        return true;
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
//
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

