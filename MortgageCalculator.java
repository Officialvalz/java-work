import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	
		System.out.print("Enter Loan Amount:$");
		double principal = input.nextDouble();
		
		
		System.out.print("Enter Annual Interest Rate:%");
		double annualRate = input.nextDouble();
		
		
		System.out.print("Enter Loan Term In Years:");
		int years = input.nextInt();
		
		 double monthlyRate = annualRate / 100 / 12;
        int numberOfPayments = years * 12;
      
				double monthlyPayment;
				
		  if (monthlyRate == 0) {
            	 monthlyPayment = principal / numberOfPayments;
        
         }else{
        	 monthlyPayment = principal *
        	 (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) / (Math.pow
        	 (1 + monthlyRate, numberOfPayments) - 1);
        
        }
		
		System.out.printf("Your Monthly Payment is: $%.2f%n",  monthlyPayment);
		
	
	
	}





}
