
public abstract class SkilledFighters extends Person {
	protected String name;
	protected String nationRes;
	protected int weight;
	protected String height;
	protected int age;
	protected int wisdom;
	protected int power;
	protected int evil;
	protected int skill;
	protected int spiritWrld;
	protected String weapon;
	protected String stats;

	protected abstract void fight();

	protected abstract void talk();

	protected abstract void meditate();

	protected abstract void eat();

	protected abstract void run();
}
