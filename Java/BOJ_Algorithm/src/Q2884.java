//알람 시계
//20191231
//ifAlgorithm

import java.util.Scanner;

public class Q2884 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if (m >= 45) {
			m = m - 45;
			System.out.println(h + " " + m);
		} else if (m < 45) {
			m = m + 15;
			if (h == 0) {
				h = 23;
			} else if (h > 0)
				h = h - 1;
			System.out.println(h + " " + m);
		}

		sc.close();

	}
}
