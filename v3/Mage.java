public class Mage extends Protagonist{

	public Mage(String username){
		super(username);
		health *= .6;
		strength *= .8;
		defense *= .5;
		attack *= 3;
	}

	public String toString(){
        return "Class: Mage " 
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
		defense = 20;
		attack = 1.2;
    }
}