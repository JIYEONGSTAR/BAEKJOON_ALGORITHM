
//ÆÑÅä¸®¾ó
import java.util.Scanner;

public class Q10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int multi = 1;
		for (int i = 1; i <= n; i++) {
			multi *= i;
		}
		System.out.println(multi);
		sc.close();
	}

}
