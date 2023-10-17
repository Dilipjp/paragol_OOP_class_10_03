package abstracttest;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		Animal cat = new Cat("pashmak", "White");
		
		dog.sleep();
		dog.sound();
		
		cat.sleep();
		cat.sound();
		
	}

}
