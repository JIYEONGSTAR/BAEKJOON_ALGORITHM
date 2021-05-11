//엄청난 부자2
//20210512
//수학,사칙연산,임의 정밀도 / 큰 수 연산
import java.util.Scanner;
import java.math.BigInteger;
public class Q1271 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger money = sc.nextBigInteger();
		BigInteger creature = sc.nextBigInteger();
		
		System.out.println(money.divide(creature));
		System.out.println(money.remainder(creature));
	}

}
