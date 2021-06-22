//하노이 탑 이동 순서 
//20210622
//재귀 

import java.util.Scanner;
public class Q11729 {
	public static int count=0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//몇개의 원판인지
		hanoi(n,1,2,3);
		System.out.println(count);
		System.out.println(sb);
	}
	
	public static void hanoi(int n,int from,int by,int to) {
		count++;
		if(n==1) {
			sb.append(from+" "+to+"\n");
			return;
		}
		else {
			hanoi(n-1,from,to,by);
			sb.append(from+" "+to+"\n");
			hanoi(n-1,by,from,to);
		}
	}
	
}
