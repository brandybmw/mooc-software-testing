package tudelft.sum;

//added
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*The function of addTwoNumbers should add two non-negative integers
from which the digits are stored separately in an arraylist. For example,
the number 12 would be stored as ArrayList(1,2). You can assume that
there are no zeros in the beginning of the ArrayList i.e: not
ArrayList(0, 0, 2);
Input: l1 = [1,2,3], l2 = [6,5,4]
Output: [7,7,7]
Explanation: 123 + 654 = 777.
*/

/* Test template
@Test
public void testMethodName() {
        int result = new ClassName().methodName(parameter);
        Assertions.assertEquals(expected,result);
        } */
public class TwoNumbersSumTest {
    @Test
    public void twoDigit() {
        // (ArrayList<Integer> first, ArrayList<Integer> second)
        // Declaring the ArrayList with initial size n
        // ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        // arr1.add(1);
        // arr1.add(2);
        ArrayList<Integer> arr1 = new ArrayList<Integer>(2);
        arr1.add(1);
        arr1.add(2);
        ArrayList<Integer> arr2 = new ArrayList<Integer>(2);
        arr2.add(3);
        arr2.add(4);
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(arr1,arr2);

        ArrayList<Integer> expected = new ArrayList<Integer>(2);
        expected.add (4);
        expected.add (6);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void twoDigitCarry() {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(2);
        arr1.add(7);
        arr1.add(7);
        ArrayList<Integer> arr2 = new ArrayList<Integer>(2);
        arr2.add(1);
        arr2.add(3);
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(arr1,arr2);

        ArrayList<Integer> expected = new ArrayList<Integer>(2);
        expected.add (9);
        expected.add (0);
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void zero() {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(2);
        arr1.add(0);
        arr1.add(0);
        ArrayList<Integer> arr2 = new ArrayList<Integer>(2);
        arr2.add(0);
        arr2.add(0);
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(arr1, arr2);

        ArrayList<Integer> expected = new ArrayList<Integer>(2);
        expected.add(0);
        expected.add(0);
        Assertions.assertEquals(expected, result);
    }
}
