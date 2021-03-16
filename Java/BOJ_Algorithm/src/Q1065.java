//한수 
//20200108
//functionAlgorithm

import java.util.Scanner;

public class Q1065 {
	public static int findHansu(int n) {
		int hansu = 0;
		int one, ten, hund;
		hansu = 99;
		for (int i = 100; i <= n; i++) {
			one = i % 10;
			ten = (i / 10) % 10;
			hund = i / 100;
			if (ten * 2 == one + hund) {// 등차수열 법칙 
				hansu++;
			}
		}
		return hansu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n < 100) {
			System.out.println(n);
		} else {
			System.out.println(findHansu(n));
		}
		sc.close();
	}

}
