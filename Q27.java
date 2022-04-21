import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * N개의 숫자가 **공백 없이** 쓰여있다. 
		 * 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
		 * 둘째 줄에 숫자 N개가 공백없이 주어진다.
		 */

		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력 하세요");
		int num = scan.nextInt();

		System.out.println("공백없이 숫자를 입력하세요");
		String num2 = scan.nextLine(); // ex 54321

		// charAt은 해당 문자의 아스키 코드값을 반환 해주기 떄문에
		// 48혹은 0을 빼야한다.

		int result = 0;



		for (int i = 1; i <= num; i++) {
			result += num2.charAt(i) - 0;


		}

		System.out.println(sum);

		// checkCharAt();
		// 백준 풀다가 charAt메소드가 헷갈려서 테스트용 함수

	}

	public static void checkCharAt() {
		String num2 = "33";
		char c = num2.charAt(0);
		char c2 = num2.charAt(1);
		int c3 = num2.charAt(0); // 아스키 코드로 반환됨

		System.out.println(c); // 3
		System.out.println(c2); // 3
		System.out.println(c3); // 51
	}

}
