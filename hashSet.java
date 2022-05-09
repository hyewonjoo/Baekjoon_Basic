import java.util.HashSet;
import java.util.Iterator;


public class chapter11_hashSet {

	public static void main(String[] args) {
		// 객체 배열 생성
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "4", "4"};
		HashSet set = new HashSet(); // 해쉬셋 생성
		// HashSet<Person> set = new HashSet<Person>() 제네릭 함수를 썼을 때와 형태 비교
		// Queue q = new LinkedList();
		// Stack st = new Stack();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); // 해쉬셋에 배열의 요소 하나씩 넣어줌
		}

		System.out.println(set); // [1, 1, 2, 3, 4]

		// 해쉬셋에 저장된 요소들을 하나씩 출력해줌(iterator를 이용)

		Iterator it = set.iterator(); // 아까만든 set의 iterator를 it에 넣어줌

		while (it.hasNext()) {
			System.out.println(it.next());
			/*1
			1
			2
			3
			4
			*/

		}



	}

}
