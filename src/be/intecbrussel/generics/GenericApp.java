package be.intecbrussel.generics;

public class GenericApp {

	public static void main(String[] args) {
		Duo<String> duo = new Duo<String>(new String("Hello"), new String(" World"));
		Duo duo1 = new Duo(new Integer(5), new Integer(5));
		printDuo(duo);
		System.out.println((duo.getFirst()).toUpperCase()); // getFirst string olmadigi icin casting ile print
																		// etmis oluyoruz.
		System.out.println("Duo1 First: " + duo1.getFirst() + "second object of duo1 is: " + duo1.getSecond());

	}

	private static void printDuo(Duo duo) {
		System.out.println("Duo First: " + duo.getFirst() + "second object of duo is: " + duo.getSecond());
	}

}
