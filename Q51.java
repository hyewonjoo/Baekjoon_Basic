import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 응급실
 * 큐를 활용한 문제 (큐에다가 person객체를 집어 넣고 foreach문을 활용하여 우선순위가 높은것을 찾는게 포인트
 * 
 * 입력: 첫줄에 자연수n,m이 주어진다. 두번째 줄에는 접수한 순서대로 환자의 위험도가 주어진다.-> 위험도가 높을수록 더 위험하다는 뜻으로 먼저 진료본다.
 * 출력 : m번째 환자가 몇번째로 진료받는지 출력하여라
 */
public class Q63 {

	public static int solution(int n, int m, int[] arr) {
		int answer = 0;

		Queue<Person> Q = new LinkedList<>(); // person객체를 담은 큐를 생성

		for (int i = 0; i < n; i++) {
			Q.add(new Person(i, arr[i])); // Q에 person객체를 넣어준다.
		}
		while (!Q.isEmpty()) {// 큐가 비어있지 않았다면 큐를 poll한 값을 temp에 넣어준다.
			Person temp = Q.poll();
			for (Person x : Q) {
				if (x.priority > temp.priority) {
					Q.offer(temp);
					temp = null;
					break; // 자기보다 높은 환자 발견하면 바로 브레이크

				}
			} // for

			if (!(temp == null)) {// temp보다 우선순위가 높은사람이 한명도 없는경우->진료볼수있음
				answer++;
				if (temp.id == m)
					return answer;

			}

		} // while


		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("환자 수를 입력하세요");
		int n = scan.nextInt();// 환자 수

		System.out.println("몇번째 환자의 진료순서를 확인할것인가요?");
		int m = scan.nextInt(); // 몇번째로 진료받는지

		int[] arr = new int[n];
		System.out.println("위험도를 입력하세요(배열)");
		for (int i = 0; i < n; i++) { // 위험도를 담은 배열
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(n, m, arr));
	}

}// Q63


class Person {// person객체 생성
	int id;
	int priority;


	// 매개변수가 있는 생성자 (초기화)
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}



}
