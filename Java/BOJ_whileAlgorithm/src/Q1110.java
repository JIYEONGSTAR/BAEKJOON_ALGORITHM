
//더하기 사이클
import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();// 입력
		int first = a;// 입력값저장
		int lastA, firstA, b, lastB, count = 0;

		while (true) {
			count = count + 1;// count
			lastA = a % 10;// a의 1의자리
			if (a < 10) {
				firstA = 0;// 한자리수이면 0을 붙인다
			}
			firstA = a / 10;// a의 10의자리
			b = firstA + lastA;// b의 값 구하기
			lastB = b % 10;// b의 1의자리
			// System.out.println("a값"+a+"b값"+b);

			a = lastA * 10 + lastB;// 새로운 a값 저장
			if (a == first)// 다시 저장된 a값이 입력된 값과 같으면 반복문 종료
				break;

		}
		System.out.println(count);
		sc.close();
	}

}
