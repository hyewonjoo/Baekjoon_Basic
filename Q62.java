import java.util.Scanner;

/*
 * String활용문제
 * 
 * 입력 : 첫줄에 문자열 입력된다. 문자열의 길이는 100이 넘지 않는다.
 * 문자열의 구성은 알파벳으로만 되어있다.
 * 
 * 출력 : 첫 줄에 대문자는 소문자로 , 소문자는 대문자로 변환되어 문자열을 출력한다.
 *
 */
public class Q74 {
	public static String solution(String str) {
		String answer = "";
		// foreach문 활용
		for (char x : str.toCharArray()) {
			if (Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x); // 대문자로 바꿔주고 answer에다가 누적시킴 , 자동형변환
			} else {
				answer += Character.toLowerCase(x); // 소문자로 바꿔주고 answer에다가 누적시킴 ,자동형변환
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단어를 입력하세요");
		String str = scan.next();

		System.out.println(solution(str));

	}

}
