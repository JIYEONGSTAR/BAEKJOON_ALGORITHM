//캠핑
//20210321
//그리디

import java.util.Scanner;

public class Q4796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0;// case나타내는 번호 
		while (true) {
			i += 1;
			int l = sc.nextInt();// L일 동안만 쓸 수 있다
			int p = sc.nextInt();// 연속하는 p일 중
			int v = sc.nextInt();// v일짜리 휴가
			if (l == 0 && p == 0 && v == 0) {
				break;
			} else {
				System.out.println("Case " + i + ": " + camp(l, p, v));
			}
		}
	}

	public static int camp(int l, int p, int v) {
		int usingDay;
		usingDay =(l<v%p)?(l*((int)(v/p)+1)): (((v % p) + (l * ((int) v / p))));
		//사용할 수 있는 캠핑 일 수 계산 (나머지가 사용가능한 캠핑 일수보다 클 때 경우도 고려)
		return usingDay;

	}

}
