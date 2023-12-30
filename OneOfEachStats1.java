/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get one command-line argument: an int value
 * that determines how many families to simulate.
 */
public class OneOfEachStats1 {
    public static void main(String[] args) {
        //int experimentsCount = Integer.parseInt(args[0]);
        int experimentsCount = 5;
        int twoChildren = 0, threeChildren = 0, fourPlusChildren = 0;
        int totalChildren = 0;
        for (int i = 0; i < experimentsCount; i++) {
            //an experiment
            boolean isBoy = false, isGirl = false;
            isBoy = false;
            isGirl = false;
            int childrenCount = 0;
            while (!isBoy || !isGirl) { // keep having babies until you have both a boy and a girl
                double randomValue = Math.random();
                if (randomValue < 0.5) { //then we say it's a boy
                    isBoy = true;
                } else { // then we say it's a girl
                    isGirl = true;
                }
                childrenCount++;
            }
            //after the experiment
            totalChildren += childrenCount;
            if (childrenCount == 2) {
                twoChildren++;
            } else if (childrenCount == 3) {
                threeChildren++;
            } else {
                fourPlusChildren++;
            }
        }
        System.out.println("Average: " + (double)totalChildren / experimentsCount + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twoChildren);
        System.out.println("Number of families with 3 children: " + threeChildren);
        System.out.println("Number of families with 4 or more children: " + fourPlusChildren);
        String mostCommonChildren = "4 or more.";
        if (twoChildren >= threeChildren && twoChildren >= fourPlusChildren){
            mostCommonChildren = "2.";
        } else if (threeChildren >= twoChildren && threeChildren >= fourPlusChildren) {
            mostCommonChildren = "3.";
        }
        System.out.println("The most common number of children is " + mostCommonChildren);

    }
}
