
public class atm {
	private int money;
	public int gainMoney()
	{
		money += 100; 
		return money;
	}
	
	public String toString ()
	{
		return "" + money;
	}
	
	public static void main (String [] args)
	{
		atm a = new atm();
		a.gainMoney();
		System.out.println (a.toString());
	}
}
