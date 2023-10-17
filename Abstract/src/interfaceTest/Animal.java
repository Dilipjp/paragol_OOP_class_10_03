package interfaceTest;
public interface Animal {
	public static final String name = "PAshmak";
	
	public void sound() ;
	
}

class Dog implements Animal{

	String breed;
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("WOOF WOOF");
	}
	
	public void sleeping() {
		System.out.println("Dog is sleeping");
	}
	
}
class Cat implements Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("MIO MIO");
	}
	
}
