
//모든 순열
//20210502
//백트래킹,브루트포스 
import java.util.Scanner;

public class Q10974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 개수
		int arr [] = new int[n];
		int output [] = new int[n];
		boolean visited[] = new boolean[n];
		
		for(int i=0;i<n;i++) {
			arr[i]= i+1;
		}
		
		DFS(arr,output,visited,0,n,n);
	}
	static void DFS(int[] arr,int[] output, boolean[] visited,int depth,int n,int r) {
		if(depth == r) {
			print(output,r);
			return;
		}
		for(int i=0;i<n;i++) {
			if(visited[i]!=true) {
				visited[i]=true;
				output[depth] = arr[i];
				DFS(arr,output,visited,depth+1,n,r);
				visited[i]=false;
			}
		}
	}
	static void print(int[] arr, int r) {
        for(int i=0; i<r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
}
//이해가 가지 않는다. https://bcp0109.tistory.com/13
