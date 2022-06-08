import java.util.Arrays;
import java.util.Scanner;

/*
 * 중복확인문제
 * ->n명의 학생들이 적어낸 숫자 중에 중복된 숫자가 존재한다면 D출력 , 그렇지 않다면 U를 출
 * 력하시오
 * 
 */
public class Q67 {
	public static String solution(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr);

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1])
				answer = "D";
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 사이즈를 입력하세요");
		int n = scan.nextInt();

		System.out.println("학생들이 적어낸 숫자를 입력하세요");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(n, arr));


	}

}
