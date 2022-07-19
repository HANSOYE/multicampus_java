package day07;

public class MyTest {

	public static void main(String[] args) {
		//MyDemo 클래스의 변수 x, y 값을 출력하세요
		
		MyDemo md = new MyDemo();
		System.out.println("md.x: "+md.x);
		System.out.println("md.y: "+md.y);
		System.out.println("MyDemo.y: "+MyDemo.y);
		
		//MyDemo의 foo(), bar() 메소드 호출하기
		MyDemo.foo(); //static이기 때문
		md.bar();
		
		//MyDemo의 star(), snail() 메소드 호출해서 결과 출력하기
		String st = md.star(3);
		System.out.println(st);
		String sn = MyDemo.snail();
		System.out.println(sn);
		
		
	}

}
