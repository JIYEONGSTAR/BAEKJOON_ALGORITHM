//유기농 배추
//20210511
//그래프,DFS,BFS

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1012 {
	static int[] dx = { -1, 0, 1, 0 };// 오른쪽부터 시계방향 탐색
	static int[] dy = { 0, -1, 0, 1 };
	static int[][] arr;// 땅 별 배추
	static int N;
	static int M;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int test = 0; test < T; test++) {
			String str[] = br.readLine().split(" ");// 가로 세로 개수입력
			M = Integer.parseInt(str[0]);// 가로길이
			N = Integer.parseInt(str[1]);// 세로길이
			int K = Integer.parseInt(str[2]);// 배추개수
			int count = 0;
			arr = new int[N][M];
			for (int i = 0; i < K; i++) {
				str = br.readLine().split(" ");
				arr[Integer.parseInt(str[1])][Integer.parseInt(str[0])] = 1;// 배추 심어진 곳 로 놓기
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (arr[i][j] != 0) {
						DFS(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

	public static void DFS(int X, int Y) {
		for (int i = 0; i < 4; i++) {
			int nextX = X + dx[i];
			int nextY = Y + dy[i];

			if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
				continue;
			}
			if (arr[nextX][nextY] == 0) {
				continue;
			}

			arr[nextX][nextY] = 0; //상하좌우에있는 배추 0으로 만들기 
			DFS(nextX, nextY);

		}
	}

}
