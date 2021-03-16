//팰린드롬수 
//20210310
//stringAlgorithm

import java.util.Scanner;

public class Q1259 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean i;
		while (true) {
			i = true;
			String a = sc.next();
			if (a.equals("0")) {
				break;
			}
			for (int start = 0, end = a.length() - 1; start < a.length() / 2; start++, end--) {
				if (a.charAt(start) != a.charAt(end)) {// 비교할 숫자가 다르면
					i = false;
					break;
				}
			}
//			if (i) {
//				System.out.println("yes");
//			} else {
//				System.out.println("no");
//			}
			System.out.print(i ? "yes" : "no");
		}

	}

}
