//���
//20200107
//oneDimensionalArrayAlgorithm

import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// ���� �� ����;
		double score[] = new double[n];
		double m = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
			m = Math.max(m, score[i]);
		}
		for (int i = 0; i < n; i++) {
			score[i] = score[i] / m * 100;
			sum += score[i];
		}
		System.out.println(sum / n);
		sc.close();
	}

}
