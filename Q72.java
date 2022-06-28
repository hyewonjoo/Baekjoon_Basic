import java.util.Scanner;

/*
 * String example -가장 짧은 문자 거리
 *
 * 한개의 문자열 s와 문자 t(target)가 주어지면 문자열s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요
 * 첫번째 줄에 문자열 s와 문자열 t가 주어진다. 문자열과 문자는 소문자로 주어진다.
 * 첫번째 줄에 각 문자열의s의 각 문자가 문자t와 떨어진 거리를 순서대로 출력하여라
 *
 */
public class Q82 {
	public static int[] solution(String s, char c) {
		int[] answer = new int[s.length()];// 동적으로 int배열을 잡아줌
		int p = 1000;

		// 1. s를 왼쪽에서 오른쪽으로 탐색
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {// c와s가 같으면 p에 0을 넣고, 그 값을 answer에 넣는다.
				p = 0;
				answer[i] = p;
			} else {// c와 s가 다를경우 p를 하나 증가시키고 그 p의 값을 answer에다가 넣어줌
				p++;
				answer[i] = p;

			}
		} // for


		// 2.s를 오른쪽에서 왼쪽으로 다시 탐색
		p = 1000;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == c) {
				p = 0;
				answer[i] = 0;
			} else {
				p++;
				// 여기서!!
				// p가 기존값보다 작은 경우만 answer에 추가해줘야함!!
				if (answer[i] > p) {
					answer[i] = p;

					// 같은의미의 함수-Math.min을 활용할 수도 있다.
					// answer[i]=Math.min(answer[i],p);
				}
			}
		} // fir

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String str = scan.next();
		System.out.println("t를 입력하세요");
		char c = scan.next().charAt(0); // 스트링으로 받은값 char로 변환
		for (int x : solution(str, c)) {
			System.out.print(x + " ");
		}

	}

}
