//���ĺ� ã��
//20200109
//stringAlgorithm

import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char array[] = s.toCharArray();// �Է¹��� �ܾ� �ڸ���
		int a[] = new int[26];// ���ĺ�
		Arrays.fill(a, -1);// ���ͳ� �˻�, ��� �迭 �ѹ��� -1�� �ʱ�ȭ
		for (int i = 0; i < array.length; i++) {
			for (int j = 'a'; j <= 'z'; j++) {
				if (array[i] == (char) j && a[j - 97] == -1) {
					a[j - 97] = i;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}

}
