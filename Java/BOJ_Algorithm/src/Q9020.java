//�������� ����
//20200129
//mathAlgorithm

import java.util.Scanner;

public class Q9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean decimal[] = new boolean[100001];
		decimal[1] = true;
		int k = 0;// �Ŀ� ���� ����
		for (int i = 2; i <= decimal.length; i++) {
			for (int j = 2; j * i < decimal.length; j++) {
				decimal[i * j] = true;
			}
		}
		int t = sc.nextInt();// �׽�Ʈ ���� ����
		for (int i = 0; i < t; i++) {// �׽�Ʈ �ݺ� Ƚ��
			int a = sc.nextInt();
			for (k = 2; k < a; k++) {
				if (decimal[k] == false) {
					if (decimal[a - k] == false) {
						if (k >= (a - k))
							break;
					}
				}

			}
			System.out.println((a - k) + " " + k);
		}
		sc.close();
	}

}
