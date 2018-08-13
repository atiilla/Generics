package be.intecbrussel.generics;

public class GenericApp {

	public static void main(String[] args) {
		// STRING
		Duo<String> duo = new Duo<>(new String("Hello"), new String(" World"));

		// INTEGER
		Duo<Integer> duo1 = new Duo<>(new Integer(5), new Integer(5));

		// getFirst string olmadigi icin casting ile print etmis oluyoruz.
		System.out.println((duo.getFirst()).toUpperCase());

		System.out.println("Duo1 First: " + duo1.getFirst() + " second object of duo1 is: " + duo1.getSecond());

		printDuo(duo);

	}

	private static void printDuo(Duo duo) {
		System.out.println("Duo First: " + duo.getFirst() + " second object of duo is: " + duo.getSecond());
	}

}
