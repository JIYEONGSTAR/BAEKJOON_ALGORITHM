//최대공약수와 최소공배수
//20200120
//mathAlgorithm

import java.util.Scanner;
public class Q2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y = sc.nextInt();
		int min=Math.min(x, y);
		int greatestCommonFactor=1;//최대공약수
		int leastCommonMultiple=1;//최소공배수
		for(int i=1;i<=min;i++) {
			if(x%i==0&&y%i==0)
				greatestCommonFactor=i;
		}

		leastCommonMultiple=x*y/greatestCommonFactor;
		System.out.println(greatestCommonFactor);
		System.out.println(leastCommonMultiple);
		sc.close();
	}

}
