
public class Air extends Benders
	{
	@Override
	protected void fight()
		{
			System.out.println("I don't fight I'm too peaceful. I will dodge though!");

		}

	@Override
	protected void talk()
		{
			System.out.println("I hope to one day be able to fly...");

		}

	@Override
	protected void meditate()
		{
			System.out.println("As you medidate, your connection to the spirt world contiuos to grow.");

		}

	@Override
	protected void eat()
		{
			System.out.println("Everyone knows airbenders don't eat meat!");

		}

	@Override
	protected void run()
		{
			System.out.println("Hop on ball of air and speed away!");

		}

	public Air(String n, String nR, int lb, String h, int a, int w, int p, int e, int s, int sW, String st)
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
