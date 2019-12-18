
public class RollDice
	{
		static int total;

		public static int rollThree()
			{
				total = (int) (Math.random() * 3) + 1;
				return total;
			}

		public static int rollTen()
			{
				total = (int) (Math.random() * 10) + 1;
				return total;
			}

		public static int rollThirty()
			{
				total = (int) (Math.random() * 30) + 1;
				return total;
			}
		public static int rollYoungAge()
			{
				total = (int) (Math.random() * 15) + 13;
				return total;
			}
		public static int rollOldAge()
			{
				total = (int) (Math.random() * 70) + 13;
				return total;
			}
		
		public static int rollWeight()
			{
				total = (int) (Math.random() * 200) + 100;
				return total;
			}
		public static int rollHeight()
			{
				total = (int) (Math.random() * 60) + 150;
				return total;
			}
		
		public static int rollTwoHundred()
			{
				total = (int) (Math.random() * 200) + 1;
				return total;
			}
		

	}
