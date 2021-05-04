//점화식
//20210504
//DP
import java.util.Scanner;
public class Q13699 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(recurrence(n));
	}
	public static long recurrence(int n) {
		long t[]=new long[n+1];
		t[0]=1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				t[i]+=t[j]*t[i-1-j];
			}
		}
		return t[n];
	}
}
