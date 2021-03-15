//OX����
//20200107
//oneDimensionalArrayAlgorithm

import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String p[] = new String[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.next();// �Է�
		}
		int k = 0;
		int sum[] = new int[n];
		for (int j = 0; j < n; j++) {
			k = 0;
			char[] q = p[j].toCharArray();// �迭�� char�� �ϳ��ϳ����ޱ�
			for (int i = 0; i < q.length; i++) {
				if (q[i] == 'O') {
					k = k + 1;
					sum[j] = sum[j] + k;
				} else
					k = 0;

			}

		}
		for (int i = 0; i < n; i++)
			System.out.println(sum[i]);
		sc.close();
	}

}
