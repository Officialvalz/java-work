public class LowercaseCounter{
	public static void main(String...args){
	
	String word = "Paradise";
	int count = 0;
	
	for (int counter = 0; counter < word.length(); counter++){
		char index = word.charAt(counter);
		if (index >= 'a'  && index <= 'z'){
					count++;
				}		
	}
	System.out.println("The number of lowercase is:  " + count);
	
	
	}
}
