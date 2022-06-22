import java.util.Scanner;

/*
 * String example
 * 
 * 회문 문자열 ->StringBuilder사용
 * 앞에서 읽을때나 뒤에서 읽을때나 같은 문자열을 회문 문자열이라고함
 * 문자열이 입력도면 해당 문자여리 회문 문자열이라면 yes를 , 회문문자열이 아니라면 no를 반환하는 프로그램을
 * 작성하여라
 * 
 * 첫줄에는 길이가 100을 넘지 않는 공백이 없는 문자열이 들어온다.
 * 회문을 검사할때 대소문자를 구문하지 않는다.
 * 
 */
public class Q79 {
	public static String solution(String str) {
		String answer = "";

		str = str.toUpperCase();
		String tmp = new StringBuilder(str).reverse().toString();
		if (tmp.equals(str))
			return "YES";
		else {
			return "NO";
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String str = scan.next();
		System.out.println(solution(str));


	}

}
