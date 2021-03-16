//직사각형에서 탈출 
//20200129
//mathAlgorithm

import java.util.Scanner;

public class Q1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int minx = 0, miny = 0;
		if (x > w - x)
			minx = w - x;
		else
			minx = x;
		if (y > h - y)
			miny = h - y;
		else
			miny = y;
		if (minx > miny)
			System.out.println(miny);
		else
			System.out.println(minx);
		sc.close();
	}

}
