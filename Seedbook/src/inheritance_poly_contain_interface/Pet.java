package inheritance_poly_contain_interface;

public abstract class Pet {
	String Breed;
	String Name;
	public abstract void petTalk();
	public abstract void petEat();
	public abstract void petWalk();
	public abstract void petTricks();
	
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

	

}
