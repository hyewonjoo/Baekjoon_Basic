import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		// 팩토리알은 재귀함수의 대표적인 에제이다.
		// 반복함수로 풀어보는것과, 재귀함수로 풀어보는것 둘다 해보겠다.
		// 먼저, 팩토리얼을 반복함수로 풀기!

		/*
		 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int number = scan.nextInt();

		System.out.println(factorial(number));

	}


	public static int factorial(int number) {
		int sum = 1;
		for (int i = 1; i <= number; i++) { // i 혹은 sum이 0이 되지 않도록 주의하자
			sum = sum * i; // sum에다가 i가 1,2, ---- number가 될떄까지 계속 곱해줌 (단 sum은 0이 아님)

		}

		return sum;
	}



}
