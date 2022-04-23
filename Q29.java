import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * 문자열 S를 입력받은 후에, 
		 * 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
		 *  즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
		 *  S에는 QR Code "alphanumeric" 문자만 들어있다.
		 *  
		 *  
		 *  첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 
		 *  문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
		 */

		Scanner scan = new Scanner(System.in);


		System.out.println("테스트 케이스 횟수를 입력하세요");
		int TestCase = scan.nextInt();
		char result;
		String sum = "";

		for (int i = 0; i < TestCase; i++) {


			System.out.println("출력횟수입력하세요");
			int writeCount = scan.nextInt();

			System.out.println("단어 입력하세요");
			String word = scan.next();
			System.out.println();


			for (int j = 0; j < word.length(); j++) {
				for (int z = 1; z <= writeCount; z++) {
					result = word.charAt(j);
					sum += String.valueOf(result);
				}

			} // 2중 for문 닫기
			sum = sum + "\n";


		} // 마지막 for문

		System.out.println(sum);

	}


}

