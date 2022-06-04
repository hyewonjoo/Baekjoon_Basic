import java.util.Scanner;

/*
 * 선택정렬
 * -가장 작은 값부터 큰값까지 오름차순으로 정리된 정렬을 의미한다.
 */
public class Q64 {

	public static int[] solution(int n, int[] arr) {// 배열을 반환해준다
		for (int i = 0; i < n - 1; i++) {
			int idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					idx = j;
				}
			} // for2문을 빠져나옴 -> idx에는 가장 작은 인덱스의 번호가 저장됨

			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
		} // for1

		return arr;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하시오");
		int n = scan.nextInt();

		System.out.println("배열의 요소를 입력하시오");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		for (int x : solution(n, arr))
			System.out.println(x + " "); // solution에서 반환된 배열의 요소들을 하나하나 출력해줌

	}

}
