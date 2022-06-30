import java.util.Scanner;

/*
 * String-example -암호
 * 
 * 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
 * 비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
 * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
 * 만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과
 * 같이 해석합니다.
 * 1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합
 * 니다. 결과는 “1000001”로 변환됩니다.
 * 2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
 * 3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
 * 참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가
 * 하여 ‘Z'는 90번입니다.
 * 현수가 4개의 문자를 다음과 같이 신호로 보냈다면
 * #****###**#####**#####**##**
 * 이 신호를 4개의 문자신호로 구분하면
 * #****## --> 'C'
 * #**#### --> 'O'
 * #**#### --> 'O'
 * #**##** --> 'L'
 * 최종적으로 “COOL"로 해석됩니다.
 * 현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.
 * 
 * 
 */
public class Q84 {
	public static String solution(int n, String s) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0'); // 이진수 형태로 바꿔줌
			int num = Integer.parseInt(tmp, 2); // 2진수를 10진수로 바꿔줌

			// 아스키코드(10)진수인것을 알파벳으로 만들어줘야함
			answer += (char) num;


			s = s.substring(7); // 7뒤부터 다시 시작, 뒤에 아무것도 안남았다면 for문종료
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열의 갯수를 입력하세요");
		int n = scan.nextInt();
		System.out.println("문자열을 입력하세요");
		String str = scan.next();
		System.out.println(solution(n, str));

	}

}
