
//키로거
//20210406
//스택, 덱, 연결 리스트
import java.util.Scanner;
import java.util.Stack;

public class Q5397 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트케이스
		sc.nextLine();//엔터치고 입력 받기 위해 
		for (int i = 0; i < t; i++) {
			String s = sc.nextLine();
			String password = getPassword(s);//메소드 호출 
			System.out.println(password);
		}
	}

	public static String getPassword(String s) {
			Stack<Character> result = new Stack<>();//결과 
			Stack<Character> temporary = new Stack<>();//담아놓기 
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < s.length(); j++) {
				switch (s.charAt(j)) {
				case '<':
					if (!result.isEmpty()) //결과스택이 비어있지 않으면 마지막 값이 pre스택에 넣어다. 
						temporary.push(result.pop());
					break;
				case '>':
					if(!temporary.isEmpty()) result.push(temporary.pop());//pre스택이 비어있지 않으면 그 값이 결과스택에 추가된다. 
					break;
				case '-':
					if(!result.isEmpty()) result.pop(); //-가 들어오면 결과스택 마지막이 지워진다.
					break;
				default:
					result.push(s.charAt(j));//아무것도 없으면 결과 스택에 넣는다. 
					break;
				}
			}
			while(!temporary.isEmpty()) {//임시로 넣어둔 값이 다 결과값으로 들어가게 한다.
				result.push(temporary.pop());
			}
		for(int i=0;i<result.size();i++) {//스택을 문자열로 넣기 위한 작업 
			sb.append(result.elementAt(i));
		}
			return sb.toString();

		}
//bp<<a>c넣어보
}