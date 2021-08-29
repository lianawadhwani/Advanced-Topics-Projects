import java.util.HashMap;

public class atm {
	private String iD;
	private static HashMap bankAccounts; 
	bankAccounts = new HashMap();
	
	public atm (String iD)
	{
		this.iD = iD;
	}
	public void deposit(long iD, double amount)
	{
		this.iD = "" + iD;
		double oldMoney = (double) bankAccounts.get(this.iD);
		if (bankAccounts.containsKey((this.iD)))
		{
			bankAccounts.put(this.iD, oldMoney + amount);
		}
		else
		{
			bankAccounts.put(this.iD, amount);
		}
	}
}
