package be.intecbrussel.generics;

public class GenericApp {

	public static void main(String[] args) {
		Duo duo = new Duo(new String("Hello"), new Integer(5));
		
		printDuo(duo);
		System.out.println(((String) duo.getFirst()).toUpperCase()); // getFirst string olmadigi icin casting ile print etmis oluyoruz.
	

	}
	
	private static void  printDuo(Duo duo) {
		System.out.println("Duo First: " + duo.getFirst()+ "second object of duo is: "+ duo.getSecond());
	}

}
