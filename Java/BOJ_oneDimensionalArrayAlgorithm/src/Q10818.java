
//최소, 최대
import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 1000000, max = -1000000;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (i == 0) {
				min = a[0];
			}
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		System.out.print(min + " " + max);
		sc.close();
	}

}
