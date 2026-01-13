import java.util.Scanner;

public class SemicolonStoreCheckoutSystem {

  public static void main(String[] args) {
  
  	Scanner input = new Scanner(System.in);
    
    String[] productNames = {"Pack of marker", "Flashdrives", "Keyboard", "Jotters", "Headphones", "Monitors"};
    double[] productPrices = {2500, 5000, 1000, 6000, 8000, 9500};
    
    System.out.println("Enter Customer Name: ");
    String customerName = input.nextLine();
	
	 System.out.println("\n AVAILABLE PRODUCT IN STORE#");
	
	 for (int index = 0; index < productNames.length; index++){
	  System.out.println((index + 1) + "  " +  productNames[index] + " $" + productPrices[index]); 
	 }
	
	System.out.println("\n LIST OF THE DIFFERENT PRODUCT THE CUSTOMER IS BUYING");
	int numberOfItems = input.nextInt();
	int [] cartProductIndexes = new int [numberOfItems];
	int [] cartQuantities = new int [numberOfItems];
	
	
	for (int index = 0; index <= numberOfItems; index++){
	System.out.println("\n Enter Product Number " + (1-  + productNames.length  )  + ":"  );
	int productChoice = input.nextInt();
	cartProductIndexes[index] = productChoice - 1;
	  
	System.out.println("Enter Quatity Of Product:  ");
	cartQuantities[index] = input.nextInt();
	
	}
	
	}



}
