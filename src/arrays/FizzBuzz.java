package arrays;


public class FizzBuzz {

    public static byte[] fizzBuzz(int number) {
        if (number == 0) {
            throw new IllegalArgumentException();
        } else if ((number % 3 == 0) && (number % 5 == 0)) {
            return parseString("fizzbuzz");
        } else if (number % 3 == 0) {
            return parseString("fizz");
        } else if (number % 5 == 0) {
            return parseString("buzz");
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static byte[] parseString(String word) {
        return word.getBytes();
    }
}
