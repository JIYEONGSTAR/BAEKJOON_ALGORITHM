//그룹 단어 체커
import java.util.Scanner;
public class Q1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//받을 단어 개수
		String word[] = new String[n];
		for(int i=0;i<n;i++) {
			word[i]=sc.next();
		}
		int count = 0;//그룹단어개수
		boolean [] alpha = new boolean[26];
		for(int i=0;i<n;i++) {
			for(int j=1;j<word[i].length();j++) {
				char w[]=word[i].toCharArray();//한줄에 입력받은 글자 한 알파벳씩
				if(w[i]==w[i-1]) {
					alpha[(int)w[i]-97]=true;
				}
				if(w[i]!=w[i-1]) {
					if(alpha[(int)w[i]-97]=true) {
						break;
					}
				}
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
