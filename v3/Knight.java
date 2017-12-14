public class Knight extends Protagonist{

	public Knight(String username){
		super(username);
		health *= 1.1;
		strength *= 1.2;
		defense *= 1.3;
		attack *= 1.3;
	}

	public String toString(){
        return "Class: Knight " 
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
		defense = 52;
		attack = 0.52;
    }
}