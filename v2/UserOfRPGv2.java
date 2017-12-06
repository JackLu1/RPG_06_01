public class UserOfRPGv2{
	public static void main(String[] args){

		Protagonist[] agents = new Protagonist[6];

		//Prediction: will fail at compilation. Edit: correct prediction 
		//Error: incompatible types: <Protagonist class> cannot be converted to Monster
		//Monster[] agents = new Monster[6];

		Assassin a0 = new Assassin("Assassin0");
		agents[0] = a0;
		Knight a1 = new Knight("Knight1");
		agents[1] = a1;
		Mage a2 = new Mage("Mage2");
		agents[2] = a2;
		// Dragon a3 = new Dragon();
		// agents[3] = a3;
		// Orc a4 = new Orc();
		// agents[4] = a4;
		// Ghoul a5 = new Ghoul();
		// agents[5] = a5;

		int i = 0;
		while (i < agents.length){
			System.out.println(agents[i]);
			i++;
		}

		//Prediction: error at compilation. Edit: correct prediction
		//Error: cannot find symbol System.out.println(agents[i].getName());
		int j = 0;
		while (j < 3){
			System.out.println(agents[i].getName());
			j++;
		}
		


		// Protagonist template = new Protagonist("Default Protagonist");
		// System.out.println(template);

		// Assassin steve = new Assassin("assassin steve");
		// System.out.println(steve);

		// Knight bob = new Knight("warrior bob");
		// System.out.println(bob);

		// Mage joe = new Mage("mage joe");
		// System.out.println(joe);

		// Dragon tim = new Dragon();
		// System.out.println("Dragon " + tim);

		// Orc james = new Orc();
		// System.out.println("Orc " + james);

		// Ghoul thomas = new Ghoul();
		// System.out.println("Ghoul " + thomas);

		// Monster mon = new Monster();
		// System.out.println(mon);

		// Character cha = new Character();
		// System.out.println(cha);
	}
}