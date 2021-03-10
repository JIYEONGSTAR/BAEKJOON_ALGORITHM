
//소트인사이드
import java.util.Arrays;
import java.util.Scanner;

public class Q1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char c[] = a.toCharArray();
		Arrays.parallelSort(c);
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		sc.close();

	}

}
