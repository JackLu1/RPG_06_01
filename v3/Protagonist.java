public abstract class Protagonist extends Character {
    
    protected String name;
    
    public Protagonist (String username) {
		name = username;
		health = 125;
		strength = 100;
		defense = 40;
		attack = 0.4;
    }

    public abstract String toString();	//Prints out Protagonist stats
	public abstract void specialize();	//Modify attack and defense stats
    public abstract void normalize();	//Restores attack and defense stats (based on subclass)

    public String getName(){
		return name;
    }

    

    //Compilation error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
    //Compilation error: abstract methods cannot have a body
}
//Upon instantialization: Protagonist is abstract; cannot be instantiated	   

    
