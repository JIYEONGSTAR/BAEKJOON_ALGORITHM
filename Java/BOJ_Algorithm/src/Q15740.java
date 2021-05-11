
//A + B -9
//20210512
//수학,사칙연산,임의 정밀도 / 큰 수 연산

import java.math.BigInteger;
import java.util.Scanner;

public class Q15740 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		System.out.println(A.add(B));
	}

}
