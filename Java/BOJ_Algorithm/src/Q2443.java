//별 찍기 - 6
//20200924
//forAlgorithm

import java.util.Scanner;

public class Q2443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int j=n;j>=1;j--) {
			for(int i=0;i<n-j;i++) {
				System.out.print(" ");
			}
			for(int i=1;i<=j*2-1;i++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
		sc.close();
	}

}