
//남욱이의 닭장
import java.util.Scanner;

public class Q11006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int legs, chicken;
		int oneleg;
		for (int i = 0; i < t; i++) {
			legs = sc.nextInt();
			chicken = sc.nextInt();
			oneleg = chicken * 2 - legs;
			System.out.println(oneleg + " " + (chicken - oneleg));
		}
		sc.close();

	}

}
