import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 좌표정렬
 * n개의 좌표를 정렬하여 출력하세요.
 * comparable인터페이스를 사용하여서 기준점을 정하여 정렬하자
 */
class Point implements Comparable<Point> {
	public int x, y;

	Point(int x, int y) {// 매개변수가 있는 생성자 =초기화
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	@Override
	public int compareTo(Point o) {
		if (this.x == o.x)
			return this.y - o.y; // 음수가 나와야 오른쪽으로 오름차순정렬이됨(this.o가 작은수, o.y가큰수)
		else
			return this.x - o.x;
	}
}


public class Q70 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요");
		int n = scan.nextInt();

		System.out.println("배열에 넣을 좌표값을 입력하세요");
		ArrayList<Point> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			arr.add(new Point(x, y)); // arr에 point객체를 생성하여 추가해줌.
		} // for문이 끝나면 arr에 좌표가 다 차게됨

		// 좌표 정렬 -> 기준: 위에 point객체에서 만든(interface comparable)compareTo함수를 기준으로
		Collections.sort(arr);
		for (Point p : arr) {// 주의
			System.out.println(p.getX() + " " + p.getY());
		}

	}

}
