public class Dragon extends Monster{

	public Dragon(){
		
		health *= 2;
		strength *= 1.5;
		defense *= 1.3;
		attack *= 1.3;
	}

	public String toString(){
        return "Dragon: " + " hp=" + health + " strength=" + strength + " def=" + defense + " atk=" + attack + System.lineSeparator();
    }
}