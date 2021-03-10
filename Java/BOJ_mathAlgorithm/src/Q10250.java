
//ACM 호텔
import java.util.Scanner;

public class Q10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// 테스트개수

		for (int i = 0; i < t; i++) {// 테스트 개수만큼 반복
			int h = sc.nextInt();// 층 수
			@SuppressWarnings("unused")
			int w = sc.nextInt();// 각 층의 방 수
			int n = sc.nextInt();// 몇번 째 손님인지
			int front, end;
			if (n % h == 0) {
				front = h;
				end = n / h;
			} else {
				front = n % h;
				end = (n / h) + 1;
			}
			if (end < 10)
				System.out.println(front + "0" + end);
			else
				System.out.println(front + "" + end);
		}
		sc.close();
	}

}
//w는 입력만 받고 따로 사용하지 않음