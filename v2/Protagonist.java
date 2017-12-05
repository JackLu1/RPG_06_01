public class Protagonist extends Character {
    
    protected String name;
    
    public Protagonist (String username) {
	name = username;
	health = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }

    public String getName () {
	return name;
    }

    public void specialize () {
	int boost =  1 + (int) (Math.random() * defense);
	defense -= boost;
	attack += boost;
    }

    public void normalize () {
	defense = 40;
	attack = 0.4;
    }
}
	   

    
