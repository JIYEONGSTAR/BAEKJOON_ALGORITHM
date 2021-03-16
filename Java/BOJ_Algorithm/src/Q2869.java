//달팽이는 올라가고 싶다
//20200120
//mathAlgorithm


import java.util.Scanner;

public class Q2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();// 낮에 올라가는
		int b = sc.nextInt();// 밤에 미끄러지는
		int v = sc.nextInt();// 막대기미터
		double x = (double) (v - b) / (a - b);
		if (x % 1 == 0)
			System.out.println((int) x);
		else if (x % 1 != 0)
			System.out.println((int) x + 1);
		sc.close();
	}

}
