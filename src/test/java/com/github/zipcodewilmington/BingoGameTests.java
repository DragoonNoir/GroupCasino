package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.bingo.BingoGame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;



public class BingoGameTests {

    private BingoGame bingoGame;


    @Before
    public void setup(){
//        // My board
        Integer[][] bingoBoard = new Integer[5][5];
//                [0][0], [0][1], [0][2], [0][3], [0][4]
//                [1][0], [1][1], [1][2], [1][3], [1][4]
//                [2][0], [2][1], [2][2], [2][3], [2][4]
//                [3][0], [3][1], [3][2], [3][3], [3][4]
//                [4][0], [4][1], [4][2], [4][3], [4][4]

        bingoGame = new BingoGame();

    }
    @Test
    public void checkForBingo(){


    }

    @Test
    public void pickBallTest(){
        BingoGame bingoGame = new BingoGame();
       int actualNumber = bingoGame.pickBall();
        Assertions.assertTrue(actualNumber > 0);
        Assertions.assertTrue(actualNumber < 100);
    }
    //focus on winning conditions
    //pick a ball
    //random ball pick
    // have a value that will never be picked




}
