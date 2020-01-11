
//음계
import java.util.Scanner;

public class Q2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String ascending = "1 2 3 4 5 6 7 8";
		String descending = "8 7 6 5 4 3 2 1";

		String input = sc.nextLine();

		if (input.equals(ascending)) {
			System.out.println("ascending");
		} else if (input.equals(descending)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}

		sc.close();
	}

}
//백준의 허점을 노린다.