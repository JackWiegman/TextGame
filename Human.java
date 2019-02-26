// CAN HAVE A NAME
// HAVE INTELLIGENCE RATING
// CAN SAYhI TO ANOTHER HUMAN -> random choice INFLUENCED BY INTELLINGENCE
//							  -> to robots: "Hello robot number #{robot's id number}. 
//							 	 Make me a sandwhich"
// can fight -> other humans: always loses to a higher strngth rating,
// 				unless int is greater than twice as big, loses 50% of the time.
//			 -> robots: always wins, but loses 1 strength point

public class Human extends Being{

	int intelligence;
	int strength;
	String name;

	public Human(String name, int intelligence, int strength) {
		this.name = name;
		this.intelligence = intelligence;
		this.strength = strength;
	}



}