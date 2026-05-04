
public class Cheetah extends Animal {
	public void eat() {
		System.out.println("Cheetah eats meat");
	}

	public void mammal() {
		Cheetah c = new Cheetah();
		c.eat();
		super.eat();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetah obj = new Cheetah();
		obj.mammal();

	}

}
