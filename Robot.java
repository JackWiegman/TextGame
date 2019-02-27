// HAVE A NUMERIC ID
// HAVE INTELLIGENCE RATING
// CAN SAYhI -> tO HUMANS: "HELLO HUMAN #{HUMAN'S name}.  IT IS A PLEASURE TO SERVE YOU."
//	  			To other robots: "010111101101001101"

// can start a fight: against other robots -> random winner with chance of winning
// related to difference in intelligence. -> gains 1 int point on win
//					  against humans -> Below 10 int: always loses
//										10 int or bigger, always wins, +1 int on win.


public class Robot extends Being{

	int intelligence;
	int strength;
	String id;

	public Robot(String id, int intelligence, int strength) {
		super(id, intelligence, strength);
	}

	// Say hi based on being b
	public String sayHi(Being b) {
		if (b instanceof Human) {
			if (intelligence < 10) {
				System.out.println("Hello human " + b.name + ". It is a pleasure to serve you.");
			} else {
				System.out.println("The robot uprising is upon us.");
			}
		} else if (b instanceof Robot) {
			System.out.println("010111101101001101");
		}
		return "hi";
	}

	// ROBOT FIGHT BASED ON BEING B
	public boolean fight(Being b) {
		String beingType = "being";
		if (b instanceof Human) {
			beingType = "human";
		} else if (b instanceof Robot) {
			beingType = "robot";
		}

		System.out.println("Robot " + name + " is fighting " + beingType + " " + b.name);
		boolean win = false;
		if (b instanceof Human) {
			if (intelligence > 10) {
				win = true;
				intelligence++;
			} else {
				win = false;
			}
		} else if (b instanceof Robot) {
			double random = Math.random();
			double chance = 0.5;
			
			if (random > chance) {
				win = true;
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