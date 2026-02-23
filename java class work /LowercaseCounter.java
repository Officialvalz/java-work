public class LowercaseCounter{
	public static void main(String...args){
	
	String word = "Paradise";
	var count = 0;
	
	for (int counter = 0; counter < word.length(); counter++){
		var index = word.charAt(counter);
		if (index >= 'a'  && index <= 'z'){
					count++;
				}		
	}
	System.out.println("The number of lowercase is:  " + count);
	
	
	}
}
