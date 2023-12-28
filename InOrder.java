/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {
        int previousNumber = 0;
        int randomNumber = (int) Math.floor(Math.random() * (10));
        do {
            System.out.println(randomNumber);
            previousNumber = randomNumber;
            randomNumber = (int) Math.floor(Math.random() * (10));
        } while (previousNumber < 10 && randomNumber >= previousNumber);

    }
}
