//배수와 약수
//20200120
//mathAlgorithm

import java.util.Scanner;

public class Q5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			if (first == 0 && second == 0)
				break;
			else if (first > second && first % second == 0)
				System.out.println("multiple");
			else if (first < second && second % first == 0)
				System.out.println("factor");
			else
				System.out.println("neither");
		}
		sc.close();
	}

}
