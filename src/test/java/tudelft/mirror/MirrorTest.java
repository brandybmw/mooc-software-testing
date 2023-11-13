package tudelft.mirror;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

/*Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string, and at the very end of the
string in reverse order (possibly overlapping). For example, the string "abXYZba'' has the mirror end "ab''.

Examples:

mirrorEnds("abXYZba") ==> "ab"
mirrorEnds("abca") ==> "a"
mirrorEnds("aba") ==> "aba"
A (buggy) implementation of this problem can be found in the Mirror class (mirror package). Apply everything you
learned so far and find the bug. Write tests in the MirrorTest class. At the end, push your solution to GitHub.
Tip: Think about even and uneven input lengths.
BUG: mirrorEnds("abba") ==> "abba"
*/
public class MirrorTest {
    //AAA: Arrange, Act, Assert
    // indicates that the following method is a JUnit test
    @Test
    // The method name explains what we want to test.
    public void mirrorTest1_oddMirrored() {
    // body of test method invokes the function to test, passing something to it.
        // ARRANGE & ACT
        String result = new Mirror().mirrorEnds("abXYZba");

        String expectedValue = "ab";

        // ASSERT: assert that our result is equal to expected value
        Assertions.assertEquals(expectedValue, result);
    }
    @Test
    // The method name explains what we want to test.
    public void mirrorTest2_evenMirrored() {
        // body of test method invokes the function to test, passing something to it.
        // ARRANGE & ACT
        String result = new Mirror().mirrorEnds("abca");

        String expectedValue = "a";

        // ASSERT: assert that our result is equal to expected value
        Assertions.assertEquals(expectedValue, result);
    }
    @Test
    // The method name explains what we want to test.
    public void mirrorTest3_evenAllMirrored() {
        // body of test method invokes the function to test, passing something to it.
        // ARRANGE & ACT
        String result = new Mirror().mirrorEnds("aba");

        String expectedValue = "aba";

        // ASSERT: assert that our result is equal to expected value
        Assertions.assertEquals(expectedValue, result);
    }
    @Test
    // The method name explains what we want to test.
    public void mirrorTest4_oddNoMirror() {
        // body of test method invokes the function to test, passing something to it.
        // ARRANGE & ACT
        String result = new Mirror().mirrorEnds("abc");

        String expectedValue = "";

        // ASSERT: assert that our result is equal to expected value
        Assertions.assertEquals(expectedValue, result);
    }
    @Test
    // The method name explains what we want to test.
    public void mirrorTest4_evenNoMirror() {
        // body of test method invokes the function to test, passing something to it.
        // ARRANGE & ACT
        String result = new Mirror().mirrorEnds("abcd");

        String expectedValue = "";

        // ASSERT: assert that our result is equal to expected value
        Assertions.assertEquals(expectedValue, result);
    }

    //FOUND THE BUG!!!!
    @Test
    // The method name explains what we want to test.
    public void mirrorTest5_oddAllMirrored() {
        // body of test method invokes the function to test, passing something to it.
        // ARRANGE & ACT
        String result = new Mirror().mirrorEnds("abba");

        String expectedValue = "abba";

        // ASSERT: assert that our result is equal to expected value
        Assertions.assertEquals(expectedValue, result);
    }
}
