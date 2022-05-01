import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
		
		이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
		
		n=17일때 까지 피보나치 수를 써보면 다음과 같다.
		
		1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
		
		n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
		
		입력 : 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
		출력 : 첫째 줄에 n번째 피보나치 수를 출력한다.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int number = scan.nextInt();

		System.out.println(fibo(number));

	}

	public static int fibo(int number) {
		int sum = 0;
		if (number == 0) { // 이 부분 설정할때 주의 1

			return 0;
		} else if (number == 1) {// 이 부분 설정할때 주의 2

			return 1;

		} else {
			sum = fibo(number - 1) + fibo(number - 2);

			return sum; // 이부분이 다시 반환되게 됨
						//예를들어 sum이 3였다면(fibo(4)) fibo(3)+fibo(2)가 되고, fibo(2)는 fibo(1) + fibo(0)이므로 1이고
						//fibo(3)은 fibo(2) +fibo(1)이 되는데, 이때 fibo(2)가 1이고 fib0(1)도 1이기때문에  2+1은 3이다.
			
						//하나만 더 봐볼까?
						// 5 fibo(5)는 fibo(4) + fibo(3)인데 앞서 fibo(4)은sum에 3의 값이 반환된다
						// fibo(3) = fibo(2) + fibo(1)이기에 sum의 값에 2가 반환된다.
						//그렇다면 fibo(5)는 5가 되게 된다.
		}
	}

}
