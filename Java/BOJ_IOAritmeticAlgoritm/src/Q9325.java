//얼마?
import java.util.Scanner;

public class Q9325 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int casenum = sc.nextInt();// 케이스 개수
		int s; // 자동차의 가격
		int n;// 구매하려는 서로 다른 옵션의 개수
		int q;// 옵션의 개수
		int p;// 해당 옵션의 가격
		int optionsum=0;//옵션의 총 가격
		for (int i = 0; i < casenum; i++) {
			s = sc.nextInt();
			n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				q = sc.nextInt();
				p = sc.nextInt();
				optionsum=optionsum+(q*p);
				
			}
			System.out.println(s+optionsum);
			optionsum=0;
		}
		sc.close();
	}

}
