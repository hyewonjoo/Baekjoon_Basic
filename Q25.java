import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
		 * ->메소드 활용 문제
		 * ->ex)1+2+3+4+5=15
		 * 
		 */

		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		sum(a);



	}

	private static void sum(int a) {
		int sum = 0;
		int first = 0;
		int finish = 0;
		String result = "";
		String sresult = "";
		for (int i = 1; i <= a; i++) {
			sum += i;

			if (i == 1) { // 첫번째 숫자
				first = i;
			} else if (i == a) { // 마지막 숫자
				finish = i;
			} else { // 중간
				result = "+" + String.valueOf(i);
				sresult = sresult + result;

			}
		}
		System.out.print(first + sresult + "+" + finish + "=" + sum);



	}
}
