public class Ghoul extends Monster{
	public Ghoul(){
		health *= 0.6;
		strength *= 1.2;
		defense *= 0.75;
		attack *= 1.5;
	}

	public String toString(){
        return "Ghoul: " + " hp=" + health + " strength=" + strength + " def=" + defense + " atk=" + attack + System.lineSeparator();
    }
}