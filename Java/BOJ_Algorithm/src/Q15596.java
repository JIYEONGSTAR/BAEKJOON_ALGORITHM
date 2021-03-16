//정수 N개의 합
//20200108
//functionAlgorithm

public class Q15596 {// 클래스 이름 public class Test
	long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}
