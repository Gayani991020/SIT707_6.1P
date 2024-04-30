package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalLoopsTest {

    @Test
    public void testCountEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(2, result); // Expected output should be the number of even numbers
    }

    @Test
    public void testContainsPrime() {
        int[] numbers = {4, 6, 8, 9, 11};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Expected output is true, because 11 is prime
    }

    @Test
    public void testDoesNotContainPrime() {
        int[] numbers = {4, 6, 8, 9, 10};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertFalse(result); // Expected output is false, because there are no prime numbers
    }
}
