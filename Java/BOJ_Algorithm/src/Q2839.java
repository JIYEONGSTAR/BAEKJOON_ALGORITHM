//설탕 배달 
//20200117
//mathAlgorithm

import java.util.Scanner;
public class Q2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		if(n==4||n==7) {
			num=-1;
		}
		else if((n-3)%5==0) {
			num=(n-3)/5+1;
		}
		else if((n-9)%5==0) {
			num=((n-9)/5+3);
		}
		else if((n%5==0)) {
			num=n/5;
		}
		else if ((n-6)%5==0) {
			num=(n-6)/5+2;
		}
		else if((n-12)%5==0) {
			num=(n-12)/5+4;
		}
		
		System.out.println(num);
		sc.close();
	}

}
