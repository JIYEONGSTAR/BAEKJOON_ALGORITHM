//�ִ�
//20200107
//oneDimensionalArrayAlgorithm

import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[9];
		int max = 0;
		int maxn = 0;
		for (int i = 0; i < 9; i++) {
			a[i] = sc.nextInt();
			if (a[i] > max) {
				max = a[i];
				maxn = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(maxn);
		sc.close();
	}

}
