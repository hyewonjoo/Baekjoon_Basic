import java.util.Scanner;
import java.util.Stack;

/*
 * 후위 연산식
 * 
 * -첫줄에 후위 연산식이 주어지며 연산식의 길이는 50이 넘지 않는다
 * -후위 연산식으로 연산한 결과를 출력해준다 -> 스택 이용
 */
public class Q61 {
	public static Integer solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>(); // 인티져 형식의 스택을 생성
		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) {// 만약 캐릭터형x가 숫자라면
				stack.push(x - 48); // 문자열을 정수형으로 바꿔주어서 stack에 넣어줌
			} else {
				// 숫자가 아닌 연산기호를 만났을때
				int rt = stack.pop();
				int lt = stack.pop();
				if (x == '+')
					stack.push(lt + rt);
				if (x == '-')
					stack.push(lt - rt);
				if (x == '*')
					stack.push(lt * rt);
				if (x == '/')
					stack.push(lt / rt);

			}
		} // for
		if (stack.size() == 1) {
			answer = stack.get(0);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("후위 연산식을 입력하세요");
		String str = scan.next();
		System.out.println(solution(str));

	}

}
