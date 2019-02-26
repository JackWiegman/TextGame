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

}