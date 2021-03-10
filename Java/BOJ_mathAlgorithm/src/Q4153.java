
//Á÷°¢»ï°¢Çü
import java.util.Scanner;

public class Q4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int max = Math.max(x, y);
			max = Math.max(max, z);
			if (x == 0 && y == 0 && z == 0)
				break;
			else if ((x * x) + (y * y) + (z * z) - (max * max) == max * max)
				System.out.println("right");
			else
				System.out.println("wrong");

		}
		sc.close();
	}

}
