//수들의 합
//20210512
//수학 

import java.util.Scanner;

public class Q1789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();

		long count = 1;
		long sum = 1;

		while (sum < num) {
			count++;
			sum += count;
		}

		System.out.println((sum == num) ? count : count - 1);

	}

}
