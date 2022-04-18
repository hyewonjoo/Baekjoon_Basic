import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
		 * O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
		 *  문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
		 *   예를 들어, 10번 문제의 점수는 3이 된다.
		
		 "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		
		 OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		 */

		/*
		 * 키보인트, x인 부분에서 초기화를 시켜줘야함!
		 */

		String result = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int count = 0;
		int sumsum = 0;
		String sum = "";
		String sCount = "";
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) { // 루프를 돌리 횟수
			result = scan.next(); // OX입력받음
			for (int j = 0; j < result.length(); j++) {
				if (result.charAt(j) == 'O') {
					count++;
					sumsum += count;
				}
				if (result.charAt(j) == 'X') {
					count = 0; // 초기화 시켜주기
				}

			} // 두번째 for문 끝 -> sumsum의 결과가 나옴
			sCount = String.valueOf(sumsum);
			sum = sum + sCount + "\n";
			sumsum = 0; // 다시한번 초기화시켜주기
			count = 0;


		}
		System.out.println(sum);



	}

}
