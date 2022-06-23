import java.util.Scanner;

/*
 * 
 * String example -유효한 펠린드롬 ->replaceAll 정규식 활용
 * 
 * 앞에서 읽을때나 뒤에서 읽을때나 같은 문자열을 펠린드롬 이라고 한다.
 * 문자열이 입력되면 해당 문자열이 펠린드롬이면 YES를 그렇지 않으면 NO가 출력되는
 * 프로그램을 작성하여라
 * 
 * 단 회문검사를 할때 알파벳만 가지고 회문검사를 하며 대소문자는 구별하지 않는다.
 * 알파벳 의외의 문자들은 무시한다.
 * 
 */
public class Q80 {

	public static String solution(String s) {
		String answer = "NO";

		// "[A^-z]" 대문자 A부터 Z까지가 아닌것들은 전부 빈문자 처리
		s = s.toUpperCase().replaceAll("[A^-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();

		// s는 문자를 앞에서 부터 읽어온것이고 tmp는 뒤에서 부터 읽어온것이다.
		// 두개가 같으면 펠린드롬이기 때문에 yes를 출력해준다.
		if (s.equals(tmp))
			answer = "YES";
		else {
			answer = "NO";
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
