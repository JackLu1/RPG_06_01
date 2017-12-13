public class Mage extends Protagonist{

	public Mage(String username){
		super(username);
		health *= .6;
		strength *= .8;
		defense *= .5;
		attack *= 3;
		attack -= attack % .01;
	}

	public String toString(){
        return "Mage: " + name + " hp=" + health + " strength=" + strength + " def=" + defense + " atk=" + attack + System.lineSeparator();
    }
}