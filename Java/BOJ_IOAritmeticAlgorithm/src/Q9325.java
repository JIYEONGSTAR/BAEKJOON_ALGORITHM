//��?
//20200109
//IOAritmeticAlgorithm

import java.util.Scanner;

public class Q9325 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int casenum = sc.nextInt();// ���̽� ����
		int s; // �ڵ����� ����
		int n;// �����Ϸ��� ���� �ٸ� �ɼ��� ����
		int q;// �ɼ��� ����
		int p;// �ش� �ɼ��� ����
		int optionsum = 0;// �ɼ��� �� ����
		for (int i = 0; i < casenum; i++) {
			s = sc.nextInt();
			n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				q = sc.nextInt();
				p = sc.nextInt();
				optionsum = optionsum + (q * p);

			}
			System.out.println(s + optionsum);
			optionsum = 0;
		}
		sc.close();
	}

}
