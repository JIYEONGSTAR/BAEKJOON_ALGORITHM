
//별 찍기 - 1
import java.util.Scanner;

public class Q2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 몇개입력받을지
		for (int i = 1; i <= n; i++) {// n번 반복
			for (int j = 0; j < i; j++) {// 각 줄당 찍을 별의 개수
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
