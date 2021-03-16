//크로아티아 알파벳
//20200111
//stringAlgorithm

import java.util.Scanner;

public class Q2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String croatia[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		for (int i = 0; i < croatia.length; i++) {
			word = word.replaceAll(croatia[i], "c");
		}
		System.out.println(word.length());
		sc.close();
	}

}
//replace 사용한다.