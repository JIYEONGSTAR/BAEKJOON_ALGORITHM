
//문자열 반복
import java.util.Scanner;

public class Q2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// 테스트케이스의 개수
		int r;
		String s;// 문자열
		for (int i = 0; i < t; i++) {
			r = sc.nextInt();// 반복횟수
			s = sc.next();// 문자열 입력
			char x[] = s.toCharArray();
			for (int j = 0; j < x.length; j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(x[j]);
				}

			}
			System.out.println("");
		}
		sc.close();
	}

}
