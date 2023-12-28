
/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
    public static void main(String[] args) {
        boolean isBoy = false, isGirl = false;
        int childrenCount = 0;
        while (!isBoy || !isGirl) { // keep having babies until you have both a boy and a girl
            double randomValue = Math.random();
            if (randomValue < 0.5) { //then we say it's a boy
                isBoy = true;
                System.out.print("b ");
            } else { // then we say it's a girl
                isGirl = true;
                System.out.print("g ");
            }
            childrenCount++;
        }
        System.out.println();
        System.out.printf("You made it... and you now have %d children", childrenCount);
    }
}
