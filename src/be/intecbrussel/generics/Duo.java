package be.intecbrussel.generics;

public class Duo <T> { // fazladan bir type daha eklenebilir ornegin <T,U>

	private T first;
	private T second;

	public Duo() {
		super();
	}

	public Duo(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
	
	public void swap() {
		T temp = first;
		first =  second;
		second = temp;
	}

}
