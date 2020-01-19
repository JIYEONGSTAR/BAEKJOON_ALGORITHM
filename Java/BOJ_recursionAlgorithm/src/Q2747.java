
//피보나치 수 
import java.util.Scanner;

public class Q2747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int front = 0;
		int back = 1;
		int n = sc.nextInt();
		int result = 0;
		for (int i = 1; i < n; i++) {
			result = front + back;
			front = back;
			back = result;
		}
		if (n <= 1)
			System.out.println(n);
		else
			System.out.println(result);
		sc.close();
	}

}
//Q10870