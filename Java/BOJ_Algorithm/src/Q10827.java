//a^b
//20200109
//IOAritmeticAlgorithm

import java.math.BigDecimal;
import java.util.Scanner;

public class Q10827 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		int b = sc.nextInt();
		BigDecimal result = a.pow(b);
		System.out.println(result.toPlainString());
		sc.close();
	}

}
//인터넷 검색으로 BigDecimal 객체 알게 되었다
//double은 0.1 10을 입력하면 1E-10을 입력해서 오답이다.
//toString()은 전달받은 값을 그대로 반환한다.
//10757도 비슷한 풀이
