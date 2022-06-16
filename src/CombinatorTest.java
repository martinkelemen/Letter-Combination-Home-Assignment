import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class CombinatorTest {
    @Test
    public void testGetCombinationsWithTwoDifferentDigits() {
        Combinator c = new Combinator();

        ArrayList<String> expected  = new ArrayList<String>(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));

        assertEquals(expected, c.getCombinations("23"));
    }

    @Test
    public void testGetCombinationsWithTwoSameDigits() {
        Combinator c = new Combinator();

        ArrayList<String> expected  = new ArrayList<String>(Arrays.asList("aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc"));

        assertEquals(expected, c.getCombinations("22"));
    }

    @Test
    public void testGetCombinationsWithOneDigit() {
        Combinator c = new Combinator();

        ArrayList<String> expected  = new ArrayList<String>(Arrays.asList("a", "b", "c"));

        assertEquals(expected, c.getCombinations("2"));
    }

    @Test
    public void testGetCombinationsWithZeroDigit() {
        Combinator c = new Combinator();

        ArrayList<String> expected  = new ArrayList<String>();

        assertEquals(expected, c.getCombinations(""));
    }

    @Test
    public void testGetCombinationsWithThreeDifferentDigits() {
        Combinator c = new Combinator();

        int expected = 33;

        assertEquals(expected, c.getCombinations("935").size());
    }

    @Test
    public void testGetCombinationsWithFourDifferentDigits() {
        Combinator c = new Combinator();

        int expected = 54;

        assertEquals(expected, c.getCombinations("2643").size());
    }
}
