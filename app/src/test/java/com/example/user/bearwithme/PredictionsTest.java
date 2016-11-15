package com.example.user.bearwithme;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 13/11/2016.
 */

public class PredictionsTest {


    @Test
    public void canGetBadPrediction(){
        Predictions predictions = new Predictions();
        assertNotNull(predictions.getBadPredictions());
    }

    @Test
    public void canGetMediocrePrediction(){
        Predictions predictions = new Predictions();
        assertNotNull(predictions.getMediocrePredictions());
    }

    @Test
    public void canGetGoodPrediction(){
        Predictions predictions = new Predictions();
        assertNotNull(predictions.getGoodPredictions());
    }



    @Test
    public void canCountBadPredictions(){
        Predictions predictions = new Predictions();
        assertEquals(3, predictions.getBadPredictionsLength());
    }



    @Test
    public void getBadPredictionAtIndex(){
        Predictions predictions = new Predictions();
        String result = predictions.getBadPredictionAtIndex(0);
        assertEquals("Shoo Human", result);
    }



    @Test
    public void addNewBadPrediction(){
        Predictions predictions = new Predictions();

        int originalPredictions = predictions.getBadPredictionsLength();
        predictions.createBadPrediction("Never ever will that happen.");

        assertEquals(originalPredictions + 1, predictions.getBadPredictionsLength());
    }

    @Test
    public void addNewMediocrePrediction(){
        Predictions predictions = new Predictions();

        int originalPredictions = predictions.getMediocrePredictionsLength();
        predictions.createMediocrePrediction("Do you have donuts with sprinkles?");

        assertEquals(originalPredictions + 1, predictions.getMediocrePredictionsLength());
    }

    @Test
    public void addNewGoodPrediction(){
        Predictions predictions = new Predictions();

        int originalPredictions = predictions.getGoodPredictionsLength();
        predictions.createGoodPrediction("Fabulous idea Darling.");

        assertEquals(originalPredictions + 1, predictions.getGoodPredictionsLength());
    }
}
