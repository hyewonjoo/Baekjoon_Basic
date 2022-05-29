import java.util.Scanner;
import java.util.Stack;

/*
 * 스택관련문제 :
 * 입력된 문자열에서 소괄호 () 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요
 * 
 * 입력:첫줄에 문자열이 주어진다. 문자열의 길이는 100이 넘지 않는다
 * 출력:남은 문자만 입력한다.
 */
public class Q59 {

	public static String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack();

		for (char x : str.toCharArray()) {
			if (x == ')') {// 닫는 괄호를 만나면 여는 괄호까지 전부 pop해줌
				while (stack.pop() != '('); // POP은 꺼내고 그 값을 리턴시켜줌 -> 리턴시켜준 값이 (이 된다면 멈춤

			} else {
				stack.push(x);
			}
		} // FOR

		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String str = scan.next();
		System.out.println(solution(str));


	}

}
