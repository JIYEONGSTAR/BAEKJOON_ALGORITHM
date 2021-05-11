//분수찾기
//20210512
//수학,구현 

import java.util.Scanner;

public class Q1193 {
	static int first, last;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int line = 0;// 대각선 번호
		int count = 0;// 총 합계
		while (count < n) {
			line++;
			count = (line) * (line + 1) / 2; // 라인n까지의 총 합계 2분의 n-1*n
		}
		if (line % 2 != 0) {// 라인이 홀수일 때 위로 올라간다
			first = 1 + (count - n);
			last = line - (count - n);

		} else {
			first = line - (count - n);
			last = 1 + (count - n);

		}
		System.out.println(first + "/" + last);
	}

}
