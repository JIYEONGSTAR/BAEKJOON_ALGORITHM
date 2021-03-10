//�Ǻ���ġ �� 5
//20200120
//recursionAlgorithm

import java.util.Scanner;

public class Q10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first = 0;
		int second = 1;
		int n = sc.nextInt();
		int result = 0;
		for (int i = 1; i < n; i++) {
			result = first + second;
			first = second;
			second = result;
		}
		if (n <= 1)
			System.out.println(n);
		else
			System.out.println(result);
		sc.close();
	}

}
//Q2747