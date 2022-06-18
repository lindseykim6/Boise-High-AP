
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1= new Card ("10", "Clover",  10);
		Card card2= new Card("9", "Clover", 9);
		System.out.println(card1.toString());
		System.out.println(card1.matches(card2));
	}
}
