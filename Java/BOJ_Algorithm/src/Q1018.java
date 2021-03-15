//체스 다시 칠하기
//20210315
//부르트포스 

import java.util.Scanner;

public class Q1018 {
	public static int[][] inputbox;// 입력받는 배열 
	public static int min = 64;// 최소값 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		n = sc.nextInt(); // 행
		m = sc.nextInt(); // 열
		sc.nextLine(); // 있는 바둑판 배열 입력
				inputbox = new int[n][m];
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine().trim();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					inputbox[i][j] = 0; // W일 때는 0
				} else {
					inputbox[i][j] = 1; // B일 때는 1
				}
			}
		}
		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				min = Math.min(min, find(i, j));
			}
		}
		System.out.println(min);
	}

	public static int find(int x, int y) {
		int countW = 0;// white로 시작할 때 틀린 거 카운트
		int countB = 0;// black로 시작할 때 틀린 거 카운트
		for (int i = x; i < x+8; i++) {//
			for (int j = y; j < y+8; j++) {
				if ((i + j) % 2 != inputbox[i][j]) { //배열이 w로 시작하는 것과 입력값 비
					countW++;
				}
				if((i+j+1)%2!=inputbox[i][j]) {//배열이 b로 시작하는 것과 입력값 비
					countB++;
				}
			}
		}
		return Math.min(countW, countB);
	}

}
//참조코드 https://cocoon1787.tistory.com/154
//참조코드 https://st-lab.tistory.com/101