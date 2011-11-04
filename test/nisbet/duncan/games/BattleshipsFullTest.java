
package nisbet.duncan.games;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BattleshipsFullTest {

    @Test
    public void hitReturnedWhenUserGuessCorrect() {

        ArrayList<String> testLocation = setupTestLocationArray();
        Battleships battleships = createAndSetBattleshipsInTestLocations(testLocation);

        String userGuess = "2";

        String result = battleships.checkYourself(userGuess);
        Assert.assertEquals("User guess " + userGuess + " was outside the testLocation array", "Hit", result);

    }

    @Test
    public void missReturnedWhenUserGuessIncorrect() {

        ArrayList<String> testLocation = setupTestLocationArray();
        Battleships battleships = createAndSetBattleshipsInTestLocations(testLocation);

        String userGuess = "4";


        String result = battleships.checkYourself(userGuess);
        Assert.assertEquals("User guess " + userGuess + " was in the testLocation array", "Miss", result);
    }

    private Battleships createAndSetBattleshipsInTestLocations(ArrayList<String> testLocation) {

        Battleships battleships = new Battleships();
        battleships.setLocationCells(testLocation);
        return battleships;

    }

    private ArrayList<String> setupTestLocationArray() {
        ArrayList<String> testLocation;
        testLocation = new ArrayList<String>();

        testLocation.add("1");
        testLocation.add("2");
        testLocation.add("3");
        return testLocation;
    }
}
