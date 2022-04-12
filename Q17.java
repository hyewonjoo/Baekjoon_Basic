import java.util.Random;
import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
		 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		 */


		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		System.out.println("x를 입력하세요 ");
		int max = scan.nextInt();
		int random;

		for (int i = 1; i <= num; i++) {
			random = rnd.nextInt(num + 1);// 1~num까지 랜덤으로 수 생성
			if (random < max) {
				System.out.print(random + " ");
			}


		}



	}

}
