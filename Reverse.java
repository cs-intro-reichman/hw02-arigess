/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String phrase = args[0];
		for (int i=0; i< phrase.length(); i++){
			System.out.print(phrase.charAt(phrase.length() - 1 - i));
		}
		System.out.println();
		char middleChar = phrase.charAt((int)Math.ceil((double)phrase.length()/2) - 1);
		System.out.printf("The middle character is %c", middleChar);
	}
}
