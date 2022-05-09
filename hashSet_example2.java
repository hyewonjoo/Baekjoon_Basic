import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class chapter11_hashSet2 {

	public static void main(String[] args) {

		HashSet set = new HashSet();

		// set크기가 6보다 작은 동안 1~45 크기의 난수를 생성
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}

		System.out.println(set);

		// set -> 순서 x,중복x
		// set은 정렬 할수 없음

		LinkedList list = new LinkedList(set); // 1.set의 모든 요소들을 linekdlist에 넣어줌
		Collections.sort(list);// 2.정렬
		System.out.println(list);


	}

}
