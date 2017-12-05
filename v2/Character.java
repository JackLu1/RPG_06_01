public class Character {

    protected int health;
    protected int strength;
    protected int defense;
    protected double attack;

    public boolean isAlive () {
	return health > 0;
    }

    public int getDefense () {
	return defense;
    }

    public void lowerHP (int damage) {
	health -= damage;
    }

     public int attack (Character target) {
	int damage = (int) (strength * attack - target.getDefense() );
	target.lowerHP(damage);
    return damage;
    }
}
