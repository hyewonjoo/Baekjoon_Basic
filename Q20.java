import java.util.Arrays;
import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] list = new int[9];
		int[] list2 = new int[9];



		for (int i = 0; i < 9; i++) {
			System.out.println("100보다 작은 자연수 9개를 입력하세요");
			int input = scan.nextInt();
			list[i] = input;
			list2[i] = list[i]; // list[i]를 list2[i]에 복사해주기

		}



		// 최대값 구하기
		Arrays.sort(list);
		int max = list[list.length - 1];
		System.out.println(max); // 최대값 출력



		// 그 최대값이 원래 배열에서 몇번째 인덱스 인지 출력
		for (int i = 0; i < list2.length - 1; i++) {
			if (list2[i] == max) {
				System.out.println(i + 1);
			}
		}
	}

}
