// CAN HAVE A NAME
// HAVE INTELLIGENCE RATING
// CAN SAYhI TO ANOTHER HUMAN -> random choice INFLUENCED BY INTELLINGENCE
//							  -> to robots: "Hello robot number #{robot's id number}. 
//							 	 Make me a sandwhich"
// can fight -> other humans: always loses to a higher strngth rating,
// 				unless int is greater than twice as big, loses 50% of the time.
//			 -> robots: always wins, but loses 1 strength point,  unless robot int > 10: always loses

public class Human extends Being{

	int intelligence;
	int strength;
	String humanName;

	public Human(String humanName, int intelligence, int strength) {
		super(humanName, intelligence, strength);
	}

	// Say hi based on being b
	// Add human responses
	public String sayHi(Being b) {
		if (b instanceof Human) {
			// BASED OFF INTELLIGENCE
			System.out.println("Hi, " + b.getName());
		} else if (b instanceof Robot) {
			System.out.println("Hello robot " + b.getName() + ". Make me a sandwhich.");
		}
		return "hi";
	}

	// HUMAN FIGHT BASED ON BEING B
	public boolean fight(Being b) {
		String beingType = "being";
		if (b instanceof Human) {
			beingType = "human";
		} else if (b instanceof Robot) {
			beingType = "robot";
		}
		System.out.println("Human " + name + " is fighting " + beingType + " " + b.name);

		boolean win = false;
		if (b instanceof Human) {
			double chance = Math.random();
			if (b.getStrength() > getStrength()) {
				win = false;
			} else if (getIntelligence() > b.getIntelligence()) {
				win = true;
			} else {
				if (chance > 0.5) {
					win = true;
				} else {
					win = false;
				}
			}
		} else if (b instanceof Robot) {
			if  (b.getIntelligence() > 10) {
				win = false;
				b.setIntelligence(intelligence + 1);
			} else {
				win = true;
				setStrength(strength - 1);
			}
		}

		if (win) {
			System.out.println(name + " won the fight.");
		} else {
			System.out.println(b.getName() + " won the fight.");
		}

		return win;
	}
}