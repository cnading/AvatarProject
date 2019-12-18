
public class BendingMaster extends Benders
			{
				@Override
				protected void fight()
					{
						// TODO Auto-generated method stub

					}

				@Override
				protected void talk()
					{
						// TODO Auto-generated method stub

					}

				@Override
				protected void meditate()
					{
						System.out.println("Wise move, sometimes it pays off to think rather than react. ");

					}

				@Override
				protected void eat()
					{
						// TODO Auto-generated method stub

					}

				@Override
				protected void run()
					{
						// TODO Auto-generated method stub

					}

				public BendingMaster(String n, String nR, int lb, String h, int a, int w, int p, int e, int s, int sW, String st)
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
