public class UserOfRPGv3{
	public static void main(String[] args){
		//Protagonist is abstract; cannot be instantiated
		//Protagonist p0 = new Protagonist("david");
		

		//Upon removing an overriding toString...
		//error: Assassin is not abstract and does not override abstract method toString() in Protagonist
		Assassin a0 = new Assassin("tom");
		System.out.println(a0);

		Knight a1 = new Knight("bob");
		System.out.println(a1);

		Mage a2 = new Mage("joe");
		System.out.println(a2);
	}
}