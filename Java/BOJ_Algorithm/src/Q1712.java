//손익분기점
//20200117
//mathAlgorithm

import java.util.Scanner;

public class Q1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();// 고정비용
		int b = sc.nextInt();// 한 대 노트북 생산하는데 드는 비용
		int c = sc.nextInt();// 노트북 가격
		if (b >= c) {
			System.out.println(-1);
		} else {
			System.out.println(a/(c-b)+1);	
		}
		
		sc.close();
	}

}
