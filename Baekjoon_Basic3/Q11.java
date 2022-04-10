import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 온라인 채점시스템에는 초등학생, 중고등학생, 대학생, 대학원생,
		일반인, 군인, 프로그래머, 탑코더 등 아주 많은 사람들이 들어와 문제를 풀고 있는데,
		
		실시간 채점 정보는 메뉴의 채점기록(Judge Status)을 통해 살펴볼 수 있다.
		
		자! 여기서...잠깐..
		같은 날 동시에 가입한 3명의 사람들이 온라인 채점시스템에 들어와 문제를 푸는 날짜가
		매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?
		
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("3명이 가입 한 날을  차례로 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int i = 1;
		int min = 0; // 최소공배수

		int inputNum1;
		int inputNum2;
		int inputNum3;

		// 먼저 num1 num2 num3의 최대 공약수를 찾아야한다.


		while (true) {
			i++;
			if (num1 % i == 0 || num2 % i == 0 || num3 % i == 0) {
				if (i == num1 || i == num2 || i == num3) {
					// System.out.println("최대 공약수는" + i + "이다.");
					break;
				}
			}
		} // while문 종료



		// 최소공배수 구하기
		if (num1 % i == 0) {
			inputNum1 = num1 / i;
		} else {
			inputNum1 = num1;
		}

		if (num2 % i == 0) {
			inputNum2 = num2 / i;
		} else {
			inputNum2 = num2;
		}

		if (num3 % i == 0) {
			inputNum3 = num3 / i;
		} else {
			inputNum3 = num3;
		}

		min = i * inputNum1 * inputNum2 * inputNum3;

		System.out.println("3명이 다시 모두 함께 방문해 풀어보는 날은" + min + "이다.");


	}

}
