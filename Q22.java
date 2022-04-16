import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub*

		/*
		 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
		 *  예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
		
		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
		그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("자연수 열개를 입력하세요");

		int count = 0;
		boolean b1;
		int[] list = new int[10];

		for (int i = 0; i <= 9; i++) {
			int num = scan.nextInt();
			list[i] = (num % 42);
		}

		// 하나하나 비교
		for (int i = 0; i < list.length; i++) {
			b1 = false;
			for (int j = i + 1; j < list.length; j++) {// 같은것만 비교해주는 이중 for문
				if (list[i] == list[j]) {
					b1 = true;
					break;
				}

			} // for문 닫기********

			if (b1 == false) {
				count++;
			}
		} // for문 빠져나옴



		System.out.println(count);

	}

}
