/*
 * String example - 문자열 압축
 * 
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에
 * 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 구현하여라
 * 
 * 첫줄에 문자열이 주어지며, 길이는 100을 넘지 않고,
 * 출력 첫 줄에 압축된 문자열을 출력한다.
 */
import java.util.Scanner;

public class Q83 {

	public static String solution(String s) {
		String answer = "";
		s = s + " "; // 단어 맨 뒤에 빈문자를 하나 추가해줌으로서 outofindex에러 안나게함
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1))
				count++;
			else {
				// 다른 문자를 만나면, 알고리즘 시작!
				answer += s.charAt(i);
				if (count > 1) {// 1은 그냥 지나가면되기떄문에, 1보다 클떄만
					answer += String.valueOf(count);
				}
				count = 1;
			}
		} // for

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String str = scan.next();
		System.out.println(solution(str));

	}

}
