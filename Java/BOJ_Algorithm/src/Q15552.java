//빠른 A+B
//20200105
//forAlgorithm

import java.io.*;

public class Q15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());

		for (int i = 0; i < n; i++) {
			String text = br.readLine();
			String[] word = text.split(" ");
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			bw.write((a + b) + "\n");
		}

		bw.flush();
		bw.close();
	}
}

//어려워서 인터넷 참고함
//buffer공부하기
