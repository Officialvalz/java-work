public class ChristmasSong{
		public static void main(String [ ] args){
		
			for(int number = 1; number <= 12; number++) {
			
				switch (number) {
			
					case 1:
						System.out.println("On the first day of christmas"); break;
					case 2: 
						System.out.println("On the second day of christmas"); break;
					case 3:
						System.out.println("On the third day of christmas"); break;
					case 4:
						System.out.println("On the fourth day of christmas"); break;
					case 5:
						System.out.println("On the fifth day of christmas"); break;
					case 6: 
						System.out.println("On the sixth day of christmas"); break;
					case 7:
						System.out.println("On the seventh day of christmas"); break;
					case 8: 
						System.out.println("On the eight day of christmas"); break;
					case 9:
						System.out.println("On the ninth day of christmas"); break;
					case 10:
						System.out.println("On the tenth day of christmas"); break;
					case 11:
						System.out.println("On the eleventh day of christmas"); break;
					case 12: 
						System.out.println("On the twelvth day of christmas");	 break;
				}
									
				System.out.println("My true love gave to me");
											
									
				for (int secondNumber = number; secondNumber >= 1; secondNumber--) {
		
					switch (secondNumber) {
								
						case 1:
							System.out.println("A patridge in a pear tree");  break;
						case 2:
							System.out.println("Two turtle doves");  break;
						case 3:
							System.out.println("Three French hens");  break;
						case 4:
							System.out.println("Four calling birds"); break;
						case 5:
							System.out.println("Five golden rings"); break;
						case 6:
							System.out.println("Six geese a-laying"); break;
						case 7:
							System.out.println("Seven swans a-swimming"); break;
						case 8:
							System.out.println("Eight maids a-milking"); break;
						case 9:
							System.out.println("Nine ladies dancing"); break;
						case 10:
							System.out.println("Ten lords a-leaping"); break;
						case 11:
							System.out.println("Eleven pipers piping"); break;
						case 12:
							System.out.println("Twelve drummers drumming");		
					}				
				}
				System.out.println();
			}
		}
}
