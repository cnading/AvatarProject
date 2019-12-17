import java.util.Scanner;

public class Runner
	{
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput1 = new Scanner(System.in);
		static Benders hero;
		static FightMaster fightMaster;
		static SkilledFighters skilledFighter;
		static BendingMaster bendingMaster;
		static String name;
		static double cm;
		static double feet;
		static double inches;

		public static void main(String[] args)
			{
				greetings();
				intro();
			}

		private static void greetings()
			{
				System.out.println("Welcome to the world of Avatar!");
				System.out.println("(PRESS ENTER)");
				userInput.nextLine();
				System.out.println("Let's begin with creating you, kind hero, what is your name?");
				System.out.println("(TYPE NAME THEN PRESS ENTER)");
				name = userInput.nextLine();
				System.out.println("Welcome " + name + ", ");
				System.out.println("This first step will change the path of the game...");
				System.out
						.println("Would you like to \n1) Be a young bender on a journey seeking to master their skills"
								+ "\n2) Be a wise bending master teaching your students "
								+ "\n3) A non-bender seeking to master the art of a combat with your weapon(s) of choice."
								+ "\n4) A very skilled and lethal fighter who teaches only the worthy their skills.");

				System.out.println("(RETURN 1, 2, 3, or 4)");
				int path = userInput.nextInt();
				if (path == 1)
					{
						setBenderStats();
					} else if (path == 2)
					{
						setBendingMstrStats();
					}
					else if (path==3){
						setFighterStas();
					}
					else if (path==4){
						setFightMstr();
					}

			}

		private static void setFightMstr()
			{
				fightMaster = new FightMaster("", "", 0, "", 0, 0, 0, 0, 0, 0);
				
			}

		private static void setFighterStas()
			{
				skilledFighter = new SkilledFighters("", "", 0, "", 0, 0, 0, 0, 0, 0);
				
			}

		private static void setBendingMstrStats()
			{
				bendingMaster = new BendingMaster("", "", 0, "", 0, 0, 0, 0, 0, 0);
				
			}

		private static void setBenderStats()
			{
				hero = new Benders("", "", 0, "", 0, 0, 0, 0, 0, 0);
				System.out.println( name + ", ");
				System.out.println("Your statistics for the rest of the game will now be determined at random.");
				System.out.println("(PRESS ENTER)");
				userInput.nextLine();
				hero.name = name;
				hero.weight = RollDice.rollWeight();
				int temp = RollDice.rollTwoHundred();
				if (temp < 35)
					{
						hero.nationRes = "Water";
					} else if (temp > 35 && temp < 100)
					{
						hero.nationRes = "Fire";
					} else if (temp > 100 && temp < 175)
					{
						hero.nationRes = "Earth";
					} else if (temp > 175 && temp < 199)
					{
						hero.nationRes = "Air";
					} else if (temp == 200)
					{
						hero.nationRes = "Avatar";
					}
				cm = RollDice.rollHeight();
				inches = cm / 2.54;
				feet = inches / 12;
				inches= inches%12;
				if ((int)inches == 0)
					{
						hero.height = (int) feet + " ft";
					} else
					{
						hero.height = (int) feet + " ft " + (int) inches + " in";
					}
				hero.age = RollDice.rollYoungAge();
				hero.wisdom = RollDice.rollThirty() - 3;
				hero.power = RollDice.rollThirty() + 5;
				hero.evil = RollDice.rollThirty()+ 3;
				hero.skill = RollDice.rollThirty()- 1;
				hero.spiritWrld = RollDice.rollThirty()-2;
				System.out.println(" Stats-\n Name: " + hero.name + "\n Nation Resided: " + hero.nationRes + "\n "
						+ "Weight: " + hero.weight + " pounds\n Height: " + hero.height + "\n Age: " + hero.age
						+ "\n Wisdom: " + hero.wisdom + "\n Power: " + hero.power + "\n Evil: " + hero.evil
						+ "\n Skill: " + hero.skill + "\n " + "Connection to the Spirit World: " + hero.spiritWrld);
				System.out.println("Your strengths and weaknesses, can be utilized to you advantage...");
			}

		private static void intro()
			{

			}

	}
