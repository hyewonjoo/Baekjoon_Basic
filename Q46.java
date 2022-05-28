import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 1부터 100사이의 자연수가 적힌 n장의 카드를 가지고 있다.
 * 같은 숫자의 카드가 여러장 있을 수 있으며 이 중 3장을 뽑아 각 카드에 적힌 수를 합한값을 기록하려고한다.
 * 3장을 뽑을 수 있는 모든 경우의 수를 기록하며 그 중 k번째로 큰 수를 출력하는 프로그램을
 * 작성하여라
 * 
 * 입력 : 첫줄에 자연수n과 k가 입력되고 그 다음 줄에 n개의 카드값이 입력된다.
 * 출력 :첫번째줄에 k번째의 수를 출력하고 존재하지않으면 -1을 출력해라
 */
public class Q58 {

	public static int solution(int[] arr, int n, int k) {
		int answer = -1; // k번쨰로 큰 수
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 트리셋(정렬+중복제거)을 내림차순으로
																			// 정렬

		// 먼저 카드 3장을 겹치지 않게 뽑는 + 그 숫자의 합 -> 모든 경우의 수를 출력해준다
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int z = j + 1; z < n; z++) {
					// System.out.println(i + " " + j + " " + z);
					Tset.add(arr[i] + arr[j] + arr[z]); // 각 인덱스에 맞는 배열의 합을 트리셋에 넣어줌
				}
			}
		} // for문 끝

		int cnt = 0;
		for (int x : Tset) {
			cnt++;
			// System.out.println(cnt + ":" + x); cnt가 key, x가 value
			if (cnt == k)
				return x;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("뽑을 카드의 수를 입력하시오");
		int n = scan.nextInt(); // 카드 n장의 수

		System.out.println("k를 입력하시오");
		int k = scan.nextInt(); // k번째로 큰 수 출력

		System.out.println("뽑은 카드를 입력하시오");
		int[] arr = new int[n]; // 카드 n장의 수
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(arr, n, k));

	}

}
