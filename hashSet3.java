import java.util.HashSet;

public class chapter11_hashSet3 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		// Person person = new Person(null, 0);

		set.add("abc");
		set.add("abc");

		// 둘이 중복된 값으로 취급하려면 -> 즉 hashset이 바르게 돌아 가려면, person에 equals(), hashcode()를 오버러이딩 해야함
		set.add(new Person("David", 10)); // person객체 집어넣음
		set.add(new Person("David", 10)); // person객체 집어 넣음

		System.out.println(set);

	}



}


class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int hashCode() {
		// 원래 > 자신의 메모리 주소값을 반환
		// p1 > "홍길동",20 >"홍길동20":100 (하나의 문자열로 더하기) => String의 메모리 주소는 문자열이 같으면 메모리 주소도 같게나오기 때문
		// p2 > "아무개", 25 >"아무개25":200
		// p3 > "홍길동", 20 >"홍길동20":100
		return (this.name + this.age).hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// obj가 person객체인지 확인
		if (!(obj instanceof Person))
			return false;

		// obj가 person객체 라면?
		Person p = (Person) obj;

		// 나 자신의 이름과 나이를 p와 비교
		return this.name.equals(p.name) && this.age == p.age;
	}

}
