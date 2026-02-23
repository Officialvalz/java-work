import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TransactionLog{
			
		static double balance = 0;
		static String transactions [ ] = new String [ 100];
		static int transactionCounter = 0; 	
		static Scanner input = new Scanner(System.in);
		
		LocalDateTime currentTime = LocalDateTime.now();
		static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
		String formattedTime = currentTime.format(formatter);
		
		public static void main(String [ ] args){
		System.out.println("Welcome To The Transaction Log App$");
		
		var movingForward = true;
		
while (movingForward){
			
		System.out.println("\n=======  MENU  ==========");
		System.out.println("1.      Add Money");
		System.out.println("2.      Take Out Money");
		System.out.println("3.      Show History");
		System.out.println("4.      Show Balance");
		System.out.println("5.      Exit");
		System.out.println("==================");
		
		System.out.print("ENTER YOUR CHOICE: ");
		String choice = input.nextLine();
		
				
if  (choice.equals("1")){
	System.out.print("Enter Amount To Be Added:$");
	var amount = Double.parseDouble(input.nextLine());
	
	if (amount > 0){
		balance = balance + amount;
		transactions [transactionCounter] = "Added$" + amount + "\n|  Date: "+ LocalDateTime.now().format(formatter);
		transactionCounter++;
		System.out.println("Successfully Added$      \nNew   Balance:$"  + balance);
	}else{
			System.out.println("Amount Must be greater than 0 ");
		
	}
	
	}else if   (choice.equals("2")){
		
		System.out.print("Enter Amount to take out:$");
		var amount = Double.parseDouble(input.nextLine());
		
		if (amount > 0 && amount <=  balance){
			balance = balance - amount;
			transactions [transactionCounter] = "Withdrawed$" + amount + "\n|  Date: "+ LocalDateTime.now().format(formatter); 
			transactionCounter++;
			System.out.println("Withdrawal Successful!      \nNew  balance:$"    + balance);
		}else if (amount > balance){
				System.out.println("Not Enough Money$");
		}else{
			System.out.println("Amount Must Be Greater Than 0");	
		}
	
	
	}else if   (choice.equals("3")){
	
			System.out.println("\n------------  Transaction  History       ----------");
			if (transactionCounter == 0) {
						System.out.println("You Dont Have Any Transaction At The Moment");
						
			}else{
					for (var Counter = 0; Counter < transactionCounter; Counter++){
							System.out.println((Counter + 1) + ". "  + transactions[Counter]);
					}
			
			}
			 System.out.println("===========================");
			 
	}else if (choice.equals("4")){
				System.out.println("Your balance:$"  +  balance);
				
	}else if (choice.equals("5")){
			System.out.println("End Of Transaction");
			movingForward = false;
			
	}else{
			System.out.println("Invalid Selection!        \nSelect A Number From 1-5");
	}	
		
				
}
		
		
		
		
		
		
		
		
		
		}




}
