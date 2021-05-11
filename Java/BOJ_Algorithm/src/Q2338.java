//긴자리 계산
//20210512
//수학,사칙연산,임의 정밀도 / 큰 수 연산
import java.util.Scanner;
import java.math.BigInteger;

public class Q2338 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));

	}

}

