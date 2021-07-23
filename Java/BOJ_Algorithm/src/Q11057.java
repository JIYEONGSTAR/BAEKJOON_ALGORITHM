//20210724
//오르막 수 
//다이나믹 프로그래밍 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q11057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int DP[][] = new int[N + 1][10];// 다이나믹프로그래밍
		for (int i = 0; i < 10; i++) {
			DP[0][i] = 1;// 0단은 다 1로 저장
		}
		for (int i = 1; i <= N; i++) {
			DP[i][0] = 1;// 0번째 항은 1
			for (int j = 1; j < 10; j++) {
				DP[i][j] = DP[i][j - 1] + DP[i - 1][j];// 각 항마다 저장
				DP[i][j] %= 10007;// 나머지로 저장
			}

		}
		System.out.println(DP[N][9]);// 오르막 수의 개수를 10,007로 나눈 나머지를 출력한다.

	}

}
