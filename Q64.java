import java.util.ArrayList;
import java.util.Scanner;

/*
 * 스트링 활용문제
 *
 * 입력: 첫줄에 자연수가 주어지면 두번째줄부터 N개의 단어가 각 줄에 하나씩 주어진다.
 * 단어는 영어 알파벳으로 궝되어있다.
 * 
 * 출력 : n개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력한다.
 * 
 */
public class Q75 {
	public static ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			// rever()메소드 :x라는 단어를 뒤집어줌
			// StringBuilder로 쓰고 -> 다시 string으로 변환해주어 temp에 넣어줘야함
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력할 단어의 갯수를 입력하세요");
		int n = scan.nextInt();

		String[] str = new String[n];
		System.out.println("단어를 입력하세요");
		for (int i = 0; i < n; i++) {
			str[i] = scan.next();
		}

		for (String x : solution(n, str)) {
			System.out.println(x);
		}

	}

}
