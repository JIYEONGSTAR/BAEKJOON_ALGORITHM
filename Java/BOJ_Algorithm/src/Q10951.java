//A+B - 4
//20200107
//whileAlgorithm

import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource") //
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (sc.hasNextInt()) {// ��� �Է��� ��ӵȴ�
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}

	}

}

/*
 * ���ͳ� �˻����� hasNextInt()�� �˰� �Ǿ���. resource �ݱ� ���� ������ �ڿ� ��뿡 ���õ� ���
 * ����(sc.close()�� ��� ���ؼ� ����� ��� ����)
 */
