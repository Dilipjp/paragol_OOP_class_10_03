package abstracttest;

public class Dog extends Animal{
	
	 String breed;
	 
	public Dog() {
		breed = "dd";
	}
	 
	public Dog(String br) {
		breed = br;
	}
	public Dog(String n, String br) {
		this(br);
		this.name = n;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("whuof whouf");
	}
	
}

