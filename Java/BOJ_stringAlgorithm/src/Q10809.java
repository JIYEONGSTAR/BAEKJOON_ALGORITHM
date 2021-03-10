
//알파벳 찾기
import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char array[] = s.toCharArray();// 입력받은 단어 자른거
		int a[] = new int[26];// 알파벳
		Arrays.fill(a, -1);// 인터넷 검색, 모든 배열 한번에 -1로 초기화
		for (int i = 0; i < array.length; i++) {
			for (int j = 'a'; j <= 'z'; j++) {
				if (array[i] == (char) j && a[j - 97] == -1) {
					a[j - 97] = i;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}

}
