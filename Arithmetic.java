import java.util.Scanner;
public class Arithmetic{
	public static void main(String[ ] args){
	
		Scanner input = new Scanner(System.in)	;
		
		System.out.println("Enter first Number: ");
		int firstNumber = input.nextInt();
	
	
		System.out.println("Enter second Number: ");
		int secondNumber = input.nextInt();
	
	
		int squareOfFirstNumber = firstNumber * firstNumber; 
		int squareOfSecondNumber = secondNumber * secondNumber;
		System.out.printf("The squares of first number %d%n And The squares of second number is %d%n  ",squareOfFirstNumber, squareOfSecondNumber);
		
		int sum  = squareOfFirstNumber + squareOfSecondNumber;
		System.out.printf("The sum of squares is %d%n",sum);
		
		int difference = squareOfFirstNumber -  squareOfSecondNumber;
		System.out.printf("The difference of squares is %d%n",difference);
		
	
	
	
	}



}
