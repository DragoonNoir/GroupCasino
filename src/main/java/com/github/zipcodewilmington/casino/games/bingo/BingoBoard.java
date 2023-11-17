package com.github.zipcodewilmington.casino.games.bingo;

import java.util.Random;

public class BingoBoard {
    Integer[][] bingoBoard = new Integer[5][5];

    public Integer[][] populateColumn(int col) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            bingoBoard[i][col] = rand.nextInt(15) + 1 + (15 * col);

        }
        return bingoBoard;
    }

    public Integer[][] getBingoBoard() {
        return this.bingoBoard;
    }

    public Integer[][] populateBoard() { //Help here
        for (int i = 0; i < 5; i++) {
            populateColumn(i);

        }
//        }return bingoBoard;
//    }  for (int j = 0; j < 5;j++){
//        populateRow(j);
        return null;
    }
}