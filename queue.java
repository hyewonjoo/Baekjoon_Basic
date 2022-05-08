import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class chapter11_queue {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // 최근 명령어 5개를 보여줌

	public static void main(String[] args) {

		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		while (true) {
			System.out.print(">>");
			try {
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine().trim();

				if ("".equals(input))
					continue;

				if (input.equalsIgnoreCase("q")) {
					// 프로그램 종료
					System.exit(0);
				} else if (input.equals("help")) {
					// 도움말 출력
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q -프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 보여줍니다.");
				} else if (input.equals("history")) {
					save(input); // 큐에 input저장

					// 형변환
					LinkedList list = (LinkedList) q; // 큐(부모,인터페이스)를 -> linkedlist(자식,상속받은 클래스)으로


					for (int i = 0; i < list.size(); i++) {
						// 큐는 하나하나 요소를 꺼내 볼 수 없으므로
						// 리스트로 바꿔서 get함수 사용하여 for문돌려서
						// 하나씩 출력해줌
						System.out.println((i + 1) + "." + list.get(i));
					}

				} else {
					save(input);
					System.out.println(input);
				}

			} catch (Exception e) {
				System.out.println("입력 오류입니다.");
			}
		} // while
	}// main();

	// 큐에 input저장해주고 맥스사이즈 넘으면 삭제해줌(선입선출)
	public static void save(String input) {
		if (input != null && !input.equals(""))
			q.offer(input);// 큐에 인풋을 저장

		if (q.size() > MAX_SIZE)
			// 큐의 최대 크기를 넘으면 처음 입력된 것을 삭제한다.
			q.remove(); // 선입선출!!!!!

	}

}
