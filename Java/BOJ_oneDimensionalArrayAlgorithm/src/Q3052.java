
//나머지
import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int a[] = new int[10];// 입력받음
		int b[] = new int[10];// 나머지
		int c[] = new int[42];// 나머지가 몇개인지
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i] % 42;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 42; j++) {
				if (b[i] == j) {
					c[j]++;
				}
			}
		}
		for (int i = 0; i < 42; i++) {
			if (c[i] != 0) {
				count = count + 1;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
