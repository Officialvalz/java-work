public class VowelCounter{
	public static void main(String...args){
	
	String word = "Community";
	int start = 0;
	String vowels = "aeiouAEIOU";
	
	for (int counter = 1; counter < word.length(); counter++){
			char index = word.charAt(counter);
				if (vowels.indexOf(index) != -1){
					start++;
				}
				
	}
		System.out.println("Vowels>>>  " + start);	
	
	
	
	
	}
}
