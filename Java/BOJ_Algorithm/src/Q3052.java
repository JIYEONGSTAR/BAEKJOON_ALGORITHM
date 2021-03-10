//������
//20200107
//oneDimensionalArrayAlgorithm

import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int a[] = new int[10];// �Է¹���
		int b[] = new int[10];// ������
		int c[] = new int[42];// �������� �����
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i] % 42;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 42; j++) {
				if (b[i] == j) {
					c[j]++;
				}
			}
		}
		for (int i = 0; i < 42; i++) {
			if (c[i] != 0) {
				count = count + 1;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
