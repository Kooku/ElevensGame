package eleven;

public class DeckTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] ranks = { "Ace", "Jack", "Queen", "King", "2", "3", "4", "5",
				"6", "7", "8", "9", "10" };
		String[] suits = { "Spades", "Diamonds", "Hearts", "Clubs" };
		int[] values = { 1, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Deck d = new Deck(ranks, suits, values);
		System.out.println(d.isEmpty());
		System.out.println("There are " + d.size() + " number of cards.");
		System.out.println(d.toString());
		
	}

}
