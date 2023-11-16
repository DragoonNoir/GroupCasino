package com.github.zipcodewilmington.games.bingo;

import com.github.zipcodewilmington.casino.games.bingo.BingoBoard;
import org.junit.Assert;
import org.junit.Test;

public class BingoBoardTest {
    @Test
    public void BingoBoardTest(){
        BingoBoard PlayerBingoBoard = new BingoBoard();
        Assert.assertNotNull(PlayerBingoBoard);
    }
    @Test
    public void TestPopulateColumn(){
        BingoBoard board = new BingoBoard();
        board.populateColumn(0);
        Assert.assertNotEquals(0, board.getBingoBoard()[0][0].intValue());
    }
}
