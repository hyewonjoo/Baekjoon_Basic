import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 장난꾸러기
 * 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때 첧수가 받은 번호와
 * 짝궁이 받은 번호(서로 자리를 바꾼 상태)를 차례로 출력하는 프로그램을 작성하시오
 */
public class Q68 {
	public static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] temp = arr.clone(); // 깊은복사

		Arrays.sort(temp);
		for (int i = 0; i < n; i++) {
			if (temp[i] != arr[i])
				answer.add(i + 1);
		}

		return answer;
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
