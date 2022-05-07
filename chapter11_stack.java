import java.util.Stack;

public class chapter11_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack(); // 스택 생성
		String expression = "((3+5)*8-2)";

		System.out.println("expression: " + expression);

		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);

				if (ch == '(') {
					st.push(ch + ""); // 집어 넣음
				} else if (ch == ')') {
					st.pop();// 꺼냄 -> 비어있을 때 오류 -> catch(Exception e)로 이동
				}
			} // for문 종료

			if (st.isEmpty()) {
				System.out.println("괄호가 일치합니다");
			} else {
				// ((3+5)*8-2)
				// 여는 괄호가 남아 있는경우
				System.out.println("괄호가 일치하지 않습니다.");

			}

		} catch (Exception e) {
			// ((3+5)*8-2)))))
			// pop을 해야하는데 괄호가 더이상 없는 경우 -> 예외가 발생하여 -> 이 문자 실행
			System.out.println("괄호가 일치하지 않습니다2");
		} // try-catch

	}
}
