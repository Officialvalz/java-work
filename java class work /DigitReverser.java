public class DigitReverser{
	public static void main(String...args){
	
	int number = 123456789;
	String numStr = String.valueOf(number);
	String reversed = "";
	
for (int count = 0; count < numStr.length(); count++){
		reversed = numStr.charAt(count) + reversed;

}
System.out.println(reversed);	
	
	
	
	
	
	
	
	
	
	
	
	}
}
