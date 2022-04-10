import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
		3의 배수인 경우는 출력하지 않도록 만들어보자.
		
		예를 들면,
		1 2 4 5 7 8 10 11 13 14 ...
		와 같이 출력하는 것이다.
		 */



		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input = scan.nextInt();

		for (int i = 0; i <= input; i++) {
			if (i % 3 != 0) {
				System.out.print(i + " ");
			}
		}


	}


}
