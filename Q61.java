import java.util.Scanner;

/*
 * string활용 문제
 * 
 * 입력: 첫줄에 문자열이 주어지고, 두번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성되어있다.
 * 
 * 첫줄에 해당 문자의 갯수를 출력하시오
 */
public class Q73 {

	public static int solution(String str, char t) {
		int answer = 0;
		// str과 t전부 대문자로 바꿔주기
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		// 1.for문으로
		// for (int i = 0; i < str.length(); i++) {
		// if (str.charAt(i) == t) {
		// answer++;
		// }
		// }

		// 2.foreach사용
		//str.toCharArray -> str을 기반으로 해서 str문자 한개한개 분리시켜 -> 문자 배열을 생성
		for (char x : str.toCharArray()) {
			if (x == t)
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("단어 입력하세요");
		String str = scan.next();

		System.out.println("알파벳을 입력하세요");
		char c = scan.next().charAt(0);

		System.out.println("총 갯수 : " + solution(str, c));



	}

}
