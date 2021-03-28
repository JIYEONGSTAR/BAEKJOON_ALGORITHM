//투자의 귀재 배주형
//20210328
//다이내믹 프로그래밍, 브루트포스, 재귀

import java.util.Scanner;
public class Q19947 {
	static double five = 1.35;//오년 뒤 이자
	static double three = 1.2;//삼년 뒤 이자
	static double one = 1.05;//일년 뒤 이자 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();//초기 비용 
		int y = sc.nextInt();//투자 기간 
		double dp[]=new double[11];//이자 저장할 배열 
		dp[0]=h;//첫번째 배열에 초기비용 저장 
		for(int i=1;i<=y;i++) {
			dp[i]=(int)dp[i-1]*one;
			if(i>=3)dp[i]=Math.max(dp[i],(int)dp[i-3]*three);//최대 이자 저장  
			if(i>=5)dp[i]=Math.max(dp[i],(int)dp[i-5]*five);//최대 이자 저장 
		}
		System.out.println((int)dp[y]);
	}
	
}
