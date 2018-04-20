public class DecimaltoBaseN {
	public static String getBaseN(int num, int N) {
		String ans = "";
		while (true) {
			ans = String.valueOf(num % N).concat(ans);
			
			if (num < N)
				break;
			
			num /= N;
		}
		return ans;
	}
	
	public static void main(String args[]) {
		System.out.println("Init num: 100(Decimal)");
		System.out.println("Binary:");
		// Way 1:
		System.out.println("Way1: " + Integer.toBinaryString(100));
		// Way 2:	
		System.out.println("Way2: " + getBaseN(100, 2));
		
		System.out.println("==========================");
		System.out.println("Octal(Base 8):");
		// Way 1:
		System.out.println("Way1: " + Integer.toOctalString(100));
		// Way 2:	
		System.out.println("Way2: " + getBaseN(100, 8));
	}
}
