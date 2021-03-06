package com.example.gamestatehw.citadels.cards.characterCards;

import android.util.Log;

import com.example.gamestatehw.citadels.cards.Card;
import com.example.gamestatehw.citadels.cards.CharacterCard;
import com.example.gamestatehw.citadels.cards.UniqueDistrictCard;
import com.example.gamestatehw.citadels.cards.districtCards.BlueDistrict;
import com.example.gamestatehw.citadels.cards.districtCards.GreenDistrict;
import com.example.gamestatehw.citadels.cards.districtCards.RedDistrict;
import com.example.gamestatehw.citadels.cards.districtCards.YellowDistrict;

import java.util.ArrayList;

public class Patrician extends CharacterCard {
    public Patrician() {
        super("Patrician",
                0,
                "You gain one gold for each religious district in your city.\n" +
                        "During this round, the rank 8 character (Warlord, Diplomat, or \n" +
                        "Marshal) cannot use its ability on your districts.\n" +
                        "If you are killed, the rank 8 character can use its ability on your \n" +
                        "districts. Similarly, if you are bewitched, the rank 8 character \n" +
                        "cannot use its ability on the Witch’s districts, but it can use its \n" +
                        "ability on the Bishop’s districts.",
                1,
                5);
    }

    public void ability() { Log.d("Patrician ","Override works"); }
}