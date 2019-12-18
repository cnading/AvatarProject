import java.util.ArrayList;
import java.util.Scanner;


public class Runner {
	static Scanner userInput = new Scanner(System.in);
	static Scanner userInput1 = new Scanner(System.in);
	static FightMaster fightMaster;
	static YoungFighter youngFighter;
	static BendingMaster bendingMaster;
	static Air airBender;
	static Fire fireBender;
	static Water waterBender;
	static Earth earthBender;
	static Avatar hero;
	static String name;
	static String nation;
	static double cm;
	static double feet;
	static double inches;
	static String stats;
	static ArrayList<Person> world = new ArrayList<Person>();

	public static void main(String[] args) {
		greetings();
		intro();

	}

	private static void greetings() {
		int temp = RollDice.rollTwoHundred();
		if (temp < 35) {
			nation = "Water";
		} else if (temp > 35 && temp < 100) {
			nation = "Fire";
		} else if (temp > 100 && temp < 175) {
			nation = "Earth";
		} else if (temp > 175 && temp < 199) {
			nation = "Air";
		} else if (temp == 200) {
			nation = "Avatar";
		}
		
		System.out.println("Welcome to the world of Avatar!");
		System.out.println("(PRESS ENTER)");
		userInput.nextLine();
		System.out.println("Let's begin with creating you, kind hero, what is your name?");
		System.out.println("(TYPE NAME THEN PRESS ENTER)");
		name = userInput.nextLine();
		System.out.println("Welcome " + name + ", ");
		System.out.println("This first step will change the path of the game...");
		System.out.println("Would you like to \n1) Be a young bender on a journey seeking to master their skills"
				+ "\n2) Be a wise bending master teaching your students "
				+ "\n3) A non-bender seeking to master the art of a combat with your weapon(s) of choice."
				+ "\n4) A very skilled and lethal fighter who teaches only the worthy their skills.");

		System.out.println("(RETURN 1, 2, 3, or 4)");
		int path = userInput1.nextInt();
		if (path == 1) {
			if (nation.equals("Air")) {
				setAirBenderStats();
			} else if (nation.equals("Earth")) {
				setEarthBenderStats();
			} else if (nation.equals("Fire")) {

				setFireBenderStats();
			} else if (nation.equals("Water")) {
				setWaterBenderStats();
			} else if (nation.equals("Avatar")) {
				setAvatarStats();
			}
		}
		
//		} else if (path == 2) {
//			bendingMaster = new BendingMaster("", "", 0, "", 0, 0, 0, 0, 0, 0);
//			bendingMaster.nationRes = nation;
//			setBendingMstrStats();
//		} else if (path == 3) {
//			fightMaster = new FightMaster("", "", 0, "", 0, 0, 0, 0, 0, 0, "");
//			fightMaster.nationRes = nation;
//			setFightMasterStas();
//
//		} else if (path == 4) {
//			youngFighter = new YoungFighter("", "", 0, "", 0, 0, 0, 0, 0, 0, "");
//			youngFighter.nationRes = nation;
//			setYoungFighter();
//
//		}
	}
	

	private static void setAvatarStats() {
		Avatar hero= new Avatar("", "", 0, "", 0, 0, 0, 0, 0, 0, "");
		hero.nationRes = "Air";
		System.out.println(name + ", press enter to generate your statistics, and they will be determined at random.");
		userInput.nextLine();
		hero.name = name;
		hero.weight = RollDice.rollWeight();
		cm = RollDice.rollHeight();
		inches = cm / 2.54;
		feet = inches / 12;
		inches = inches % 12;
		if ((int) inches == 0) {
			hero.height = (int) feet + " ft";
		} else {
			hero.height = (int) feet + " ft " + (int) inches + " in";
		}
		hero.age = RollDice.rollYoungAge();
		hero.wisdom = RollDice.rollThirty() - 2;
		hero.power = RollDice.rollThirty() + 15;
		hero.evil = RollDice.rollThirty() - 4;
		hero.skill = RollDice.rollThirty() + 10;
		hero.spiritWrld = RollDice.rollThirty() + 12;
		hero.stats = (" Stats-\n Name: " + hero.name + "\n Nation Resided: " + hero.nationRes + "\n " + "Weight: "
				+ hero.weight + " pounds\n Height: " + hero.height + "\n Age: " + hero.age + "\n Wisdom: " + hero.wisdom
				+ "\n Power: " + hero.power + "\n Evil: " + hero.evil + "\n Skill: " + hero.skill + "\n "
				+ "Connection to the Spirit World: " + hero.spiritWrld);
		System.out.println(hero.stats);
		System.out.println("Your strengths and weaknesses, can be utilized to you advantage...");
		world.add(hero);
		
		
	}

	private static void setWaterBenderStats() {
		Water waterBender= new Water("", "", 0, "", 0, 0, 0, 0, 0, 0, "");		
		waterBender.nationRes = nation;
		System.out.println(name + ", press enter to generate your statistics, and they will be determined at random.");
		userInput.nextLine();
		waterBender.name = name;
		waterBender.weight = RollDice.rollWeight();
		cm = RollDice.rollHeight();
		inches = cm / 2.54;
		feet = inches / 12;
		inches = inches % 12;
		if ((int) inches == 0) {
			waterBender.height = (int) feet + " ft";
		} else {
			waterBender.height = (int) feet + " ft " + (int) inches + " in";
		}
		waterBender.age = RollDice.rollYoungAge();
		waterBender.wisdom = RollDice.rollThirty() + 5;
		waterBender.power = RollDice.rollThirty() - 3;
		waterBender.evil = RollDice.rollThirty() - 2 ;
		waterBender.skill = RollDice.rollThirty() + 1;
		waterBender.spiritWrld = RollDice.rollThirty() + 2;
		waterBender.stats=(" Stats-\n Name: " + waterBender.name + "\n Nation Resided: " + waterBender.nationRes + "\n " + "Weight: "
				+ waterBender.weight + " pounds\n Height: " + waterBender.height + "\n Age: " + waterBender.age + "\n Wisdom: " + waterBender.wisdom
				+ "\n Power: " + waterBender.power + "\n Evil: " + waterBender.evil + "\n Skill: " + waterBender.skill + "\n "
				+ "Connection to the Spirit World: " + waterBender.spiritWrld);
		System.out.println(waterBender.stats);
		System.out.println("Your strengths and weaknesses, can be utilized to you advantage...");
		world.add(waterBender);
		
	}

	private static void setFireBenderStats() {
		Fire fireBender= new Fire("", "", 0, "", 0, 0, 0, 0, 0, 0, "");
		fireBender.nationRes = nation;
		System.out.println(name + ", press enter to generate your statistics, and they will be determined at random.");
		userInput.nextLine();
		fireBender.name = name;
		fireBender.weight = RollDice.rollWeight();
		cm = RollDice.rollHeight();
		inches = cm / 2.54;
		feet = inches / 12;
		inches = inches % 12;
		if ((int) inches == 0) {
			fireBender.height = (int) feet + " ft";
		} else {
			fireBender.height = (int) feet + " ft " + (int) inches + " in";
		}
		fireBender.age = RollDice.rollYoungAge();
		fireBender.wisdom = RollDice.rollThirty() - 3;
		fireBender.power = RollDice.rollThirty() + 5;
		fireBender.evil = RollDice.rollThirty() + 3;
		fireBender.skill = RollDice.rollThirty() + 2;
		fireBender.spiritWrld = RollDice.rollThirty() - 4;
		fireBender.stats=(" Stats-\n Name: " + fireBender.name + "\n Nation Resided: " + fireBender.nationRes + "\n " + "Weight: "
				+ fireBender.weight + " pounds\n Height: " + fireBender.height + "\n Age: " + fireBender.age + "\n Wisdom: " + fireBender.wisdom
				+ "\n Power: " + fireBender.power + "\n Evil: " + fireBender.evil + "\n Skill: " + fireBender.skill + "\n "
				+ "Connection to the Spirit World: " + fireBender.spiritWrld);
		System.out.println(fireBender.stats);
		System.out.println("Your strengths and weaknesses, can be utilized to you advantage...");
		world.add(fireBender);
		
	}

	private static void setEarthBenderStats() {
		Earth earthBender = new Earth("", "", 0, "", 0, 0, 0, 0, 0, 0, "");
		earthBender.nationRes = nation;
		System.out.println(name + ", press enter to generate your statistics, and they will be determined at random.");
		userInput.nextLine();
		earthBender.name = name;
		earthBender.weight = RollDice.rollWeight();
		cm = RollDice.rollHeight();
		inches = cm / 2.54;
		feet = inches / 12;
		inches = inches % 12;
		if ((int) inches == 0) {
			earthBender.height = (int) feet + " ft";
		} else {
			earthBender.height = (int) feet + " ft " + (int) inches + " in";
		}
		earthBender.age = RollDice.rollYoungAge();
		earthBender.wisdom = RollDice.rollThirty() - 2;
		earthBender.power = RollDice.rollThirty() + 6;
		earthBender.evil = RollDice.rollThirty() + 1;
		earthBender.skill = RollDice.rollThirty() + 2;
		earthBender.spiritWrld = RollDice.rollThirty() - 2;
		earthBender.stats =(" Stats-\n Name: " + earthBender.name + "\n Nation Resided: " + earthBender.nationRes + "\n " + "Weight: "
				+ earthBender.weight + " pounds\n Height: " + earthBender.height + "\n Age: " + earthBender.age + "\n Wisdom: " + earthBender.wisdom
				+ "\n Power: " + earthBender.power + "\n Evil: " + earthBender.evil + "\n Skill: " + earthBender.skill + "\n "
				+ "Connection to the Spirit World: " + earthBender.spiritWrld);
		System.out.println(earthBender.stats);
		System.out.println("Your strengths and weaknesses, can be utilized to you advantage...");
		world.add(earthBender);
		
	}

	private static void setAirBenderStats() {
		Air airBender = new Air("", "", 0, "", 0, 0, 0, 0, 0, 0, "");
		airBender.nationRes = nation;
		System.out.println(name + ", press enter to generate your statistics, and they will be determined at random.");
		userInput.nextLine();
		airBender.name = name;
		airBender.weight = RollDice.rollWeight();
		cm = RollDice.rollHeight();
		inches = cm / 2.54;
		feet = inches / 12;
		inches = inches % 12;
		if ((int) inches == 0) {
			airBender.height = (int) feet + " ft";
		} else {
			airBender.height = (int) feet + " ft " + (int) inches + " in";
		}
		airBender.age = RollDice.rollYoungAge();
		airBender.wisdom = RollDice.rollThirty() + 6;
		airBender.power = RollDice.rollThirty() - 2;
		airBender.evil = RollDice.rollThirty() - 3;
		airBender.skill = RollDice.rollThirty() + 3;
		airBender.spiritWrld = RollDice.rollThirty() + 8;
		
		airBender.stats=(" Stats-\n Name: " + airBender.name + "\n Nation Resided: " + airBender.nationRes + "\n " + "Weight: "
				+ airBender.weight + " pounds\n Height: " + airBender.height + "\n Age: " + airBender.age + "\n Wisdom: " + airBender.wisdom
				+ "\n Power: " + airBender.power + "\n Evil: " + airBender.evil + "\n Skill: " + airBender.skill + "\n "
				+ "Connection to the Spirit World: " + airBender.spiritWrld);
		System.out.println(airBender.stats);
		System.out.println("Your strengths and weaknesses, can be utilized to you advantage...");
		world.add(airBender);
		
	}
//
//	private static void setYoungFighter() {
//		
//	}
//
//	private static void setFightMasterStas() {
//		
//
//	}
//
//	private static void setBendingMstrStats() {
//		
//
//	}

	private static void intro() {
		System.out.println("\nPress Enter to see your unique abilities...");
		userInput.nextLine();
		for(Person p: world)
		{
//			System.out.println(p.stats); ????
			System.out.println("Talk: ");p.talk();
			System.out.println("Fight: ");p.fight();
			System.out.println("Run: ");p.run();
			System.out.println("Eat: ");p.eat();
			
		}

	}

}
