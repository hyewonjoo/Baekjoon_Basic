import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 
		 * 출력 형식에 맞춰서 출력하면 된다.
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("출력 할 구구단의 단을 입력하세요");
		int num = scan.nextInt();

		for (int i = 1; i <= 9; i++) {

			System.out.printf("%d * %d = %d\n", num, i, num * i);


		}

	}
}
