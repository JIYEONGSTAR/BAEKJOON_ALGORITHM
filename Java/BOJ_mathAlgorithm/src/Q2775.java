//부녀회장이 될테야
import java.util.Scanner;
public class Q2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//test 개수
		int apt[][]=new int[15][15];
		for(int i=0;i<15;i++) {
			apt[0][i]=i+1;
		}
		int sum=0;
		for(int a=1;a<15;a++) {//층수
			for(int b=0;b<15;b++) {//호수
				sum+=apt[a-1][b];
				apt[a][b]=sum;
			}
			sum=0;
		}
		for(int i=0;i<t;i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(apt[k][n-1]);
		}
		sc.close();
	}

}
