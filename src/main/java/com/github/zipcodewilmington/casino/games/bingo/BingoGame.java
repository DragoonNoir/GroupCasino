package com.github.zipcodewilmington.casino.games.bingo;

import java.util.HashMap;
import java.util.Map;

public class BingoGame {
   public Map markedSpots = new HashMap<String,int[][]>();

public BingoGame(){}
   public void markBingoBoard(int theNumberCalled){
       markedSpots.put("1",theNumberCalled);
   }

   public int pickBall(){
        int ball= (int) Math.round(Math.random()* 100);
       System.out.println(ball);
       return ball;

   }


}
