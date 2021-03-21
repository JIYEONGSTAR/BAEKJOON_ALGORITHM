
//덩치
//20210321
//부루트포스 
import java.util.Arrays;
import java.util.Scanner;


public class Q7568 {
	public static int x[];// 몸무게 받는 전역변수 x
	public static int y[];// 키 받는 전역변수 y
	public static int bulk[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 전체 사람 수
		x = new int[n];// 몸무게 사람수 초기화
		y = new int[n];// 키 사람수 초기화
		bulk = new int[n];// 등수 나타낼 배열 초기화
		Arrays.fill(bulk, 1);// bulk를 1로 초기화

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();// i번째 사람 몸무게 입력
			y[i] = sc.nextInt();// i번 째 사람 키 입력
		}
//		System.out.println(Arrays.toString(x));
//		System.out.println(Arrays.toString(y));
		compare(0, n);
		sc.close();
	}

	public static void compare(int start, int end) {//하나씩 비교하면서 자기의 몸무게와 키보다 비교하는게 더 크면 bulk배열의 값을 ++한다. 
		for (int i = start; i < end; i++) {
			for (int j = 0; j < end; j++) {
				if (x[i] > x[j] && y[i] > y[j] && (i != j)) {
					bulk[j] += 1;
				}
			}
		}
		for(int element:bulk) { //bulk배열의 첫 원소부터 차례대로 element에 대입된다.
			System.out.print(element+" ");
		}
	}
}
