import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 공주구하기
 * -> 큐를 사용하여 문제풀기
 */
public class Q62 {

	public static Integer solution(int n, int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= n; i++)
			q.offer(i); // 왕자 한명한명을 큐에 입력시켜준다.
		while (!q.isEmpty()) {
			for (int i = 1; i < k; i++)
				q.offer(q.poll());// k번째 전까지의 숫자를 다시 처음으로 offer해준다.
			q.poll();
			if (q.size() == 1)
				answer = q.poll();

		} // while문 끝!


		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("왕자의 수를 입력하세요");
		int n = scan.nextInt();

		System.out.println("특정 번호를 입력하세요");
		int k = scan.nextInt();

		System.out.println(solution(n, k));


	}
}
