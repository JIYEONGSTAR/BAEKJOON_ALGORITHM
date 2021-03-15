//�� ��ȣ
//20200210
//mathAlgorithm

import java.util.Scanner;

public class Q1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();// �Է�
		int x[] = new int[n.length()];// ���ڸ� ���ڷ�
		for (int i = 0; i < n.length(); i++)
			x[i] = n.charAt(i) - '0';// String->char->int;
		int num[] = new int[10];// 0���� 9���� ��
		int count = 0;// ��Ʈ����
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 6) {

				if (num[6] > num[9])
					num[9]++;
				else if (num[6] <= num[9])
					num[6]++;
				if (num[6] > count)
					count = num[6];
			} else if (x[i] == 9) {

				if (num[6] < num[9])
					num[6]++;
				else if (num[6] >= num[9])
					num[9]++;
				if (num[9] > count)
					count = num[9];

			} else {
				for (int j = 0; j <= 9; j++) {
					if (x[i] == j) {
						num[j]++;
						if (num[j] >= count) {
							count = num[j];
							break;
						}
					}
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
