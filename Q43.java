import java.util.Scanner;

/*
 * DFS를 활용한 경로탐색 문제!
 * 
 */

public class Q54 {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;

	static void DFS(int v) {
		if (v == n)
			answer++; // 종착지에 도착 -> answer 에 플러스 1 해줌

		else {// 뻗어가기
			for (int i = 0; i <= n; i++) {
				if (graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);


					ch[i] = 0;
				}
			} // if
		} // for

	}// DFS


	public static void main(String[] args) {
		Q54 T = new Q54();
		Scanner scan = new Scanner(System.in);
		System.out.println("노드갯수를 입력하세요");
		n = scan.nextInt(); // 노드의 갯수

		System.out.println("간선갯수를 입력하세요");
		m = scan.nextInt(); // 간선의 갯수
		graph = new int[n + 1][n + 1];
		ch = new int[n + 1]; // 방문 했는지 안했는지 체크 -> 노드의 갯수만큼 있어야함

		System.out.println("그래프를 입력하세요");
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}

}
