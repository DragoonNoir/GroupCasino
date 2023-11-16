package com.github.zipcodewilmington.games.bingo;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.games.bingo.BingoPlayer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BingoPlayerTest {
    @Test
    public void TestBingoPlayer(){
        CasinoAccount casinoAccount = new CasinoAccount("username", "password");
        BingoPlayer bingoPlayer = new BingoPlayer(casinoAccount);
        Assert.assertNotNull(bingoPlayer);
    }
//    @Test
//    public <BingoPlayerBoard> void TestBingoPlayerBoard(){
//        BingoPlayer bingoPlayer = new BingoPlayer();
//        BingoPlayerBoard bingoPlayerBoard = new bingoPlayerBoard(bingoPlayer);
//        Assert.assertNotNull(bingoPlayerBoard);
//        Assert.assertEquals(bingoPlayer,bingoPlayerBoard.getBingoPlayer());
//    }
}
