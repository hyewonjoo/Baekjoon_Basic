import java.util.HashMap;
import java.util.Scanner;

/*
 * 첫 줄에 첫번째 문자열 a가 입력되고, 두번재줄에 b문자열이 입력된다.
 * s문자열의 길이는 10,000자를 넘기지 않고 b문자열은 a문자열보다 길이가 같거나 작다.
 * 
 * a단어에 b문자열과 아나그램이 되는 부분문자열의 개수를 출력하시오
 */
public class Q57 {

	public static int solution(String a, String b) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();

		for (char x : b.toCharArray())
			bm.put(x, bm.getOrDefault(x, 0) + 1); // bm세팅

		int L = b.length() - 1;
		for (int i = 0; i < L; i++) {
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		}

		int lt = 0;
		for (int rt = L; rt < a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1); // 1.am(해쉬)에 rt값을 넣어줌
			if (am.equals(bm))
				answer++; // 2. 두개가 같다면 answer에 1을 더해줌

			am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1); // 3.lt값을 하나 뺴줌
			if (am.get(a.charAt(lt)) == 0)
				am.remove(a.charAt(lt)); // 3-1. 그 값이0 이라면 am에서 아예 제거시켜줌

			lt++; // 4. lt를 한칸 앞으로 당겨줌

		}
		return answer;
	}



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a 단어를 입력하세요");
		String a = scan.next();

		System.out.println("b단어를 입력하세요");
		String b = scan.next();

		System.out.println(solution(a, b));

	}

}
