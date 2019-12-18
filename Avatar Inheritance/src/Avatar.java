
public class Avatar extends Benders
	{
	@Override
	protected void fight()
		{
			System.out.println("Enters the Avatar state and is crazy powerful.");

		}

	@Override
	protected void talk()
		{
			System.out.println("I am the keeper of peace and the connection between the spirit and material world.");

		}

	@Override
	protected void meditate()
		{
			System.out.println("I seek advice from the past Avatars.");

		}

	@Override
	protected void eat()
		{
			System.out.println("As a master over self I can go months without eating.");

		}

	@Override
	protected void run()
		{
			System.out.println("The Avatar NEVER runs away from a fight!");

		}

	public Avatar(String n, String nR, int lb, String h, int a, int w, int p, int e, int s, int sW, String st)
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
