/*Outputs:
s1 = abcdefghij
s1.length() = 10
-----------------------------
s2 = s1.substring(2, 5)
s2 = cde
s2.length() = 3
=============================
arr = 1 2 3 4 5 6 7 8 9 10 

Arrays.fill(arr, 2, 5, 0):
fill arr with 0 from index 2 to 5

arr = 1 2 0 0 0 6 7 8 9 10 
import java.util.Arrays;
*/
public class IndexFromTo {
	public static void main(String args[]) {
		String s1 = "abcdefghij";
		String s2 = s1.substring(2, 5);
		System.out.println("s1 = " + s1);
		System.out.println("s1.length() = " + s1.length());
		System.out.println("-----------------------------");
		System.out.println("s2 = s1.substring(2, 5)");
		System.out.println("s2 = " + s1.substring(2, 5));
		System.out.println("s2.length() = " + s2.length());
		System.out.println("=============================");
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.print("arr = ");
		for (int n: arr)
			System.out.print(n + " ");
		System.out.println("\n");
		
		System.out.println("Arrays.fill(arr, 2, 5, 0):\nfill arr with 0 from index 2 to 5\n");
		Arrays.fill(arr, 2, 5, 0);
		
		System.out.print("arr = ");
		for (int n: arr)
			System.out.print(n + " ");
		System.out.println("\n");
	}
}

