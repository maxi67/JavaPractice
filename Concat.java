public class Concat {
	public static void main(String args[]) {
		long time1, time2, time3, time4;
		String s1, s2;
		StringBuilder sb = new StringBuilder("");
		
		for (int k = 100; k <= 100000; k *= 10) {
			//Reset
			s1 = "";
			s2 = "";
			sb.delete(0, sb.length());
			time1 = System.currentTimeMillis();
	        
			for (int i = 1; i < k; i++)
				s1 = s1.concat(String.valueOf(i));
			time2 = System.currentTimeMillis();

			for (int i = 1; i < k; i++)
				s2 = s2 + String.valueOf(i);
			time3 = System.currentTimeMillis();
	        
			for (int i = 1; i < k; i++)
				sb.append(String.valueOf(i));
			time4 = System.currentTimeMillis();
	        
			//Result
			System.out.printf("k = %d, (1~%d)\n", k, k);
			System.out.printf("S=S+\"?\" ：%.6f 秒\n", (float)(time2-time1)/1000);
			System.out.printf("Concat ：%.6f 秒\n", (float)(time3-time2)/1000);
			System.out.printf("StringBuilder ：%.6f 秒\n", (float)(time4-time3)/1000);
			System.out.println("---------------------------------------");
		}
	}
}
/*
Output:
k = 100, (1~100)
S=S+"?" ：0.000000 秒
Concat ：0.001000 秒
StringBuilder ：0.000000 秒
---------------------------------------
k = 1000, (1~1000)
S=S+"?" ：0.002000 秒
Concat ：0.004000 秒
StringBuilder ：0.000000 秒
---------------------------------------
k = 10000, (1~10000)
S=S+"?" ：0.118000 秒
Concat ：0.188000 秒
StringBuilder ：0.001000 秒
---------------------------------------
k = 100000, (1~100000)
S=S+"?" ：7.133000 秒
Concat ：16.170000 秒
StringBuilder ：0.005000 秒
---------------------------------------
*/
