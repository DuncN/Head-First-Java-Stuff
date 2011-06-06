package nisbet.duncan.games;

import java.util.ArrayList;


public class BattleshipsTest {
    
    public static void main (String[] args){        
        Battleships battleship = new Battleships();        
        ArrayList<String> locations= new ArrayList<String>();
        locations.add(Integer.toString(2));
        locations.add(Integer.toString(3));
        locations.add(Integer.toString(4));
        battleship.setLocationCells(locations);                                                                                                                                                                                                                                                                                                                                                                         
        String userGuess = "2";
        String result = battleship.checkYourself(userGuess);
        String testResult = "Failed";
        if (result.equals("Hit")){
             testResult = "Passed";
        }
        System.out.println(testResult);                                              
    }
}