
//그룹 단어 체커
import java.util.Scanner;

public class Q1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 받을 단어 개수
		String word[] = new String[n];//문자열
		for (int i = 0; i < n; i++) 
			word[i] = sc.next();//각 문자열 입력
		int count = 0;// 그룹단어개수
		for (int i = 0; i < n; i++) {
			boolean[] alpha = new boolean[26];//나왔는지 확인하는 boolean타입의 alpha
			char w[] = word[i].toCharArray();// 한줄에 입력받은 글자 한 알파벳씩
			alpha[(int) w[0] - 97] = true;//첫번째로 나온건 무조건 true
			for (int j = 0; j < word[i].length() - 1; j++) {
				if (w[j] != w[j + 1]) {//뒤의 알파벳과 같지 않으면 
					if (alpha[(int) w[j + 1] - 97]) {//이미 나온 알파벳이라면 count를 --하고 반복문 탈출
						count--;
						break;
					}
					alpha[(int) w[j + 1] - 97] = true;//이미 나온 알파벳이 아니면 bool타입을 true로
				}
				if (w[j] == w[j + 1]) {//뒤의 알파벳과 같으면
					alpha[(int) w[j] - 97] = true;//true로
				}
			}
			count++;//그룹단어 ++
		}
		System.out.println(count);//그룹단어 출력
		sc.close();
	}

}