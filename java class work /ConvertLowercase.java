public class ConvertLowercase{
	public static void main(String...args){
	
	String word = "emmanuel";
	String result = "";
	
	for (int count = 0; count < word.length(); count++){
			char index = word.charAt(count);
			if (index >= 'a' && index <= 'z'){
				result += (char)(index - 32);

			} else {
					result += index;
			}
	}
	System.out.println("successfully converted to uppercase -> " + result);
	}
}
