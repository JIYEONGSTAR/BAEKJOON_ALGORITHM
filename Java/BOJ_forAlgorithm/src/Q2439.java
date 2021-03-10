
//별 찍기 - 2
import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 몇개입력받을지
		for (int i = 1; i <= n; i++) {// n번 반복
			for (int j = 0; j < n - i; j++) {// 띄어쓰기
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {// 띄어쓰기 후 별찍기(띄어쓰기+별찍기=n)
				System.out.print("*");
			}
			System.out.println();// 줄바꿈
		}
		sc.close();
	}

}
