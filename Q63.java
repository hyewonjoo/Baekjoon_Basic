import java.util.Scanner;

/*
 * String활용문제
 * 
 * 입력 : 첫줄에 문자열 입력된다. 문자열의 길이는 100이 넘지 않는다.
 * 문자열의 구성은 알파벳으로만 되어있다.
 * 
 * 출력 : 첫 줄에 대문자는 소문자로 , 소문자는 대문자로 변환되어 문자열을 출력한다.
 * 
 * ->아스키 코드를 활용하여 다시 풀어보자
 * 아스키코드
 * 대문자:65~90
 * 소문자:97~122
 *
 */
public class Q74_2 {
	public static String solution(String str) {
		String answer = "";
		// foreach문 활용
		for (char x : str.toCharArray()) {
			if (x >= 65 && x <= 90) {// 대문자
				answer += (char) (x + 32); // x값에서 -32가 되면 소문자가 됨
			} else if (x >= 97 && x <= 122) {// 소문자
				answer += (char) (x - 32);
			}
		}

		return answer; // char x가 자동형변환 되어 answer에 저장됨
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단어를 입력하세요");
		String str = scan.next();

		System.out.println(solution(str));

	}

}
