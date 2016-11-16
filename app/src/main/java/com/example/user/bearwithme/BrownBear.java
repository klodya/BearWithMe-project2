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
                "That is irrelevant",
                "I will eat your face.",
                "Shoo meat sack.",
                "I have no time for you.",
                "Shut up, you’ll never be the man your mother is.",
                "Rotting bodies are less offensive than your questions.",
                "Only disappointment awaits.",
                "No! Drink the bleach!",
                "You are a meat popsicle.",
                "Sorry that was my stomach."
        };

        for (String badPrediction : badPredictions) {
            mBadPredictions.createPrediction(badPrediction);
        }
    }

    private void setUpMediocrePredictions() {
        String[] mediocrePredictions = {
                "It's hard to tell when I'm still hungry",
                "Maybe a beer would help me think",
                "I like the taste of donuts.",
                "Extra melty cheese is not optional.",
                "I can smell those burgers from here.",
                "Why would you ask me that?",
                "I could ask you the same thing.",
                "Is that really worth asking?",
                "I am JUST a bear.",
                "I do not know what that means, and I won't respond to it."
        };

        for (String mediocrePrediction : mediocrePredictions) {
            mMediocrePredictions.createPrediction(mediocrePrediction);
        }
    }

    private void setUpGoodPredictions() {

        String[] goodPredictions = {
                "I would assume that this is possible",
                "Sure, why not.",
                "You are very nice.",
                "But of course you should!",
                "Here take all my money!",
                "You have my full support.",
                "You’re so cool!",
                "I would agree with that.",
                "I’m up for whatever.",
                "Absolutely.",
                "Without a doubt.",
        };

        for (String goodPrediction : goodPredictions) {
            mGoodPredictions.createPrediction(goodPrediction);
        }
    }

    private void setUpDrunkPredictions(){
        String[] drunkPredictions = {
                "ooh *hic* that sure..sounds..*hic*",
                "Ooft...BURP..*hic*",
                "Where my honeyz at?!",
                "You *hic* are..yes you are..my best bestest bestiest pal ever. FOREVER.",
                "Bear is currently unavailable.",
                "Bear has collapsed in a drunken heap.",
                "Bear is too drunk to reply.",
                "Bear has passed out.",
                "I think…that..no. Wait. Ok. Do that. It will…possible yes."
        };

        for (String drunkPrediction : drunkPredictions){
            mDrunkPredictions.createPrediction(drunkPrediction);
        }
    }

}


