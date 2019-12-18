
public class Water extends Benders
	{
	@Override
	protected void fight()
		{
			System.out.println("Uses water to form numerable tenticles to fight.");

		}

	@Override
	protected void talk()
		{
			System.out.println("I hope to one day be able to blood bend");

		}

	@Override
	protected void meditate()
		{
			System.out.println("I want to learn the secrets of healing from my ancestors.");

		}

	@Override
	protected void eat()
		{
			System.out.println("Fish... what else would you expect.");

		}

	@Override
	protected void run()
		{
			System.out.println("Freezes water into ice and skates away!");

		}

	public Water(String n, String nR, int lb, String h, int a, int w, int p, int e, int s, int sW, String st)
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
