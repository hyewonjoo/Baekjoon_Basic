import java.util.Scanner;

/*
 * String example -숫자만 추출 - 아스키코드로 풀기
 * 
 * 문자와 숫자가 섞여있는 문자열이 주어지면 숫자만 추출하고 그 순서대로 자연수를 만든다
 * 첫 줄에 숫자가 적힌 문자열이 주어진다.
 * 이 문자의 길이는 100이 넘지않는다.
 * 
 * 
 */
public class Q81 {

	public static int solution(String s) {
		int answer = 0;

		for (char x : s.toCharArray()) {
			if (x >= 48 && x <= 57) { // x가 숫자일경우!!!
				answer = answer * 10 + (x - 48);
				// x-48을 해줘야함 !!! x는 지금 char형!!

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
