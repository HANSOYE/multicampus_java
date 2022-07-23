package day11;
import java.util.*;

public class HashSetTest2 {

	public static void main(String[] args) {
		//Member 객체 3개 생성해서 HashSet에 저장하세요
		Member m1 = new Member("홍길동", 22);
		Member m2 = new Member("김원빈", 23);
		Member m3 = new Member("이선미", 24);
		Member m4 = new Member("홍길동", 22);
		Member m5 = new Member("홍길동", 33);
		
		Set<Member> set = new HashSet<>();
		
		set.add(m1);
		set.add(m2);
		set.add(m3);
		//데이터가 중복으로 저장되어도 따로 출력된다
		//하지만 Member에서 Override를 하면 출력이 되지 않는다.
		set.add(m4);
		//이름이 같아도 나이가 다르면 출력이 된다.
		set.add(m5);
		System.out.println("set.size(): "+set.size());
		
		//iterator()메서드로 저장된 회원들의 정보를 출력하세요
		Iterator<Member> it = set.iterator();
		for(int i=1; it.hasNext(); i++) {
			Member user = it.next();
			System.out.println(i+": "+user.name+", "+user.age+"세");
		}
		
		System.out.println("m1.hashCode(): "+m1.hashCode());
		System.out.println("m4.hashCode(): "+m4.hashCode());
		System.out.println("m5.hashCode(): "+m5.hashCode());
		System.out.println("m2.hashCode(): "+m2.hashCode());
		System.out.println("m3.hashCode(): "+m3.hashCode());
	}

}
