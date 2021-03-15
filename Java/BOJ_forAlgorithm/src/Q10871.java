//X���� ���� ��
//20200106
//forAlgorithm

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// �迭 ������ ��
		int x = sc.nextInt();// x���� ���� �� ���ϱ�
		int a[] = new int[n];// ���� n���� �����ִ� �迭 a
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}

		sc.close();
	}

}
