package inheritance_poly_contain_interface;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person("Jack", new Dog());
		Person p2=new Person("Jill", new Cat());
		p1.hasapet.setBreed("Lab");
		p1.hasapet.setName("Scrabby");
		p2.hasapet.setBreed("Tabby");
		p2.hasapet.setName("Figaro");
		p1.hasapet.petEat();
		p2.hasapet.petTricks();
		System.out.println(p1.toString());
		Pet ofp1=new Dog();
		p1.hasapet=ofp1;
		
		System.out.println(p1.hasapet.getName());
		
		
		
	}
}
