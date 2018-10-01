public class Log {
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

/*
Output:
----
log 2 = 0.3010
log 3 = 0.4771
log 4 = 0.6021
log 5 = 0.6990
log 6 = 0.7782
log 7 = 0.8451
log 8 = 0.9031
log 9 = 0.9542
============
log ( 2)  4 = 2
log ( 2)  8 = 3
log ( 2) 16 = 4
log (16) 16 = 1
*/
