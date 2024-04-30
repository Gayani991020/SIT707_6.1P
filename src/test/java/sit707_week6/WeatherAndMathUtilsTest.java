package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
    @Test
    public void testStudentIdentity() {
        // Test that the student ID is not null
        String studentId = "223986848"; 
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        // Test that the student name is not null
        String studentName = "Gayani Abewickrama"; 
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testFalseNumberIsEven() {
        // Test that an odd number is not considered even
        int oddNumber = 3; // An odd number
        Assert.assertFalse(WeatherAndMathUtils.isEven(oddNumber));
    }

    @Test
    public void testTrueNumberIsEven() {
        // Test that an even number is considered even
        int evenNumber = 4; // An even number
        Assert.assertTrue(WeatherAndMathUtils.isEven(evenNumber));
    }

    @Test
    public void testCancelWeatherAdvice_DangerousWind() {
        // Test canceling weather advice for dangerous wind conditions
        String advice = WeatherAndMathUtils.weatherAdvice(70.1, 0.0); // Dangerous wind
        Assert.assertEquals("CANCEL", advice);
    }

    @Test
    public void testCancelWeatherAdvice_DangerousRain() {
        // Test canceling weather advice for dangerous rain conditions
        String advice = WeatherAndMathUtils.weatherAdvice(10.0, 6.1); // Dangerous rain
        Assert.assertEquals("CANCEL", advice);
    }

    @Test
    public void testWarnWeatherAdvice_ModerateWind() {
        // Test warning weather advice for moderate wind and safe rain
        String advice = WeatherAndMathUtils.weatherAdvice(50.0, 3.0); // Moderate wind, safe rain
        Assert.assertEquals("WARN", advice);
    }

    @Test
    public void testWarnWeatherAdvice_ModerateRain() {
        // Test warning weather advice for safe wind and moderate rain
        String advice = WeatherAndMathUtils.weatherAdvice(30.0, 4.1); // Safe wind, moderate rain
        Assert.assertEquals("WARN", advice);
    }

    @Test
    public void testAllClearWeatherAdvice() {
        // Test all clear weather advice for safe conditions
        String advice = WeatherAndMathUtils.weatherAdvice(30.0, 2.0); // Safe conditions
        Assert.assertEquals("ALL CLEAR", advice);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeatherAdviceNegativeValues() {
        // Test that negative values throw an IllegalArgumentException
        WeatherAndMathUtils.weatherAdvice(-1.0, -1.0); // Negative values should throw exception
    }

    @Test
    public void testIsPrime() {
        // Test whether numbers are prime or not
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2)); // Prime
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3)); // Prime
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4)); // Not prime
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5)); // Prime
    }

    @Test
    public void testPrimeNumberOne() {
        // Test that 1 is considered a prime number (a special case)
        Assert.assertTrue(WeatherAndMathUtils.isPrime(1)); // Special case for prime
    }
}
