package nisbet.duncan.games;

import java.util.ArrayList;
public class BattleshipsFull {

    private GameHelper helper = new GameHelper();
    private ArrayList<Battleships> inventory = new ArrayList<Battleships>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        Battleships one = new Battleships();
        one.setName("Bismarck");
        Battleships two = new Battleships();
        two.setName("Tirpitz");
        Battleships three = new Battleships();
        three.setName("Scharnhorst");
        inventory.add(one);
        inventory.add(two);
        inventory.add(three);

        System.out.println("Your goal is to sink three ships - ");
        System.out.println("Bismarck, Tirpitz & Scharnhorst.");
        System.out.println("Try to sink them all in the fewest amount of guesses!");

        for (Battleships shipsToSet : inventory){

            ArrayList<String> newLocation = helper.placeShips(3);

            shipsToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while(!inventory.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Miss";
        for (Battleships shipsToTest : inventory) {
            result = shipsToTest.checkYourself(userGuess);
            if (result.equals("Hit")){
                break;
            }
            if (result.equals("Kill")){
                inventory.remove(shipsToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame() {
        System.out.println("All ships have been sunk!");
        if (numOfGuesses <=18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
        } else {
            System.out.println("Took you long enough. "+ numOfGuesses + " guesses." );

        }
    }
    public static void main (String[] args){
        BattleshipsFull game = new BattleshipsFull();
        game.setUpGame();
        game.startPlaying();
    }

}
