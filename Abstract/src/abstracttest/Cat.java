package abstracttest;

public class Cat extends Animal {
private String color;
	
	public Cat(String n,String c) {
		super(n);
		this.color = c;
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("MIO MIO");
	}
//	
//	
	public void sleep() {
		System.out.println("Cat is  sleeping ");
	}
	
	
	

}
