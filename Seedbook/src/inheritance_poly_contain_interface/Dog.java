package inheritance_poly_contain_interface;

public class Dog extends Pet {

	@Override
	public void petTalk() {
		System.out.println("Woof");
		
	}

	@Override
	public void petEat() {
		
		System.out.println("Give me a bone");
	}

	@Override
	public void petWalk() {
		
		System.out.println("Yay! to the park");
	}

	@Override
	public void petTricks() {
		// TODO Auto-generated method stub
		System.out.println("I am roll over");
	}

}
