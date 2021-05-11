
//별 찍기 - 8
//20210512
//구현

import java.util.Scanner;

public class Q2445 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = num-1; i >0; i--) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * i ; j++) {
				System.out.print(" ");
			}for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
