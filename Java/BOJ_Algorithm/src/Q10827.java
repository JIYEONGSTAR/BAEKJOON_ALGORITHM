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
//���ͳ� �˻����� BigDecimal ��ü �˰� �Ǿ���
//double�� 0.1 10�� �Է��ϸ� 1E-10�� �Է��ؼ� �����̴�.
//toString()�� ���޹��� ���� �״�� ��ȯ�Ѵ�.
//10757�� ����� Ǯ��