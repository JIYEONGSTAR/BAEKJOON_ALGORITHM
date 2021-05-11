//별 찍기 - 9
//20210512
//구현

import java.util.Scanner;

public class Q2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = num; i >1; i--) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
