//ACM ȣ��
//20200120
//mathAlgorithm

import java.util.Scanner;

public class Q10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// �׽�Ʈ����

		for (int i = 0; i < t; i++) {// �׽�Ʈ ������ŭ �ݺ�
			int h = sc.nextInt();// �� ��
			@SuppressWarnings("unused")
			int w = sc.nextInt();// �� ���� �� ��
			int n = sc.nextInt();// ��� ° �մ�����
			int front, end;
			if (n % h == 0) {
				front = h;
				end = n / h;
			} else {
				front = n % h;
				end = (n / h) + 1;
			}
			if (end < 10)
				System.out.println(front + "0" + end);
			else
				System.out.println(front + "" + end);
		}
		sc.close();
	}

}
//w�� �Է¸� �ް� ���� ������� ����