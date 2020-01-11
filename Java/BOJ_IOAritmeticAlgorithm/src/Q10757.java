
//큰 수 A+B
import java.util.Scanner;
import java.math.BigInteger;

public class Q10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger result = a.add(b);
		System.out.println(result);
		sc.close();
	}

}
//큰 수여서 bigInteger사용한다.10827번호와 비슷한듯 다른...