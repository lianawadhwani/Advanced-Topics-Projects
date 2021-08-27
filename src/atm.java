
public class atm {
	private int money;
	
	public atm (int money)
	{
		this.money = 0;
	}
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
		atm a = new atm(0);
		a.gainMoney();
		System.out.println (a.toString());
	}
}
