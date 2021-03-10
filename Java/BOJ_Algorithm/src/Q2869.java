//�����̴� �ö󰡰� �ʹ�
//20200120
//mathAlgorithm

import java.util.Scanner;

public class Q2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();// ���� �ö󰡴�
		int b = sc.nextInt();// �㿡 �̲�������
		int v = sc.nextInt();// ��������
		double x = (double) (v - b) / (a - b);
		if (x % 1 == 0)
			System.out.println((int) x);
		else if (x % 1 != 0)
			System.out.println((int) x + 1);
		sc.close();
	}

}
