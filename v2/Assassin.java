public class Assassin extends Protagonist{

	public Assassin(String username){
		super(username);
		health *= .75;
		strength *= 1.5;
		defense *= .75;
		attack *= 2;
	}

}