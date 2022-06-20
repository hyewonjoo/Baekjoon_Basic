import java.util.Scanner;

/*
 * String example
 * 특정 문자 뒤집기
 *
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */
public class Q77 {

	public static String solution(String str) {
		String answer = "";

		char[] s = str.toCharArray();// 매개변수로 받은 str을 char배열의 s로 만듦
		int lt = 0;// str의 첫번째 문자
		int rt = str.length() - 1; // str의 마지막 문자

		while (lt < rt) {// lt가커지면 while문 스탑!!
			// 특수문자이면 그냥 순서만 넘어감
			if (!Character.isAlphabetic(s[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(s[rt])) {
				rt--;

			} else {// 알파벳일 경우는 스왑시킴

				char temp = s[lt];
				s[lt] = s[rt];
				s[rt] = temp;
				lt++;
				rt--;
			}
		} // while문을 나오면 -> s가 뒤집어져있음

		return answer = String.valueOf(s);



	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String str = scan.next();
		System.out.println(solution(str));
	}

}
