import java.util.Scanner;
public class Product{
    public static void main(String[] args){

         Scanner input = new Scanner(System.in);

         System.out.println("Enter first Number");
         int firstNum = input.nextInt();

         System.out.println("Enter second Number");
         int secondNum = input.nextInt();

        System.out.print("Enter third Number");
        int thirdNum = input.nextInt();

        int sum = firstNum + secondNum + thirdNum;
        int average = sum /3;
        int product = firstNum * secondNum * thirdNum;

        System.out.println("Display total results");
        System.out.printf("Show total sum: %d%n", sum);
        System.out.printf("Show total average: %d%n", average);
        System.out.printf("Show total product: %d%n", product);


   }

}
