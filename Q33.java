import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 부녀회장이 될테야!!
		 * 평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.
		
		이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다”
		
		 는 계약 조항을 꼭 지키고 들어와야 한다.
		
		아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 
		
		주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라. 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
		 
		 *입력 : 첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다
		 *제한 : 1 <= k <= 14, 1 <= n <= 14
		 */


		int[][] APT = new int[15][15];
		String result = "";


		// 1.아파트 배열의 기본세팅을 해줌
		for (int i = 0; i < 15; i++) {

			// 앞에 배열은 층을 뒤에 배열은 호를 나타냄
			APT[i][1] = 1; // 1호들
			APT[0][i] = i; // 0층
		}


		// 2.아파트의 배열을 전부 채움
		for (int i = 1; i < 15; i++) {// 1층 부터 14층 까지
			for (int j = 2; j < 15; j++) {// 2호 부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}


		// 3. 이제 사용자가 입력한 층수와 호수에 맞춰서 결과 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("테스트 케이스 횟수를 입력하세요");
		int test = scan.nextInt();

		for (int i = 0; i < test; i++) {
			System.out.println("층 수를 입력하세요");
			int row = scan.nextInt();
			System.out.println("호 수를 입력하세요");
			int coloum = scan.nextInt();

			result += APT[row][coloum] + "\n";
		}

		System.out.println(result);


	}

}
