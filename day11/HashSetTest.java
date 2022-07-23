package day11;
import java.util.*;
/*
 * Set 계열
 * 	- 순서를 기억하지 않음
 * 	- 데이터 중복을 허용하지 않는다
 * 	- 구현 클래스: HashSet, TreeSet...
 * 	- 해시셋은 객체를 저장하기 전에 객체의 hashCOde()를 호출해서
 * 		해시코드를 얻어낸다. 그리고 이미 저장되너 있는 객체들의 해시코드와 비교한다.
 * 		만약 동일한 해시코드가 있다면, 다시 equals() 메서드로 두 객체를 비교해서 
 * 		true가 나오면 동일한 객체로 판단하고 중복저장을 하지 않는다.
 */
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		//데이터 저장
		//add(E)
		set.add("Java");
		set.add("HTML");
		set.add("CSS");
		set.add("Python");
		set.add("MySQL");
		//중복을 허락하지 않음. 중복데이터가 있을 시 하나의 데이터라고만 인식한다.
		set.add("Java");
		System.out.println("set.size(): "+set.size());
		
		//데이터 꺼내기
		//Iterator<E> iterator()
		//순서를 기억하지 않는다.
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String val = it.next();
			System.out.println(val);
		}
		
		//삭제 하고 싶을 떄
		set.remove("CSS");
		System.out.println("set.size(): "+set.size());
		
		//CSS 없어진 거 확인
		for(String str:set) {
			System.out.println(str);
		}
		
		//clear(), removeAll()
		set.clear();
		System.out.println("set.size(): "+set.size());
	}

}
