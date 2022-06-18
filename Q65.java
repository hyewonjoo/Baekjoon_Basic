import java.util.Scanner;

/*
 * String관련 example
 * 설명: 문장 속 단어 찾기
 * 
 * 첫줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일경우
 * 문장 속에서 가장 앞쪽에 위치한 답으로 한다.
 * 
 */
public class Q76 {

	public static String solution(String str) {
		String answer = ""; // 가장 긴 단어를 저장
		int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화

		String[] s = str.split(" ");
		for (String x : s) {
			// System.out.println(x);
			int len = x.length();// 각각 단어의 길이가 len에 들어감

			if (len > m) {
				m = len; // 최댓값이 계속 m으로 갱신됨
				answer = x; // answer에 단어(x) 넣어주기
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
		String str = scan.nextLine();

		System.out.println(solution(str));


	}

}
