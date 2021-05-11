
//최소공배수
//20210512
//수학, 정수론, 유클리드 호제법
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Q1943 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()) ;
		for(int i=0;i<t;i++) {
			String[] s = br.readLine().split(" ");
			int num1 = Integer.parseInt(s[0]);
			int num2 = Integer.parseInt(s[1]);
			int gcd =gcd(num1,num2);
			System.out.println(num1*num2/gcd);//두 수의 곱 나누기 최대공약수 = 최소공배수 
		}
	}
	static int gcd(int num1,int num2) {
		if(num2==0) {
			return num1;
		}
		else {
			return gcd(num2,num1%num2);
		}
	}

}
