/*
 * 피보나치 -재귀
 */
public class Q71 {
	public static int DFS(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else
			return DFS(n - 2) + DFS(n - 1);

	}

	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i < n; i++) /*주의!!! 무조건 1부터!!!*/
			System.out.print(DFS(i) + " ");

	}

}
