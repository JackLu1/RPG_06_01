public class Monster extends Character{

    public Monster () {
	health = 150;
	strength = 20 + (int) (Math.random() * 65);
	defense = 20;
	attack = 1;
    }

    public String toString(){
        return "Monster: " + " hp=" + health + " strength=" + strength + " def=" + defense + " atk=" + attack + System.lineSeparator();
    }
}
