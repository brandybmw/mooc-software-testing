package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    // Parameterized JUnit Test
    // @ParameterizedTest(name = "string={0}, result={1}")
    // @CsvSource({"xxggxx", "xxgxx", "xxggyygxx"})
    // public void testName(String string, int expectedResult) {
    @Test
    // select values for cases:
    // gHappy("xxggxx") ==> true
    // gHappy("xxgxx") ==> false
    // gHappy("xxggyygxx") ==> false
    // @CsvSource({"xxggxx", "xxgxx", "xxggyygxx"})
    public void happyTrue() {
        GHappy gh = new GHappy();
        // JUnit's Assertions.assertTrue() method.
        boolean result = gh.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }
    @Test
    // case: gHappy("xxgxx") ==> false
    public void unhappySingle() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }
    @Test
    // case: gHappy("xxggyygxx") ==> false
    public void unhappyDouble() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }
}
