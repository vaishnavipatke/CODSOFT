package atminterface;
import java.util.Scanner;

public class AtmManager {

	Scanner sc=new Scanner(System.in);
	double  balance=50000;
	
	
	public void withdraw()
	{
		System.out.println("enter amount:");
		 double amount=sc.nextDouble();
		if(balance>amount)
		{
			balance =balance-amount;
			System.out.println(" please collect your cash...");
		}
		
		else
		{
			System.out.println("Insufficient Balance!!!");
		}
		
		return;
		
	}
	
	
	public void deposite()
	{
		System.out.println(" enter amount :");
		double amt=sc.nextDouble();
		
		balance=balance+amt;
		System.out.println(" deposit successfully....");
		return;
		
	}
	
	public void checkbalance()
	{
		System.out.println("Balance :"+balance);
		return;
	}

}
