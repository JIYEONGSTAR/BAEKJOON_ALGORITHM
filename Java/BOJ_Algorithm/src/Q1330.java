//두 수 비교하기 
//20191231
//ifAlgorithm

import java.util.Scanner;

public class Q1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A > B) {
			System.out.println(">");
		}
		if (A < B) {
			System.out.println("<");
		}
		if (A == B) {
			System.out.println("==");
		}
		sc.close();
	}

}
