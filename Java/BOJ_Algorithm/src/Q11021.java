//A+B - 7
//20200106
//forAlgorithm

import java.util.Scanner;

public class Q11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();// 몇개 입력받을지

		int a[] = new int[n];// 배열초기화
		int b[] = new int[n];
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();// 입력
			b[i] = scanner.nextInt();
			c[i] = a[i] + b[i];// c[i]에 값 저장
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Case #" + (i + 1) + ": " + c[i]);
		}
		scanner.close();
	}

}
