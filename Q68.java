import java.util.Scanner;

/*
 * String관련 문제
 * 
 * 소문자로 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 * 
 * 첫줄에 문자열이 입력되고 문자열의 길이는 100이 넘지 않는다.
 * 
 */
public class Q78 {
	public static String solution(String str) {
		String answer = " ";
		for (int i = 0; i < str.length(); i++) {
			// System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));

			// 서로 같다면 중복된 문자가 아님!!
			if (i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}

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
