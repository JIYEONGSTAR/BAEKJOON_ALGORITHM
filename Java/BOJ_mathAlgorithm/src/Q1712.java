//���ͺб���
//20200117
//mathAlgorithm

import java.util.Scanner;

public class Q1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();// �������
		int b = sc.nextInt();// �� �� ��Ʈ�� �����ϴµ� ��� ���
		int c = sc.nextInt();// ��Ʈ�� ����
		if (b >= c) {
			System.out.println(-1);
		} else {
			System.out.println(a/(c-b)+1);	
		}
		
		sc.close();
	}

}
