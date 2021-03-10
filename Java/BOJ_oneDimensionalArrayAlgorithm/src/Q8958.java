
//OX퀴즈
import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String p[] = new String[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.next();// 입력
		}
		int k = 0;
		int sum[] = new int[n];
		for (int j = 0; j < n; j++) {
			k = 0;
			char[] q = p[j].toCharArray();// 배열을 char로 하나하나씩받기
			for (int i = 0; i < q.length; i++) {
				if (q[i] == 'O') {
					k = k + 1;
					sum[j] = sum[j] + k;
				} else
					k = 0;

			}

		}
		for (int i = 0; i < n; i++)
			System.out.println(sum[i]);
		sc.close();
	}

}
