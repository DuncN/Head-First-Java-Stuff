package nisbet.duncan.games;


public class Battleships {

    int[] locationCells;
    int numberOfHits = 0;

    public static void main(String[] args) {
        int numberOfGuesses = 0;
        GameHelper helper = new GameHelper();

        Battleships battleship = new Battleships();
        int randomNum = (int)(Math.random() * 5);

        int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
        battleship.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = battleship.checkYourself(guess);
            numberOfGuesses++;
            if ("Kill".equals(result)) {
                isAlive = false;
                System.out.println("You took " + numberOfGuesses + " guesses");
            }
        }
    }

    public void setLocationCells(int[] locs) {
        locationCells = locs;

    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Hit";
                numberOfHits++;
                break;
            }
        }

        if (numberOfHits == locationCells.length) {
            result = "Kill";
        }
        System.out.println(result);
        return result;
    }

}
