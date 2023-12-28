/**
 * Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int divisorsSum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // if i is a divisor of number
                divisorsSum += i;
            }
        }
        if (divisorsSum == number) {
            System.out.printf("%d is a perfect number", number);
        } else {
            System.out.printf("%d is not a perfect number", number);
        }
    }
}
