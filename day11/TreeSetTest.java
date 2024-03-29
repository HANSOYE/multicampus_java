package day11;
import java.util.*;
/*
 * TreeSet
 * - 추가된 데이터들이 정렬된다.
 * - 데이터 중복은 허용하지 않는다.
 * - 내부적으로 이진 트리를 사용해 데이터를 저장하고 꺼낸다.
 */

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("홍길동");
		tree.add("강감찬");
		tree.add("김철수");
		tree.add("이순신");
		tree.add("정약용");
		tree.add("정약용");
		
		System.out.println("tree.size(): "+tree.size());
		
		//확장 for문으로 출력하기
		//가나다 순으로 정렬되어 나온다.
		//중복데이터인 정약용은 한번만 출력된다.
		for(String tr: tree) {
			System.out.println(tr);
		}
	}

}
