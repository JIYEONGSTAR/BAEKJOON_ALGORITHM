
//베르트랑 공준
import java.util.Scanner;

public class Q4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int count = 0;
		boolean a[] = new boolean[123456 * 2 + 1];
		a[1] = true;
		for (int i = 2; i <= a.length; i++) {
			for (int j = 2; i * j < a.length; j++) {
				a[i * j] = true;
			}
		}
		while (n != 0) {
			count = 0;
			n = sc.nextInt();
			for (int i = n + 1; i <= n * 2; i++) {
				if (a[i] == false)
					count++;
			}
			if (n != 0)
				System.out.println(count);
		}
		sc.close();
	}

}
