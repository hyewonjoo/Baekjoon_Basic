import java.util.Arrays;
import java.util.Scanner;

/*
 * 이분검색
 * 임의의 n개의 숫자가 입력으로 주어진다. n개의 숫자를 오름차순으로 졍렬한 다음 n개의 숫자 중 한개의
 * 수인 m이 주어지면 이분검색으로 m이 정렬된 상태에서 몇번째에 있는지 구하는 프로그램을 작성하여라
 * 단 중복값은 존재하지 않는다.
 */
public class Q69 {
	public static int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0, rt = n - 1;
		// int mid = (lt + rt) / 2; 여기서 초기화를 시켜주면 고정값으로 3이됨

		while (lt <= rt) {
			int mid = (lt + rt) / 2; // 주의!! while문 밖에다 쓰면 안됨, 반드시 while문 안에 써서 한바퀴 돌떄마다 초기화 시켜줘야함
			if (arr[mid] == m) {
				answer = mid + 1;
				break;
			} else if (arr[mid] > m) {
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 사이즈를 입력하세요");
		int n = scan.nextInt();
		System.out.println("index를 검색할 숫자를 입력하세요");
		int m = scan.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(solution(n, m, arr));

	}

}
