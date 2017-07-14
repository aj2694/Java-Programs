package inheritance_poly_contain_interface;

public class Person {
	String name;
	Pet hasapet;
	
	public Person(String name, Pet hasapet) {
		super();
		this.name = name;
		this.hasapet = hasapet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pet getHasapet() {
		return hasapet;
	}
	public void setHasapet(Pet hasapet) {
		this.hasapet = hasapet;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", hasapet=" + hasapet.getName() + "Petbreed"
				+ hasapet.getBreed() + "]";
	}
	

}
