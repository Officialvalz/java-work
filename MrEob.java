public class MrEob {
    public static void main(String[] args) {
        int  max = 4;
        int size = 2 * max - 1;

for (int marker = 1; marker <= size; marker++) {
	for (int eob = 1; eob <= size; eob++) {
		int top    = marker;
		int left   = eob;
		int bottom = size - marker + 1;
		int right  = size - eob + 1;

		int min = Math.min(Math.min(top, bottom), Math.min(left, right));

		System.out.print(max - min + 1);
	}
	
	System.out.println();
	
	}
	}
	
}
