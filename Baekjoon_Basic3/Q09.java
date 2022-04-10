import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.
		
		예를 들어
		2 6 18 54 162 486 ... 은
		2부터 시작해 이전에 만든 수에 3을 곱해 다음 수를 만든 수열이다.
		
		이러한 것을 수학에서는 앞뒤 수들의 비율이 같다고 하여
		등비(비율이 같다의 한문 말) 수열이라고 한다.
		
		
		등비 수열을 알게된 영일이는 갑자기 궁금해졌다.
		
		"그럼.... 13번째 나오는 수는 뭘까?"
		
		영일이는 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.
		
		
		시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
		n번째 수를 출력하는 프로그램을 만들어보자.
		 */

		// 등비 : 3(3x1) 9(3x3) 27(3x9) 81

		Scanner scan = new Scanner(System.in);
		System.out.println("시작값을 입력하세요 ");
		int a = scan.nextInt();

		System.out.println("등비를 입력하세요");
		int r = scan.nextInt();

		System.out.println("몇번째 정수를 나타낼것인지 입력하세요");
		int n = scan.nextInt();
		int result = 1;
		int start = a * r;
		int k = 1;

		System.out.print(a + " "); // 첫번째 항 출력

		for (int i = 1; i < n; i++) { // 2번째 항부터 마지막항까지 출력
			result = start * k;
			k = (int) Math.pow(r, i);
			System.out.print(result + " ");
		}

	}

}
