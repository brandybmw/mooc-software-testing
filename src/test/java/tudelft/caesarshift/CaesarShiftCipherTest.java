package tudelft.caesarshift;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// import org.junit.Assert;

//A Caesar Cipher is a way to encrypt messages.
// There are two inputs: A message and a shift. The message
// can be any string containing lower case letters and spaces,
// any other characters will return 'invalid' The shift can be
// any positive or negative integer. Each letter of the message
// is then shifted by the specified amount (if shift is '3' then
// 'abc' becomes 'def' and 'xyz' becomes 'abc').
public class CaesarShiftCipherTest {
    // test case where letters do not exceed z when shifted
    @Test
        public void methodABC() {
        CaesarShiftCipher text = new CaesarShiftCipher();
        String result = text.CaesarShiftCipher("abc", 3);
        String comparator = "def";
        // Assertions.assertEquals(expected, actual, error message);
        Assertions.assertEquals(comparator, result, "did not return correct shift at beginning of alphabet");
    }
    // test case where letters DO exceed z when shifted
    @Test
    public void methodXYZ() {
        CaesarShiftCipher text = new CaesarShiftCipher();
        String result = text.CaesarShiftCipher("xyz", 3);
        String comparator = "abc";
        // Assertions.assertEquals(expected, actual, error message);
        Assertions.assertEquals(comparator, result, "did not return correct shift at end of alphabet");
    }
    // test case where letters are invalid
    @Test
    public void methodINVALID() {
        CaesarShiftCipher text = new CaesarShiftCipher();
        String result = text.CaesarShiftCipher("[]|", 3);
        String comparator = "invalid";
        // Assertions.assertEquals(expected, actual, error message);
        Assertions.assertEquals(comparator, result, "not returning invalid");
    }
    // test case where letters do not exceed z when shifted
    @Test
    public void methodABCneg() {
        CaesarShiftCipher text = new CaesarShiftCipher();
        String result = text.CaesarShiftCipher("abc", -3);
        String comparator = "xyz";
        // Assertions.assertEquals(expected, actual, error message);
        Assertions.assertEquals(comparator, result, "did not return correct negative shift at beginning of alphabet");
    }
    // test case where letters DO exceed z when shifted
    @Test
    public void methodXYZlarge() {
        CaesarShiftCipher text = new CaesarShiftCipher();
        String result = text.CaesarShiftCipher("xyz", -27);
        String comparator = "wxy";
        // Assertions.assertEquals(expected, actual, error message);
        Assertions.assertEquals(comparator, result, "did not return correct large shift at end of alphabet");
    }
    //The message can be any string containing lower case letters and spaces
    @Test
    public void methodCode() {
        CaesarShiftCipher text = new CaesarShiftCipher();
        String result = text.CaesarShiftCipher("havefun", 3);
        String comparator = "kdyhixq";
        // Assertions.assertEquals(expected, actual, error message);
        Assertions.assertEquals(comparator, result, "did not return correct code message");
    }
}

