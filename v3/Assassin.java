public class Assassin extends Protagonist{

	public Assassin(String username){
		super(username);
		health *= .75;
		strength *= 1.5;
		defense *= .75;
		attack *= 2;
	}

	public String toString(){
        return "Class: Assassin " 
        		+ System.lineSeparator() + "Name = " + name 
        		+ System.lineSeparator() + "Health = " + health 
        		+ System.lineSeparator() + "Strength = " + strength
        		+ System.lineSeparator() + "Defense = " + defense
        		+ System.lineSeparator() + "Attack = " + attack + System.lineSeparator();
    }

    public abstract void specialize () {
		int boost =  1 + (int) (Math.random() * defense);
		defense -= boost;
		attack += boost;
    }

    public abstract void normalize () {
		defense = 30;
		attack = 0.8;
    }
}