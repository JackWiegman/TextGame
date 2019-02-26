public class Being {

	int intelligence, strength;
	String name;

	public Being(String name, int intelligence, int strength) {
		this.name = name;
		this.intelligence = intelligence;
		this.strength = strength;
	}

	public String sayHi(Being b) {
		return "Hello";
	}


}