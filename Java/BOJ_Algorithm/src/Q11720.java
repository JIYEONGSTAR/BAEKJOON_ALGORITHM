//������ ��
//20200109
//stringAlgorithm

import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// ������ ����
		String num = sc.next();// ���ڿ� �Է�
		String[] a = num.split("");// ���ڿ��ڸ���
		int b[] = new int[n];// ���ڹ迭a�� int�迭b���ϱ����� ����,���̴� n
		int sum = 0;// ���ϱ�
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
