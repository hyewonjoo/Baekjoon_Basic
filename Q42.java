import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q53 {

	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();

	public int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1; // 출발지점
		Q.add(s); // 1. 루트를 큐에 넣어줌
		int L = 0;

		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {// 레벨에있는 원소들을 하나씩 출력
				int x = Q.poll(); // 2.꺼낸 노드를 x에 넣어줌

				if (x == e)
					return L;

				for (int j = 0; j < 3; j++) {// 3. 큐에서 노드를 꺼냄과 동시에 자식노드를 생성
					int nx = x + dis[j]; // 자식노드
					if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.add(nx); // 3-1 총3번을 돌면서 생성된 자식노드들을 전부 Q에 넣어줌
					}

				} // for2
			} // for1

			L++; // 주의!! ->while문을 빠져나갈때는 if(x==e)일때 빠져나감

		} // while



		return 1;
	}// BFS



	public static void main(String[] args) {
		Q53 T = new Q53();
		Scanner scan = new Scanner(System.in);
		System.out.println("현재위치입력하시오");
		int s = scan.nextInt();

		System.out.println("가고싶은 위치를 입력하시오");
		int e = scan.nextInt();

		System.out.println(T.BFS(s, e));
	}// main

}// Q53

