//A+B - 8
//20200106
//forAlgorithm

import java.util.Scanner;

public class Q11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();// ��Է¹�����

		int a[] = new int[n];// �迭�ʱ�ȭ
		int b[] = new int[n];
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();// �Է�
			b[i] = scanner.nextInt();
			c[i] = a[i] + b[i];// c[i]�� ����
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + c[i]);
		}
		scanner.close();
	}

}
