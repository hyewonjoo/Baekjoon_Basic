import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 첫째 줄부터 N번째 줄까지 차례대로 숫자를 출력한다
		 *         11
		 *        1221
		 *       123321
		 * 사용자로부터 N을 입력받아라.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("출력할 숫자를 입력하시오");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int z = 1; z <= i; z++) {
				System.out.print(z);
			}
			for (int a = i; a >= 1; a--) {
				System.out.print(a);
			}
			System.out.println(); // 행을 띄어주는 역활
		}



	}

}
