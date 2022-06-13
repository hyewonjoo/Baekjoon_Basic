import java.util.ArrayList;
import java.util.Scanner;

/*
 * 경로탐색(인접리스트)
 * 
 * 방향그래프가 주어지면 1번 정점에서 n번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하시오.
 * 
 */
public class Q72 {
	static int answer = 0;
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;

	public static void DFS(int v) {
		if (v == n)
			answer++; // 정점까지 도착했을 경우 answer하나씩 카운트 -> 모든 경로의 수 구함
		else {
			for (int nv : graph.get(v)) {
				if (ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);

					ch[nv] = 0;
				}
			}
		}

	}

	public static void main(String[] args) {
		Q72 T = new Q72();
		Scanner scan = new Scanner(System.in);
		System.out.println("정점의 개수를 입력하세요");
		n = scan.nextInt();

		System.out.println("간선의 갯수를 입력하세요");
		m = scan.nextInt();

		graph = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n + 1];

		System.out.println("그래프 입력하세요");
		for (int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);



	}

}// Q72
