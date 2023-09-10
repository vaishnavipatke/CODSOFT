package atminterface;
import java.util.Scanner;
public class AtmMachine {
	public static void main(String[] args) {
		
		
		AtmManager atmManager =new AtmManager();
		Scanner sc=new Scanner(System.in);
		for(;;)
		{
			System.out.println("1.withdraw   2.deposit  3.check balance  4.exit");

			switch(sc.nextInt())
			{
			
			case 1: atmManager.withdraw();
			break;
			
			case 2: atmManager.deposite();
			break;
			
			case 3:atmManager.checkbalance();
			break;
			
			case 4:System.exit(0);
			
			break;
			
			}
		}
	}

}
