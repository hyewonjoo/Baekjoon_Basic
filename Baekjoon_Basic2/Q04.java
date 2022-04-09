import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1부터 n까지, 1부터 m까지 숫자가 적힌
		서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하세요");
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		for (int i = 1; i <= input1; i++) {
			for (int j = 1; j <= input2; j++) {

				System.out.println("모든 경우의 수는" + i + "x" + j + "이다.");

			}
		}



	}


}
