//상수
//20200109
//stringAlgorithm

import java.util.Scanner;

public class Q2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String astring = Integer.toString(a);
		String bstring = Integer.toString(b);
		String reverseA = reverseString(astring);
		String reverseB = reverseString(bstring);
		a = Integer.parseInt(reverseA);
		b = Integer.parseInt(reverseB);
		System.out.println(Math.max(a, b));
		sc.close();
	}

	private static String reverseString(String s) {
		// TODO Auto-generated method stub
		return (new StringBuffer(s)).reverse().toString();
	}//인터넷 검색 문자열 뒤집기 자바


}
