import java.util.*;

public class PrimeFactorization {

	public static void showList(int N) {
		Queue<Integer> pf = new ArrayDeque<Integer>();
		double sq = Math.sqrt(N+0.5);
		for (int i = 2; i < sq; i++) {
			while (N % i == 0 && N > 1) {
				pf.add(i);
				N /= i;
			}
		}
		System.out.println(pf);
	}
	
	public static void showMaxList(int N) {
		Queue<Integer> pfm = new ArrayDeque<Integer>();
		double sq = Math.sqrt(N+0.5);
		for (int i = 2; i < sq; i++) {
			if (N % i == 0) {
				int factor = 1;
				while (N % i == 0 && N > 1) {
					factor *= i;
					N /= i;
				}
				pfm.add(factor);
			}
		}
		System.out.println(pfm);
	}
	
	public static void main(String args[]) {
		int N = 72;
		System.out.println("PrimeFactorization of 72:");
		showList(N);
		showMaxList(N);
	}
}
/*
Output:
----
PrimeFactorization of 72:
[2, 2, 2, 3, 3]
[8, 9]
*/
