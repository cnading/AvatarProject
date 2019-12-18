
public class Fire extends Benders
	{
	@Override
	protected void fight()
		{
			System.out.println("Summons electricity from the sky and shoots at ooponet.");

		}

	@Override
	protected void talk()
		{
			System.out.println("Mother always said, if you don't have anything nice to say dont say it at all.");

		}

	@Override
	protected void meditate()
		{
			System.out.println("I seek the secrets of the Spirit World!");

		}

	@Override
	protected void eat()
		{
			System.out.println("Mostly only eat spicy foods and meat.");

		}

	@Override
	protected void run()
		{
			System.out.println("The only way I refuse a fight is if I'm dead.");

		}

	public Fire(String n, String nR, int lb, String h, int a, int w, int p, int e, int s, int sW, String st)
	{
		name = n;
		nationRes = nR;
		weight = lb;
		height = h;
		age = a;
		wisdom = w;
		power = p;
		evil = e;
		skill = s;
		spiritWrld = sW;
		stats= st;
	

	}
	}
