
//단어 공부
import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();// 문자열 입력
		s = s.toUpperCase();
		int max = 0;
		char maxalpha = 0;
		int count = 0;// 가장많이사용하는 알파벳의 개수.count가 2이상이면 ?출력
		char[] a = s.toCharArray();// 한글자씩 자르기
		int alphanum[] = new int[26];
		for (int i = 0; i < a.length; i++) {
			for (int j = 'A'; j <= 'Z'; j++) {
				if (a[i] == j)
					alphanum[(int) j - 65]++;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (max < alphanum[i]) {
				max = alphanum[i];
				maxalpha = (char) (i + 65);
			}
		}

		for (int i = 0; i < 26; i++) {
			if (max == alphanum[i])
				count++;
		}
		if (count >= 2)
			maxalpha = '?';
		System.out.println(maxalpha);
		sc.close();
	}

}
