public class ConvertUppercase{
	public static void main(String...args){
	
	String word ="EOB";
	String result = "";
	
for (int counter= 0; counter < word.length(); counter++){
	char index = word.charAt(counter);
			if (index >= 'A' && index <= 'Z'){
				result += (char)(index  + 32);

			} else {
					result += index;
			}
	}
	System.out.println("successfully converted to lowercase -> " + result);

}

	
		
	
	}
