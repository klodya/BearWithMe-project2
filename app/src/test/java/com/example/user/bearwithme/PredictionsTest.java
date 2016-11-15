package com.example.user.bearwithme;

import org.junit.Test;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 13/11/2016.
 */

public class PredictionsTest {


    @Test
    public void canGetPrediction(){
        Predictions predictions = new Predictions();
        assertNotNull(predictions.getPredictions());
    }

    @Test
    public void canCountPredictions(){
        Predictions predictions = new Predictions();
        predictions.createPrediction("Shoo human!");

        assertEquals(1, predictions.getPredictionsLength());
    }



    @Test
    public void getPredictionAtIndex(){
        Predictions predictions = new Predictions();
        predictions.createPrediction("Shoo human!");

        String result = predictions.getPredictionAtIndex(0);
        assertEquals("Shoo human!", result);
    }


    @Test
    public void addPrediction(){
        Predictions predictions = new Predictions();

        int originalPredictions = predictions.getPredictionsLength();
        predictions.createPrediction("Never ever will that happen.");

        assertEquals(originalPredictions + 1, predictions.getPredictionsLength());
    }

}
