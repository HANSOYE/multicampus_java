package day10;
import java.util.*;
import javax.swing.*;
//java.util.List계열
public class VectorTest2 {

	public static void main(String[] args) {
		// [1] Student객체를 3개 생성하기
		Student st1 = new Student(0, "이클");
		Student st2 = new Student(10, "립");
		Student st3 = new Student(20, "스");
		
		
		// [2] Student를 저장할 Vector를 생성하세요
		Vector<Student> vs = new Vector<>();
		
		// [3] 벡터에 학생객체 3개를 저장하세요
		vs.add(st1);
		vs.add(st2);
		vs.add(st3);
						
		// [4] for루프 이용해서 벡터에 저장된 학생의 정보(학번, 이름)를 출력하세요
		for(Student v : vs) {
			System.out.println("학번 : "+v.getId()+", 이름 : "+v.getName());
		}
		
//		public Enumeration<E> elements()
//		public Iterator<E> iterator()
		/*Enumeration<E> elements()
		 * : 벡터에 저장된 객체들을 한꺼번에 꺼내오고자 할 때 사용.
		 * Enumeration과 Iterator인터페이스는 객체들을 집합체로
		 * 관리하도록 해주는 인터페이스이다.
		 * 이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩
		 * 처리할 수 있는 메소드를 제공한다.
		 * # Enumeration의 경우**********************************
		 * 	- boolean hasMoreElements() : 논리적 커서(첫번째 요소 직전에
		 * 				위치) 이후에 요소들이 있는지 물어서 있으면true
		 * 				없으면 false를 반환
		 *  - E nextElement(): 논리적 커서를 다음 요소로 이동하고
		 *  			현재 가리키고 있는 요소를 반환한다.
		 * # Iterator의 경우**************************************
		 * 	- boolean hasNext()
		 *  - E next() 
		 * */
		Enumeration<Student> es = vs.elements();
		
		while(es.hasMoreElements()) {
			Student e = es.nextElement();
			System.out.println(e.getName()+": "+e.getId());
		}System.out.println("*************");
		//커서가 요소의 마지막까지 도달했기 때문에 같은 와일문을 사용해도 커서 뒤의 요소가 없어 false를 반환하기 때문에
		//밑의 코드는 실행되지 않는다.
		while(es.hasMoreElements()) {
			Student e = es.nextElement();
			System.out.println(e.getName()+": "+e.getId());
		}

//		public Iterator<E> iterator()
		//iterator()메서드 이용해서 vs에 저장된 학생들의 이름을 모두 출력하세요.
		Iterator<Student> is = vs.iterator(); 
		while(is.hasNext()) {
			Student i = is.next();
			System.out.println(i.getName()+": "+i.getId());
		}
		//clear(), removeAll(): 모든 요소를 삭제한다.
		vs.clear();
		is = vs.iterator();
		
		System.out.println("모두 삭제후===========");
		for(;is.hasNext();) {
			Student i =is.next();
			System.out.println(i.getName());
		}

	}

}
