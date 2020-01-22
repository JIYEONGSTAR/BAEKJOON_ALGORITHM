
//소수 찾기
import java.util.Scanner;

public class Q1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 몇 개 입력받을지
		boolean[] decimal = new boolean[n];// 소수인지 아닌지
		int[] num = new int[n];// 숫자입력을위한 변수
		int count = 0;
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();// 숫자입력
			decimal[i] = true;// 일단 true
			if (num[i] == 1) {
				decimal[i] = false;// 1은 소수가 아님
			}
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					decimal[i] = false;// 약수가 있으면 소수가 아니다.
					break;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (decimal[i] == true)
				count++;
		}
		System.out.print(count);
		sc.close();
	}

}
