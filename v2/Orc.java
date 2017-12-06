public class Orc extends Monster{
	public Orc(){
		health *= 1.25;
		strength *= 1.2;
		defense *= 0.9;
		attack *= 0.9;
	}

	public String toString(){
        return "Orc: " + " hp=" + health + " strength=" + strength + " def=" + defense + " atk=" + attack + System.lineSeparator();
    }
}