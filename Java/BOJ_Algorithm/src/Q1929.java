//소수 구하기 
//20200122
//mathAlgorithm

import java.util.Scanner;

public class Q1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		boolean a[] = new boolean[1000001];
		a[1]=true;
		for (int i = 2; i <= a.length; i++) {
			for(int j=2;i*j<a.length;j++) {
				a[i*j]=true;//소수가 아니면 true
				}
		}
		for(int i=first;i<=second;i++) {
			if(a[i]==false)
				System.out.println(i);
		}
		sc.close();
	}
}
