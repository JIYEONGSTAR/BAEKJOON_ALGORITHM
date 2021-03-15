//�� ��� - 1
//20200106
//forAlgorithm

import java.util.Scanner;

public class Q2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// ��Է¹�����
		for (int i = 1; i <= n; i++) {// n�� �ݺ�
			for (int j = 0; j < i; j++) {// �� �ٴ� ���� ���� ����
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
