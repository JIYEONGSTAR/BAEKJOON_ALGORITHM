//숫자의 합
import java.util.Scanner;
public class Q11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//숫자의 개수
		String num = sc.next();//문자열 입력
		String[] a=num.split("");//문자열자르기
		int b[]=new int[n];//문자배열a를 int배열b로하기위한 변수,길이는 n
		int sum=0;//더하기
		for(int i=0;i<a.length;i++) {
			b[i]=Integer.parseInt(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			sum+=b[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
