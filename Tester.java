public class Tester {

	public static void main(String[] args) {
		Being human1 = new Human("Tim", 8, 4);
		Being human2 = new Human("Jonny", 4, 6);
		Being robot1 = new Robot("175040", 2, 7);
		Being robot2 = new Robot("109592", 5, 5);

		human1.sayHi(robot1);
		System.out.println("\n");

		human1.sayHi(human2);
		System.out.println("\n");

		robot1.sayHi(robot2);
		System.out.println("\n");

		robot1.sayHi(human1);
		System.out.println("\n");

		human1.fight(human2);
		System.out.println("\n");

		human2.fight(robot1);
		System.out.println("\n");
		
		robot2.fight(human1);

	}

}