//기찍 N
//20200106
//forAlgorithm

import java.util.Scanner;

public class Q2742 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 몇개입력받을지
		for (int i = n; i >= 1; i--) {
			System.out.println(i);// n부터 1까지 출력(큰수->작은수)
		}
		sc.close();
	}

}
