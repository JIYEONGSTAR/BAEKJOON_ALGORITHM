
//균형잡힌 세상
//20210328
//문자열, 스택 
import java.util.Scanner;
import java.util.Stack;

public class Q4949 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			String sentence = sc.nextLine();
			if (sentence.equals("."))
				break;
			else {
				System.out.println(find(sentence));
			}
		}
	}

	public static String find(String s) {
		Stack<Character> stack = new Stack<>();// stack이란 이름의 새로운 캐릭터형 스택 만들기

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[') { //(나 [ 있으면 스택에 추가 
				stack.push(c);
			} else if (c == ')') { //)가 나왔을 때 스택이 비어있거나 (가 아니면 no리턴 , 아니면 pop
				if (stack.isEmpty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if (c == ']') {//]가 나왔을 때 스택이 비어있거나 [가 아니면 no리턴 , 아니면 pop
				if (stack.isEmpty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}
//		if (stack.isEmpty()) { //스택이 비어있으면 yes 
//			return "yes";
//		} else {
//			return "no";
//		}
		return (stack.isEmpty()?"yes":"no");
	}
}
