//윤년
//20191231
//ifAlgorithm

import java.util.Scanner;

public class Q2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year=scanner.nextInt();
		if(year%400==0) {//400의 배수이면 윤년
			System.out.println("1");
		}
		else if(year%4==0&&year%100!=0) {//4의 배수이면 윤년
			System.out.println("1");//윤년이다
		}
		else {
			System.out.println("0");//윤년이 아니다
		}
		scanner.close();
	}


}
