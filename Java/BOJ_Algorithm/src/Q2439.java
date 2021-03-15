//�� ��� - 2
//20200106
//forAlgorithm

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// ��Է¹�����
		for (int i = 1; i <= n; i++) {// n�� �ݺ�
			for (int j = 0; j < n - i; j++) {// ����
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {// ���� �� �����(����+�����=n)
				System.out.print("*");
			}
			System.out.println();// �ٹٲ�
		}
		sc.close();
	}

}
