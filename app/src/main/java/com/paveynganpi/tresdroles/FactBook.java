package com.paveynganpi.tresdroles;

import java.util.Random;

/**
 * Created by paveynganpi on 12/26/14.
 */




public class FactBook {

    //member variables
    String[] mFacts = {"Ostriches run faster than horses",
            "chelseaFc is the best club in England",
            "Didier Drogba is a chelseaFc Legend",
            "Frank Lampard is the highest chelsea goal scorer ever",
            "John Terry started his chelsea Career at 20",
            "Fernando Torres is the most expensive chelsea player ever",
            "Diego is chelsea fastest goal scorer to score 4 goals in 2 games",
            "Jose Jose Mourinho is Chelsea's longest serving coach",
            "Andre Villas Boas is chelsea's highest flop manager",
            "Carlo Ancelotti took chelsea to their first ever double",
            "Roberto Di Mateo won chelsea's first Champions League Trophy",
            "Zouma is chelsea's youngest player ever to be play in the epl",
            "Andre Schurlle is chelsea's only to win a World Cups"

    };

    public String getFact(){

        Random randomNumberGenerator = new Random();
        int randomNumber = randomNumberGenerator.nextInt(mFacts.length);

        return mFacts[randomNumber];


    }

}
