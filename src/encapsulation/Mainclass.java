package encapsulation;

class Account 
{
	private double bal;

	public double getBal() // returns current value of Bal
	{
		return bal;
	}

	public void setBal(double bal) // update new value of Bal
	{
		if (bal > 0) 
		{
			this.bal = bal;
		} 
		else 
		{
			System.out.println("INVALID AMT");
		}
	}
}

class Transaction 
{
	public static void debit(Account ref, int amt) 
	{
		double b1 = ref.getBal();// current bal
		b1 = b1 - amt;// calc new bal
		ref.setBal(b1); // update new bal
	}

	public static void credit(Account ref, int amt) 
	{
		double b1 = ref.getBal();// current bal
		b1 = b1 + amt;// calc new bal
		ref.setBal(b1); // update new bal
	}

	public static void checkBal(Account ref) 
	{
		double b1 = ref.getBal();
		System.out.println("Bal : " + b1);
	}
}

public class Mainclass 
{
	public static void main(String[] args)
	{
		Account a1 = new Account();
		Account a2 = new Account();

		Transaction.credit(a1, -1000);
		Transaction.checkBal(a1);

		Transaction.checkBal(a2);
	}
}
