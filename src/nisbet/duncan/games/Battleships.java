
package nisbet.duncan.games;

import java.util.ArrayList;

public class Battleships {

    private ArrayList<String> locationCells;

    public static void main(String[] args) {
        int numberOfGuesses = 0;
        GameHelper helper = new GameHelper();

        Battleships battleship = new Battleships();
        int randomNum = (int)(Math.random() * 5);

        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(randomNum));
        locations.add(Integer.toString(randomNum + 1));
        locations.add(Integer.toString(randomNum + 2));
        System.out.println(locations);
        
        battleship.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = battleship.checkYourself(guess);
            System.out.println(result);
            numberOfGuesses++;
            if ("Kill".equals(result)) {
                isAlive = false;
                System.out.println("You took " + numberOfGuesses + " guesses");
            }
        }
    }

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;

    }

    public String checkYourself(String userInput) {

        String result = "Miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Kill";
            } else {
                result = "Hit";

            }
            
        }
        return result;
    }
}
