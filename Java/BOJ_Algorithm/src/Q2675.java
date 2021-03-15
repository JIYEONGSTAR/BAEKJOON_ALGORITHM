//���ڿ� �ݺ�
//20200109
//stringAlgorithm

import java.util.Scanner;

public class Q2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// �׽�Ʈ���̽��� ����
		int r;
		String s;// ���ڿ�
		for (int i = 0; i < t; i++) {
			r = sc.nextInt();// �ݺ�Ƚ��
			s = sc.next();// ���ڿ� �Է�
			char x[] = s.toCharArray();
			for (int j = 0; j < x.length; j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(x[j]);
				}

			}
			System.out.println("");
		}
		sc.close();
	}

}
