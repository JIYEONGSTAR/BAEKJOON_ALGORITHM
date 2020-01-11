//정수 N개의 합
public class Q15596 {// 백준에서는 public class Test
	long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}
