import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);
		int twoChildren = 0, threeChildren = 0, fourPlusChildren = 0;
		int totalChildren = 0;
		for (int i = 0; i < T; i++) {
			//an experiment
			boolean isBoy = false, isGirl = false;
			int childrenCount = 0;
			while (!isBoy || !isGirl) { // keep having babies until you have both a boy and a girl
				double randomValue = generator.nextDouble();
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
		System.out.println("Average: " + (double)totalChildren / T + " children to get at least one of each gender.");
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
