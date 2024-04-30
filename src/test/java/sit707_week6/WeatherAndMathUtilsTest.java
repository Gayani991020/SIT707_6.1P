package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
    @Test
    public void testStudentIdentity() {
        String studentId = "223656754"; 
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Upeksha Dilshan"; 
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testFalseNumberIsEven() {
        int oddNumber = 3; // An odd number
        Assert.assertFalse(WeatherAndMathUtils.isEven(oddNumber));
    }

    @Test
    public void testTrueNumberIsEven() {
        int evenNumber = 4; // An even number
        Assert.assertTrue(WeatherAndMathUtils.isEven(evenNumber));
    }

    @Test
    public void testCancelWeatherAdvice_DangerousWind() {
        String advice = WeatherAndMathUtils.weatherAdvice(70.1, 0.0); // Dangerous wind
        Assert.assertEquals("CANCEL", advice);
    }

    @Test
    public void testCancelWeatherAdvice_DangerousRain() {
        String advice = WeatherAndMathUtils.weatherAdvice(10.0, 6.1); // Dangerous rain
        Assert.assertEquals("CANCEL", advice);
    }

    @Test
    public void testWarnWeatherAdvice_ModerateWind() {
        String advice = WeatherAndMathUtils.weatherAdvice(50.0, 3.0); // Moderate wind, safe rain
        Assert.assertEquals("WARN", advice);
    }

    @Test
    public void testWarnWeatherAdvice_ModerateRain() {
        String advice = WeatherAndMathUtils.weatherAdvice(30.0, 4.1); // Safe wind, moderate rain
        Assert.assertEquals("WARN", advice);
    }

    @Test
    public void testAllClearWeatherAdvice() {
        String advice = WeatherAndMathUtils.weatherAdvice(30.0, 2.0); // Safe conditions
        Assert.assertEquals("ALL CLEAR", advice);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWeatherAdviceNegativeValues() {
        WeatherAndMathUtils.weatherAdvice(-1.0, -1.0); // Negative values should throw exception
    }

    @Test
    public void testIsPrime() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2)); // Prime
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3)); // Prime
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4)); // Not prime
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5)); // Prime
    }

    @Test
    public void testPrimeNumberOne() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(1)); // Special case for prime
    }
}
