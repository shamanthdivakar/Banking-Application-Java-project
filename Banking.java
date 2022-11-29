import java.util.*;
public class Banking {
	
	void booz() {
		long updatedamt=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the account holder:");
		String name = sc.nextLine();
		
	 
	
	
      		
		System.out.println("enter the Account number:");
		long accountNo = sc.nextLong();
		
		long totamt = 1000000;
		
		System.out.println("Account holder name:"+name);
		System.out.println("Account number:"+accountNo);
		System.out.println("Balance:"+totamt);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the account type\n 1. Current\n 2. Savings\n");

		
		
		System.out.println("Do you want to deposite or withdrawal");
		System.out.println("enter 1 for Deposite\n");
		System.out.println("enter 0 for Withdrawal\n");
		Scanner ob = new Scanner(System.in);
		int decide = ob.nextInt();
		
		switch(decide)
		{
		 
		
		
		
		
		
		case 1: System.out.println("enter the amout you want to deposite");
		
		        long deposite = ob.nextLong();
		       // ob.booz();
		      //  updatedamt = totamt+deposite;
		    //    System.out.println("The updated amount is:"+updatedamt);
		        break;
		
		case 2: System.out.println("enter the withdrawal amount\n");
				long withdraw = ob.nextLong();
			//	updatedamt = totamt-withdraw;
			//	System.out.println("The updated amount is:"+updatedamt);
				break;
		
		}
		
		
		
		
		
		
		
		
		
		

	}
}

