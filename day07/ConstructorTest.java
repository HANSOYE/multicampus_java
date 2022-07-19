package day07;

public class ConstructorTest {

	public static void main(String[] args) {
		//Person 객체 1개 생성하고 이름, 나이 출력하기
		
		Person p1 = new Person(); //기본 생성자 호출
		System.out.println("p1.name: "+p1.name);
		System.out.println("p1.age: "+p1.age);
		
		//Person 객체 1개 더 생성하되 인자 생성자를 호출해서 생성한 뒤 이름, 나이 출력하기
		Person p2 = new Person("소",20);

		System.out.println("p2.name: "+p2.name);
		System.out.println("p2.age: "+p2.age);
		
		Person p3 = new Person("소1",201);

		System.out.println("p3.name: "+p3.name);
		System.out.println("p3.age: "+p3.age);
		
		Person p4 = new Person(20,"th");

		System.out.println("p4.name: "+p4.name);
		System.out.println("p4.age: "+p4.age);
		
		

	}

}
