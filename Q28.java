import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
		 * 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
		 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("소문자 단어를 입력하세요");
		String word = scan.nextLine();
		int count = 0;



		for (char i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) == i) {
					count++;

					if (count >= 2) {// 중복되었을 때
						System.out.println(" " + -1);
						break; // 바로 빠져나가도록
					}

					System.out.print(" " + j);

				}
			} // for문 닫기

			if (count == 0) {
				System.out.print(" " + -1);
			}
			count = 0; // 다시 처음으로 초기화
		}



	} // for문
}

