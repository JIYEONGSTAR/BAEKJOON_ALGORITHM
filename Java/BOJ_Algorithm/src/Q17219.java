//비밀번호 찾기
//20210502
//해시 

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q17219 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);// 저장된 사이트 주소의 수
		int m = Integer.parseInt(input[1]);// 비밀번호를 찾으려는 사이트 주소의 수

		java.util.HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			input = br.readLine().split(" ");
			String site = input[0];
			String password = input[1];
			map.put(site, password);
		}

		for (int i = 0; i < m; i++) {
			String inputSite = br.readLine();
			System.out.println(map.get(inputSite));
		}
	}

}
