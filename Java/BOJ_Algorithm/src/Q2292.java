//벌집 
//20200117
//mathAlgorithm

import java.util.Scanner;

public class Q2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;// 정답개수 
		int s = 1;// sum
		while (true) {
			if (n <= s) {
				System.out.println(a);
				break;
			}
			s += a * 6;
			a++;
		}
		sc.close();
	}

}
