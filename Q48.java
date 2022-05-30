import java.util.Scanner;
import java.util.Stack;

/*
 * 크레인 인형뽑기
 * -크레인 인형뽑기 기계를 만들어라
 * -크레인이 같은 인형을 뽑아 바구니에 쌓이게 되면, 같은 모양 인형이 두개 없어지게 하여라
 * -크레인은 moves배열대로 움직인다.
 * 
 * 첫줄에 터뜨려서 사라진 인형의 개수를 출력하여라.
 */
public class Q60 {

	public static Integer solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>(); // int타입의 스택 생성
		for (int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][pos - 1] != 0) {// i는 행을, pos-1은 열을 의미 -> 인형을 만난경우!
					int temp = board[i][pos - 1];
					board[i][pos - 1] = 0; // 인형을 꺼내면 그 자리에 다시 0을 넣어줌
					if (!stack.isEmpty() && temp == stack.peek()) {
						answer = answer + 2;
						stack.pop();
					} else
						stack.push(temp);

					break; // 한 pos에서 인형을 뽑았다면 -> 그다음 pos로 이동해야하기때문에 브레이크를 꼭 해주는걸 잊지말자
				} // if문
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("인형뽑기 사이즈를 입력하세요");
		int n = scan.nextInt(); // 배열의 사이즈

		System.out.println("인형을 채워 넣으세요");
		int[][] board = new int[n][n]; // 인형뽑기 배열을 생성한다.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scan.nextInt();
			}
		} // 인형뽑기 배열 채워넣기, 인형이 없는 자리는 0으로 표시해준다.

		System.out.println("moves배열을 사이즈를 입력하세요");
		int m = scan.nextInt();

		int[] moves = new int[m];

		for (int i = 0; i < m; i++) {
			moves[i] = scan.nextInt();
		}

		System.out.println(solution(board, moves));


	}

}
