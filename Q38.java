import java.util.Scanner;

public class Q38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 세 정수 A, B, C가 주어진다. 
		 * 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
		 * 
		 * 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
		 * 
		 * 두 번째로 큰 정수를 출력한다.
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num2 & num1 > num3) {// num1이 제일 큰 경우

			if (num2 > num3) {
				System.out.println(num2);
			} else {
				System.out.println(num3);
			}


		} else if (num2 > num1 & num2 > num3) {// num2이 제일 큰 경우
			if (num1 > num3) {
				System.out.println(num1);
			} else {
				System.out.println(num3);
			}



		} else if (num3 > num2 & num3 > num1) {// num3이 제일 큰 경우
			if (num2 > num1) {
				System.out.println(num2);
			} else {
				System.out.println(num1);
			}


		}


	}
}
