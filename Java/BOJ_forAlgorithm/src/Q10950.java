
//A+B - 3
import java.util.Scanner;

public class Q10950 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[t];
		int b[] = new int[t];
		int c[] = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = a[i] + b[i];
		}
		for (int i = 0; i < t; i++) {
			System.out.println(c[i]);
		}
		sc.close();
	}
}