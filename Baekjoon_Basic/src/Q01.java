import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
		
		
		참고
		while( ) {...}, do {...} while( );, for(...; ...; ...) {...} 등의 반복문은 형태만 다르
		고, 똑같은 성능을 발휘한다. 필요에 따라 편리한 것으로 골라 사용하면 된다.
		
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100까지 정수를 입력하세요");
		int input = scan.nextInt();
		int sum = 0;

		for (int i = 0; i < input; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		System.out.println("짝수까지의 합은 : " + sum);
	}

}
