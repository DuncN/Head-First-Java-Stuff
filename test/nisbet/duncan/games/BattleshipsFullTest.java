
package nisbet.duncan.games;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BattleshipsFullTest {

    private ArrayList<String> testLocation = new ArrayList<String>();
    private Battleships battleships = new Battleships();
    private String result;

    @Test
    public void hitReturnedWhenUserGuessCorrect() {

        setupTestLocationArray();
        createAndSetBattleshipsInTestLocations();

        String userGuess = "2";

        compareUserGuessToResult(userGuess);
        Assert.assertEquals("User guess " + userGuess + " was outside the testLocation array.", "Hit", result);

    }

    @Test
    public void missReturnedWhenUserGuessIncorrect() {

        setupTestLocationArray();
        createAndSetBattleshipsInTestLocations();

        String userGuess = "4";

        compareUserGuessToResult(userGuess);
        Assert.assertEquals("User guess " + userGuess + " was in the testLocation array.", "Miss", result);
    }

    @Test
    public void killReturnedWhenShipDestroyed() {

        setupTestLocationArrayForKillTest();
        createAndSetBattleshipsInTestLocations();

        String userGuess = "5";

        compareUserGuessToResult(userGuess);
        Assert.assertEquals("User guess " + userGuess + " was outside the testLocation array.", "Kill", result);
    }

    private void createAndSetBattleshipsInTestLocations() {

        battleships.setLocationCells(testLocation);

    }

    private void setupTestLocationArray() {

        testLocation.add("1");
        testLocation.add("2");
        testLocation.add("3");

    }

    private void setupTestLocationArrayForKillTest() {

        testLocation.add("5");

    }

    private void compareUserGuessToResult(String userGuess) {
        result = battleships.checkYourself(userGuess);
    }

}
