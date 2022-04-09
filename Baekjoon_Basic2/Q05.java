
public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3 6 9 게임을 하던 영일이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
		 * 3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자. ~100까지
		 */

		for (int i = 1; i < 100; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print("짝");
			}
			if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				System.out.print("짝");
			}

			else if (i % 10 != 3 && i % 10 != 6 && i % 10 != 9 && i / 10 != 3 && i / 10 != 6
					&& i / 10 != 9) {
				System.out.print(" " + i + " ");
			}
			System.out.print(" ");
		}



	}


}
