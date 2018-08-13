package be.intecbrussel.generics;

public class Duo {

	private Object first;
	private Object second;

	public Duo() {
		super();
	}

	public Duo(Object first, Object second) {
		super();
		this.first = first;
		this.second = second;
	}

	public Object getFirst() {
		return first;
	}

	public void setFirst(Object first) {
		this.first = first;
	}

	public Object getSecond() {
		return second;
	}

	public void setSecond(Object second) {
		this.second = second;
	}
	
	public void swap() {
		Object temp = first;
		first =  second;
		second = temp;
	}

}
