//����
//20191231
//ifAlgorithm

import java.util.Scanner;

public class Q2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if (year % 400 == 0) {// 400�� ����̸� ����
			System.out.println("1");
		} else if (year % 4 == 0 && year % 100 != 0) {// 4�� ����̸� ����
			System.out.println("1");// �����̴�
		} else {
			System.out.println("0");// ������ �ƴϴ�
		}
		scanner.close();
	}

}
