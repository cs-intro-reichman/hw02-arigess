/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
    public static void main(String[] args) {
        int numberOfLines = Integer.parseInt(args[0]);
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                if (i % 2 == 0) { //in even lines, we will start with *
                    System.out.print("* ");
                } else { // in odd lines, we will start with a space
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
