import java.util.Scanner;

/*
 * 삽입정렬
 * temp를 삽입해주기떄문에 삽입정렬
 */
public class Q66 {
	public static int[] solution(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int temp = arr[i], j;
			for (j = i - 1; j >= 0; j--) {// 주의!
				if (arr[j] > temp)
					arr[j + 1] = arr[j]; // 왼쪽 오른쪽 순서주의!
				else
					break; // if문 탈출
			} // for2종료
			arr[j + 1] = temp; // temp를 j+1에 삽입
		} // for1종료
		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 사이즈는 몇입니까");
		int n = scan.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int x : solution(n, arr))
			System.out.print(x + " ");
	}
}


