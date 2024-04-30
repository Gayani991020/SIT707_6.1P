package sit707_week6;

public class ConditionalLoops {
    // Loop with simple statements
    public static int countEvenNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (WeatherAndMathUtils.isEven(number)) {
                count++;
            }
        }
        return count;
    }

    // Loop with conditional statements
    public static boolean containsPrime(int[] numbers) {
        for (int number : numbers) {
            if (WeatherAndMathUtils.isPrime(number)) {
                return true;
            }
        }
        return false;
    }
}
