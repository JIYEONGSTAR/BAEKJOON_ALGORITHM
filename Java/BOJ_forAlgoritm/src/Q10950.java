//A+B - 3
import java.util.Scanner;
public class Q10950{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a[] = new int[T];
		int b[] = new int[T];
		int c[] = new int[T];
		for(int i=0;i<T;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=a[i]+b[i];
		}
		for(int i=0;i<T;i++) {
			System.out.println(c[i]);
		}
		sc.close();
	}
}