package com.example.user.bearwithme;

import android.preference.PreferenceManager;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 13/11/2016.
 */

public class PredictionsTest {

    ArrayList<String> testPredictions1;
//    ArrayList<String> testPredictions2;
//    ArrayList<String> testPredictions3;

    @Before
    public void before(){
        testPredictions1 = new ArrayList<String>();
        testPredictions1.add("That sounds awful");
        testPredictions1.add("No. Go away.");
        testPredictions1.add("I will eat your face!");
    }

    @Test
    public void canGetPrediction(){
        Predictions predictions = new Predictions();
        assertNotNull(predictions.getPredictions());
    }

    @Test
    public void canCountPredictions(){
        Predictions predictions = new Predictions(testPredictions1);
        assertEquals(3, predictions.getLength());
    }

    @Test
    public void getPredictionAtIndex(){
        Predictions predictions = new Predictions(testPredictions1);
        String result = predictions.getPredictionAtIndex(0);
        assertEquals("That sounds awful", result);
    }

    @Test
    public void addNewPrediction(){
        Predictions predictions = new Predictions();

        int originalPredictions = predictions.getLength();
        predictions.createPrediction("Never ever will that happen.");

        assertEquals(originalPredictions + 1, predictions.getLength());
    }



}
