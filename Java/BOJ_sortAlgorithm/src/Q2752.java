//세수정렬
import java.util.Arrays;
import java.util.Scanner;
public class Q2752 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x[]=new int[3];
		for(int i=0;i<3;i++) 
			x[i]=sc.nextInt();
		Arrays.parallelSort(x);
		for(int i=0;i<3;i++) 
			System.out.print(x[i]+" ");
		sc.close();
	}

}
