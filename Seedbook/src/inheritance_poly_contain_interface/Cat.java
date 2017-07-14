package inheritance_poly_contain_interface;

public class Cat extends Pet{

	@Override
	public void petTalk() {
		// TODO Auto-generated method stub
		System.out.println("Purr");
	}

	@Override
	public void petEat() {
		// TODO Auto-generated method stub
		System.out.println("Give me a fish");
	}

	@Override
	public void petWalk() {
		// TODO Auto-generated method stub
		System.out.println("No");
	}

	@Override
	public void petTricks() {
		// TODO Auto-generated method stub
		System.out.println("You can do tricks human");
	}

}
