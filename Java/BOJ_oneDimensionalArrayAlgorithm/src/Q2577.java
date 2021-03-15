//������ ����
//20200107
//oneDimensionalArrayAlgorithm

import java.util.Scanner;

public class Q2577 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = a * b * c;
		int num[] = new int[10];
		while (n != 0) {
			for (int i = 0; i < 10; i++) {
				if (n % 10 == i)
					num[i]++;
			}
			// System.out.print(n%10);
			n = n / 10;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
		sc.close();
	}
}
