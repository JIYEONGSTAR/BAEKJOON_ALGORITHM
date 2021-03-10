
//A+B - 4
import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource") //
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (sc.hasNextInt()) {// 계속 입력이 계속된다
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}

	}

}

/*
 * 인터넷 검색으로 hasNextInt()를 알게 되었다. resource 닫기 가능 유형의 자원 사용에 관련된 경고
 * 억제(sc.close()를 사용 안해서 생기는 경고 억제)
 */
