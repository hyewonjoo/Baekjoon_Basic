import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 별찍기
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int z = 1; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
