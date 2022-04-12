import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 두 정수 A와 B를 입력받은 다음, 
		 * A+B를 출력하는 프로그램을 작성하시오.
		 */

		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;
		int input;
		String result = "";
		String sum = "";



		for (int i = 1; i <= 5; i++) {
			System.out.println("숫자 두개를 입력하세요");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			input = num1 + num2;
			result = String.valueOf(input + "\n");

			sum = sum + result;

		}
		System.out.println();
		System.out.println(sum);



	}

}
