import java.util.Scanner;

/*
 * 버블정렬
 * 이웃한 두수 비교 -> 앞에가 크고 뒤에가 작으면 스왑해줌
 * i가 한번 돌때마다(가장 바깥 for문) -> 맨 뒤에 가장 큰 숫자가 놓이게된다.
 */
public class Q65 {

	public static int[] solution(int n, int[] arr) {
		for (int i = 0; i < n - 1; i++) {// 턴횟수!!!!(가장 큰 사이클)
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];// 작은값을 arr[j]에 넣어줌
					arr[j + 1] = temp; // 기존의 arr[j]=temp값을 arr[j+1]에 넣어줌
				}
			}
		} // for문 끝
		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 사이즈는 몇입니까");
		int n = scan.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();

			for (int x : solution(n, arr))
				System.out.println(x + " ");
		}
	}

}
