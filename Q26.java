import java.util.Scanner;

public class Q26 {
	/*
	 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
	 * 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
	 * 
	 * 알파벳 대문자나 숫자 0~9를 입력하였을 떄 상응하는 아스키 코드를 출력하는 프로그램
	 * 
	 * 아스키코드는 정수로 이루어져있음
	 * 0~31 제어 문자
	 * 32~47 특수문자
	 * 48~57 아라비아 숫자(0~9)
	 * 55~64 특수문자
	 * 65~90 영어대문자
	 * 91~96 특수문자
	 * 97~122 영어 소문자 (a,b,c)
	 * 123~126 특수문자
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" 아스키 코드로 변환할 숫자 혹은 알파벳을 입력하세요");

		String word = scan.nextLine();
		char result = word.charAt(0);
		// charAt(0)에서 입력 받은 문자가 하나이기 떄문에 word에서 0번째 문자를 char로 변환해주고 그걸
		// int로 넣어주면 ->아스키 코드는 정수로 이루어져 있으므로 String값으로 받은 변수를 int타입으로
		// 변환 하면 아스키 코드 값으로 저장된다.

		System.out.println("변환 전 :" + word);
		System.out.println("변환 후 :" + result);

	}

}
