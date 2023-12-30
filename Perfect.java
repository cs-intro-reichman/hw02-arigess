/**
 * Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        String perfectString = String.format("%d is a perfect number since %d = 1", number, number);
        int divisorsSum = 1; // 1 is always a divisor of any integer
        for (int i = 2; i < number; i++) {
            if (number % i == 0) { // if i is a divisor of number
                divisorsSum += i;
                perfectString += " + " + i;
            }
        }
        if (divisorsSum == number) {
            System.out.printf(perfectString);
        } else {
            System.out.printf("%d is not a perfect number", number);
        }
    }
}
