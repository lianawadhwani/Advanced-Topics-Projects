import java.util.HashMap;

public class atm {
	private String iD;
	private HashMap <String,Double> bankAccounts = new HashMap <String,Double>(); 
	public void deposit(String iD, double amount)
	{
		if (amount < 0)
		{
			System.out.println ("Can't deposit a negative amount");
		    return;
		}
		this.iD = iD;
		if (bankAccounts.isEmpty() || !bankAccounts.containsKey((this.iD)))
		{
			bankAccounts.put(this.iD, amount);
			//System.out.println ("ID didn't exist. Created and Deposited " + amount);
		}
		else
		{
			double oldMoney = (double) bankAccounts.get(this.iD);
			bankAccounts.put(this.iD, oldMoney + amount);
			//System.out.println ("ID existed. Deposited " + amount + ". There is now " + bankAccounts.get(this.iD) + " in this account.");
		}
	}
	/*public static void main (String [] args)
	{
		atm a = new atm ();
		a.deposit("505", 100);
		a.deposit("202", 50);
		a.deposit("1234567812", 1);
		a.deposit("505", 10);
		a.deposit("303039384875", -20);
	}*/
}
