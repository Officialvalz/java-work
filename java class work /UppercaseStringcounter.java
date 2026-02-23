public class UppercaseStringcounter{
	public static void main(String...args){
	
	String word = "Mr Money Rora";
	int counter = 0;
	
	
	for (int index = 0; index < word.length(); index++){
				char value = word.charAt(index);
				if (value >= 'A'  && value <= 'Z'){
				
				counter++;
				}		
	}
	System.out.println("The number of uppercase is:  " + counter);
	
	}
}
