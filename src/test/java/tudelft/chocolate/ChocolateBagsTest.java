package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChocolateBagsTest {
    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({"1,1,5,0", "1,1,6,1", "1,1,7,-1", "1,1,8,-1"})
    public void totalIsTooBig(int small, int big, int total, int expectedResult) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({"4,0,10,-1", "4,1,10,-1", "5,2,10,0", "5,3,10,0"})
    public void onlyBigBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    // my code
    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    // select values. case #1: no bigs, not enough smalls.
    // case #2: not enough bigs, or smalls.
    // case #3: enough bigs, enough smalls.
    // case #4: bigs, more than enough smalls.
    @CsvSource({"4,1,10,-1", "5,0,10,-1", "5,2,15,5", "6,2,14,4"})
    public void bigAndSmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    // select values. case #1: no bigs, not enough smalls.
    // case #2: bigs, still not enough smalls.
    // case #3: no bigs, enough smalls.
    // case #4: bigs, more than enough smalls.
    @CsvSource({"4,0,10,-1", "3,4,4,-1", "10,0,10,10", "6,2,4,4"})
    public void onlySmallBars(int small, int big, int total, int expectedResult) {
        int result = new ChocolateBags().calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
}

// provided
//    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
//    @CsvSource({
//            "0,3,17,-1", "1,3,17,-1", "2,3,17,2", "3,3,17,2",
//            "0,3,12,-1", "1,3,12,-1", "2,3,12,2", "3,3,12,2"})
//    public void bigAndSmallBars(int small, int big, int total, int expectedResult) {
//        int result = new ChocolateBags().calculate(small, big, total);
//        Assertions.assertEquals(expectedResult, result);
//    }
//
//    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
//    @CsvSource({ "4,2,3,3", "3,2,3,3", "2,2,3,-1", "1,2,3,-1" })
//    public void onlySmallBars(int small, int big, int total, int expectedResult) {
//        int result = new ChocolateBags().calculate(small, big, total);
//        Assertions.assertEquals(expectedResult, result);
//    }
//}
