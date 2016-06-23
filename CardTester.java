package eleven;

public class CardTester {

	public static void main(String[] args) {
		Card one = new Card("A", "Diamond", 1);

		
		System.out.println(one.rank());
		System.out.println(one.suit());
		System.out.println(one.pointValue());
		
		System.out.println(one.matches(one));
		System.out.println(one.toString());
	}

}
