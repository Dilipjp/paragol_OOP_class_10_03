package abstarct_interface;

public class Cat extends Animal implements Sound{

	public Cat(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("MIO MIO");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("cat is moving");
	}



}

