import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
		 */

		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		while (flag) {

			System.out.println("문자를 입력하세요");
			String input = scan.next();


			if (input.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}

}
