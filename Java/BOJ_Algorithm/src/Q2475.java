//검증수
//20210512
//수학, 구현, 사칙연산

import java.io.*;

public class Q2475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=Math.pow(Integer.parseInt(arr[i]),2);
		}
		System.out.println(sum%10);
	}

}
