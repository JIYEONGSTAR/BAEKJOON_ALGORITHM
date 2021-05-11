//별 찍기 - 12
//20210512
//구현

import java.util.Scanner;

public class Q2522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= 2 * num - 1; i++) {
			if (i <= num) {
				for (int j = 0; j < num-i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < i-num; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * num - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");

		}

	}
}