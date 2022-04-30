import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		// 이번에는 앞선 문제와 다른 방식인,
		// 팩토리알 문제를 재귀함수로 풀어보겠다

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int number = scan.nextInt();

		System.out.println(factorial(number));


	}

	public static int factorial(int number) {
		int sum = 1;
		if (number == 1) {
			return 1;
		} else {
			sum = number * factorial(number - 1);
			return sum;

			/*
			 * 자 재귀함수를 통한 팩토리알을 다시 정리해보자(내가 헷갈렸던 부분)
			 * 먼저 가볍게 number2가 들어왔다고 해보자
			 * number2는 2*factorial(1)이기 때문에 2이다.
			 * 
			 * 그다음 number에 3이 들어왔다.
			 *  3*factorial(2)인데 아까 앞에서 팩토리알 2는 2를 반환했다 따라서 6이 된다.
			 * 
			 * 마지막으로 number에 4가 왔다고 가정해보자
			 * 4*factorial(3)인데 아까 factorial(3)은 6을 반환했기에 24이다.
			 * 
			 * 찐 마지막으로 number에 5가 들어왔다고해보자
			 * 5*factorial(4)인데 위에 팩토리알 4는 24를 반환하였으므로 답은 120이다
			 */
		}
	}

}
