public class TestRPG{
	public static void main(String[] args){

		Protagonist template = new Protagonist("Default Protagonist");
		System.out.println(template);

		Assassin steve = new Assassin("assassin steve");
		System.out.println(steve);

		Knight bob = new Knight("warrior bob");
		System.out.println(bob);

		Mage joe = new Mage("mage joe");
		System.out.println(joe);

		// Monster mon = new Monster();
		// System.out.println(mon);

		// Character cha = new Character();
		// System.out.println(cha);
	}
}