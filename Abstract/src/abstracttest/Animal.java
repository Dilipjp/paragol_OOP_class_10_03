package abstracttest;

public abstract class Animal {
	
	 String name;
	
	public Animal() {
		name = "gdgd";
	}
	
	public Animal(String n) {
		name = n;
	}
	//abstract class
	public abstract void sound() ;
	//normal method
	public void sleep() {
		System.out.println("animal sleeping ");
	}
	
	

}

