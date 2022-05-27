import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * 매출액의 종류를 구하는 문제
 * n일동안의 매출기록을 주고 연속된 k일 동안의 매출액의 종류를 각 구간별로 구하라고하였다.
 * n일간의 매출기록와 연속구간의 길이 k가 주어지면 첫번째 구간부터 각 구간ㅂ려 매출액의 종류를 출력하는 프로그램을 작성하여라.
 * 
 * ->해쉬맵+투포인트+슬라이딩 활용
 * 
 * 
 */
public class Q56 {

	public static ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>(); // 각 구간별 사이즈를 담을 arraylist
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < k - 1; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1); // 0. 0~lt까지 해쉬맵에 넣어줌
		}

		int lt = 0; // 앞의 포인터(첫번째 포인터)
		for (int rt = k - 1; rt < n; rt++) { // 뒤에포인트(두번째 포인터)

			hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1); // 1.해쉬에다가 rt값 넣어줌
			answer.add(hm.size()); // 2.사이즈를 answer에 담아줌
			hm.put(arr[lt], hm.get(arr[lt]) - 1); // 3.lt를 하나 감소시켜서 다시 세팅(해쉬맵에 다시 넣어줌)


			if (hm.get(arr[lt]) == 0)
				hm.remove(arr[lt]);// 3-1 주의!! 0이면 ->remove
			lt++;

		} // for문


		return answer;


	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇일간의 매출기록인지 입력하시오");
		int n = scan.nextInt(); // 총 몇일인지

		System.out.println("연속구간의 길이를 입력하시오");
		int k = scan.nextInt(); // 원하는 구간

		System.out.println("매출액을 입력하세요");
		int[] arr = new int[n]; // 매출액의 종류를 넣어줄 배열

		for (int i = 0; i < n; i++) { // 총 n일간의 매출액을 하나하나 입력해준다.
			arr[i] = scan.nextInt();
		}
		for (int x : solution(n, k, arr))
			System.out.print(x + " ");

	}

}

