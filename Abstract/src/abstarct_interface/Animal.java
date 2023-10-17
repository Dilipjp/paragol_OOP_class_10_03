package abstarct_interface;

public abstract class Animal {
	private String name;
	
	public Animal(String n) {
		name = n;
	}
	
	public abstract void move();
	
	public void sleep() {
		System.out.println("animal sleeping");
	}
	
}
