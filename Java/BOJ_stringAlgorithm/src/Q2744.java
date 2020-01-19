
//대소문자 바꾸기
import java.util.Scanner;

public class Q2744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		for (int i = 0; i < x.length(); i++) {
			char c = x.charAt(i);// i번째 글자
			if (c >= 'a') {
				System.out.print((char) (c - 32));
			} else
				System.out.print((char) (c + 32));
		}
		sc.close();
	}

}
