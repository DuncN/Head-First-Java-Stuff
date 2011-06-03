package nisbet.duncan.games;


public class BattleshipsTest {
    
    public static void main (String[] args){        
        Battleships battleship = new Battleships();        
        int[] locations = {2,3,4,7};
        battleship.setLocationCells(locations);                                                                                                                                                                                                                                                                                                                                                                         
        String userGuess = "7";
        String result = battleship.checkYourself(userGuess);
        String testResult = "Failed";
        if (result.equals("Hit")){
             testResult = "Passed";
        }
        System.out.println(testResult);                                              
    }
}