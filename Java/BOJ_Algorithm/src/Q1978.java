//�Ҽ� ã��
//20200122
//mathAlgorithm

import java.util.Scanner;

public class Q1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// �� �� �Է¹�����
		boolean[] decimal = new boolean[n];// �Ҽ����� �ƴ���
		int[] num = new int[n];// �����Է������� ����
		int count = 0;
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();// �����Է�
			decimal[i] = true;// �ϴ� true
			if (num[i] == 1) {
				decimal[i] = false;// 1�� �Ҽ��� �ƴ�
			}
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					decimal[i] = false;// ����� ������ �Ҽ��� �ƴϴ�.
					break;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (decimal[i] == true)
				count++;
		}
		System.out.print(count);
		sc.close();
	}

}
