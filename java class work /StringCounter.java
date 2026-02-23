public class StringCounter{
	public static void main(String...args){
	
	String word = "Semicolon Africa Software Institute";
	int count = 0;
	for(int index = 0; index < word.length(); index++){
		if (word.charAt(index) == 'e'){
				count++;
		}
	
	}
	System.out.println("count of 'e':  " + count);
	
	
	
	
	
	}









}
