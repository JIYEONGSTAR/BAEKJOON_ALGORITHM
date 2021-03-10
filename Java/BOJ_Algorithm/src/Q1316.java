//�׷� �ܾ� üĿ
//20200112
//stringAlgorithm

import java.util.Scanner;

public class Q1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// ���� �ܾ� ����
		String word[] = new String[n];// ���ڿ�
		for (int i = 0; i < n; i++)
			word[i] = sc.next();// �� ���ڿ� �Է�
		int count = 0;// �׷�ܾ��
		for (int i = 0; i < n; i++) {
			boolean[] alpha = new boolean[26];// ���Դ��� Ȯ���ϴ� booleanŸ���� alpha
			char w[] = word[i].toCharArray();// ���ٿ� �Է¹��� ���� �� ���ĺ���
			alpha[(int) w[0] - 97] = true;// ù��°�� ���°� ������ true
			for (int j = 0; j < word[i].length() - 1; j++) {
				if (w[j] != w[j + 1]) {// ���� ���ĺ��� ���� ������
					if (alpha[(int) w[j + 1] - 97]) {// �̹� ���� ���ĺ��̶�� count�� --�ϰ� �ݺ��� Ż��
						count--;
						break;
					}
					alpha[(int) w[j + 1] - 97] = true;// �̹� ���� ���ĺ��� �ƴϸ� boolŸ���� true��
				}
				if (w[j] == w[j + 1]) {// ���� ���ĺ��� ������
					alpha[(int) w[j] - 97] = true;// true��
				}
			}
			count++;// �׷�ܾ� ++
		}
		System.out.println(count);// �׷�ܾ� ���
		sc.close();
	}

}