import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 알파벳 대소문자로 된 단어가 주어지면, 
		 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
		 * 단, 대문자와 소문자를 구분하지 않는다.
		 * 
		 * 
		 * 참고
		 * toUppercase() : 문자열을 모두 대문자로 변환해준다
		 * toLowercase() : 문자열을 모두 소문자로 변환해준다.
		 * 
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("영어 단어를 입력하세요");
		String word = scan.next().toUpperCase(); // 대문자로 전부 변환
		int[] list = new int[26];

		int index = 0;



		for (int i = 0; i < word.length(); i++) {
			int num = word.charAt(i) - 'A'; // A=1,B=2
			list[num]++; // A가 들어오면 num[0]이 1 증가 C가 들어오면 num[2]가 1 증가
		}

		int max = 0;


		/*
		 * for을 하나씩돌면서 하나하나의 요소들이 if문 혹은 else if문에 들어간다고 생각해야됨
		 */
		for (int i = 0; i < list.length; i++) {
			if (max < list[i]) {
				max = list[i]; // max에다가 list[i]의 가장 큰 값을 계속 넣어줌
				index = i;

			} else if (max == list[i]) { // 두개의 알파벳이 max값과 같다면 물음표 출력
				index = -1;
			}
		} // for문



		// int num2 = 0;
		// System.out.println((char) (num2 + 65));
		// int num3 = 1;
		// System.out.println((char) (num3 + 65));

		if (index == -1) { // 만약 index가 -1이라면 물음표
			System.out.println("?");
		} else {// 아니면 인덱스를 대문자 알파벳으로 바꿔서 출력

			System.out.println((char) (index + 65));
		}
	}



}
