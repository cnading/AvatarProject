
public class Earth extends Benders
	{
	@Override
	protected void fight()
		{
			System.out.println("Pulls giant rock ball from earth and hurls it toward enemy.");

		}

	@Override
	protected void talk()
		{
			System.out.println("I hope to one day be able to molten bend.");

		}

	@Override
	protected void meditate()
		{
			System.out.println("Not really a fan of meditation, you learn about life by living it!");

		}

	@Override
	protected void eat()
		{
			System.out.println("Agriculture is a huge part of the Earth Kingdom, so I'm stuffed.");

		}

	@Override
	protected void run()
		{
			System.out.println("Stand on a rock platform and makes it fly away with me on it");
		}

	public Earth(String n, String nR, int lb, String h, int a, int w, int p, int e, int s, int sW, String st)
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
