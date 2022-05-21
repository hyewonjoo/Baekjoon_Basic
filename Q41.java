import java.util.HashMap;
import java.util.Scanner;

public class Q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 학급선거
		 * 반장을 뽑아라
		 * hash map을 선거하여 가장 득표를 많이한 반장을 뽑아보자(단 반장은 한명이라고 가정하자)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("투표 결과를 입력하세요");
		String answer = scan.next();
		System.out.println(solution(answer));



	}

	public static char solution(String s) {

		int max = Integer.MIN_VALUE;
		char result = ' ';
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char x : s.toCharArray()) { // toCharArray는 문자열을 한글자씩 쪼개서 이를 char타입의 배열로 넣어줌
			// System.out.println(x);
			map.put(x, map.getOrDefault(x, 0) + 1); // 각각 알파벳(키의값)을 카운트해줌


			if (map.get(x) > max) {
				max = map.get(x);
				result = x;

			} // 향상된 for문 끝!
		}
		System.out.println(map.toString());
		return result;
	}


}
