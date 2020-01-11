
//A+B - 6
import java.util.Scanner;

public class Q10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s;
		String ss[];
		int a, sum = 0;
		for (int i = 0; i < t; i++) {
			sum = 0;
			s = sc.next();
			ss = s.split(",");
			for (int j = 0; j < ss.length; j++) {
				a = Integer.parseInt(ss[j]);
				sum += a;
			}
			System.out.println(sum);

		}
		sc.close();
	}

}