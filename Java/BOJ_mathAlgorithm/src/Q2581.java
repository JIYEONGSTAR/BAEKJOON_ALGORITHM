
//¼Ò¼ö
import java.util.Scanner;

public class Q2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int sum = 0;
		int min = second;
		boolean a = true;
		for (int i = first; i <= second; i++) {
			a = true;
			if(i==1) {
				a=false;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					a = false;
					break;
				}

			}
			if (a == true) {
				sum += i;
				min = Math.min(min, i);
			}

		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		sc.close();
	}
}
