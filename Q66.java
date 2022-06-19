import java.util.Scanner;

/*
 * String관련 example -> indexOf로 다르게 풀어보기2!!!!
 * 설명: 문장 속 단어 찾기
 * 
 * 첫줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일경우
 * 문장 속에서 가장 앞쪽에 위치한 답으로 한다.
 */
public class Q76_2 {

	public static String solution(String str) {
		String answer = ""; // 가장 긴 단어를 저장
		int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
		int pos;


		// 띄어쓰기가 계속 존재한다면(pos가 -1이 아니라면) -> while문 돌아감
		while ((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos); // 단어를 한개씩 추출
			int len = tmp.length();

			if (len > m) {
				m = len;
				answer = tmp; // 그 tmp를 answer에 넣어줌
			}
			str = str.substring(pos + 1);
		} // while

		// while문이 마치고 문장 끝에 있는 마지막 단어와 한번 더 비교해줘야함
		// str에는 현재 마지막 남은 단어가 남아있음
		if (str.length() > m)
			answer = str;

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
		String str = scan.nextLine();

		System.out.println(solution(str));


	}

}
