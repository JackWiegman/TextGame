public class Being {

	int intelligence, strength;
	String name;

	// Constructor
	public Being(String name, int intelligence, int strength) {
		this.name = name;
		this.intelligence = intelligence;
		this.strength = strength;
	}
	

	public String sayHi(Being b) {
		return "Hi";
	}

	public boolean fight(Being b) {
		return false;
	}


	// GETTERS
	public String getName() {
		return name;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getStrength() {
		return strength;
	}

	// SETTERS
	public void setName(String newName) {
		name = newName;
	}
	public void setIntelligence(int newInt) {
		intelligence = newInt;
	}
	public void setStrength(int newStr) {
		strength = newStr;
	}


}