public class log {
	public static void main(String args[]) {
		System.out.printf("log 2 = %.4f\n",Math.log10(2));
		System.out.printf("log 3 = %.4f\n",Math.log10(3));
		System.out.printf("log 4 = %.4f\n",Math.log10(4));
		System.out.printf("log 5 = %.4f\n",Math.log10(5));
		System.out.printf("log 6 = %.4f\n",Math.log10(6));
		System.out.printf("log 7 = %.4f\n",Math.log10(7));
		System.out.printf("log 8 = %.4f\n",Math.log10(8));
		System.out.printf("log 9 = %.4f\n",Math.log10(9));
		System.out.printf("============\n");
		System.out.printf("log ( 2)  4 = %d\n", (int)(Math.log(4)/Math.log(2)));
		System.out.printf("log ( 2)  8 = %d\n", (int)(Math.log(8)/Math.log(2)));
		System.out.printf("log ( 2) 16 = %d\n", (int)(Math.log(16)/Math.log(2)));
		System.out.printf("log (16) 16 = %d\n", (int)(Math.log(16)/Math.log(16)));
	}
}
