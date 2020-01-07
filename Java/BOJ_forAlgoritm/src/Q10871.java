//X보다 작은 수
import java.util.Scanner;
public class Q10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//배열 원소의 수
		int x = sc.nextInt();//x보다 작은 수 구하기
		int a[] = new int[n];//원소 n개를 갖고있는 배열 a
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			if(a[i]<x) {
				System.out.print(a[i]+" ");
			}
		}
		
		sc.close();
	}

}
