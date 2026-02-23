import java.util.Scanner;
public class Transaction-Log{
		public static void main(String [ ] args){
		
		double balance = 0;
		String transactions [ ] = new String [ 500];
		int transactionCounter = 0; 
		Scanner input = new Scanner(Sytem.in);
		
		System.out.println("Welcome To The Transaction Log App$");
		
		boolean movingForward = true;
		
while (movingForward){
			
		System.out.println("\n=======  MENU  ==========");
		System.out.println("1.      Add Money");
		System.out.println("2.      Take Out Money");
		System.out.println("3.      Show History");
		System.out.println("4.      Show Balance");
		System.out.println("5.      Exit");
		System.out.println("==================");
		
		System.out.print("Enter Your Choice:   ");
		String choice = input.nextLine();
		
				
if  (choice.equals("1")){
	System.out.print("Enter Amount To Be Added:    $");
	double amount = Double.parseDouble(input.nextLine());
	
	if (amount > 0){
		balance = balance + amount;
		
		transaction [transactionCounter] = "Added   $" + amount;
		transactionCounter++;
		System.out.println("Successfully Added!    New balance:   $"  + balance);	
	}	





}
		
		
		
		
		
		
}
		
		
		
		
		
		
		
		
		
		}




}
