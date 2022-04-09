import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 빨강(red), 초록(green), 파랑(blue) 빛을 섞어
		여러 가지 빛의 색을 만들어 내려고 한다.
		
		빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
		(빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)
		
		주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과
		총 가짓 수를 계산해보자.
		
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("빛의 갯수를 입력하세요");
		int count = 0;
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		int input3 = scan.nextInt();

		for (int i = 0; i < input1; i++) {
			for (int j = 0; j < input2; j++) {
				for (int z = 0; z < input3; z++) {
					System.out.println("경우의수는 " + i + " " + j + " " + z + "입니다.");
					count++;
				}
			}
		}

		System.out.println("경우의 수의 갯수는" + count);

	}

}
