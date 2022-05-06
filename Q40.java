import java.util.Scanner;

public class Q40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * N개의 숫자가 공백 없이 쓰여있다. 
		 * 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 * 
		 * 
		 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
		 * 둘째 줄에 숫자 N개가 공백없이 주어진다.
		 * 
		 * 입력으로 주어진 숫자 N개의 합을 출력한다.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("N을 입력하세요");
		int N = scan.nextInt();
		String number = scan.next();
		int sum = 0;

		for (int i = 0; i < N; i++) {

			int cnumber = number.charAt(i) - '0';
			// 이때 charAt()은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0'
			// 을 해주어야함!!


			sum += cnumber;



		}

		System.out.println(sum);
	}

}
