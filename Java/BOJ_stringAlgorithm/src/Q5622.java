
//다이얼
import java.util.Scanner;

public class Q5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch[] = s.toCharArray();
		int a[] = new int[s.length()];
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			a[i] = (int) ch[i] - 65;
			if (ch[i] == 'S' || ch[i] == 'V' || ch[i] == 'Y' || ch[i] == 'Z')
				a[i] = (a[i] / 3) + 1;
			else
				a[i] = (a[i] / 3) + 2;
			sum = sum + a[i] + 1;

		}
		System.out.println(sum);
		sc.close();
	}

}
//포인트 7,9에는 문자가 4개씩
