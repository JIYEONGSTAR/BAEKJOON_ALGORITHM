//���ϱ� ����Ŭ
//20200107
//whileAlgorithm

import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();// �Է�
		int first = a;// �Է°�����
		int lastA, firstA, b, lastB, count = 0;

		while (true) {
			count = count + 1;// count
			lastA = a % 10;// a�� 1���ڸ�
			if (a < 10) {
				firstA = 0;// ���ڸ����̸� 0�� ���δ�
			}
			firstA = a / 10;// a�� 10���ڸ�
			b = firstA + lastA;// b�� �� ���ϱ�
			lastB = b % 10;// b�� 1���ڸ�
			// System.out.println("a��"+a+"b��"+b);

			a = lastA * 10 + lastB;// ���ο� a�� ����
			if (a == first)// �ٽ� ����� a���� �Էµ� ���� ������ �ݺ��� ����
				break;

		}
		System.out.println(count);
		sc.close();
	}

}
