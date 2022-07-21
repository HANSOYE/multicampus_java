package day09;
//interface, 추상 클래스 다 만들어보자
interface Inter1{
	void a();
	
}//Inter1////////////

interface Inter2{
	String b();
}//Inter2//////////////

abstract class AbsClass{
	abstract void c(); //추상 클래스는 abstract가 자동으로 붙지 않기 때문에 변수 지정할 때도, 클래스에도 abstract 붙여줘야함
}//AbsClass//////////
//인터페이스가 인터페이스를 상속받을 때는 extends로 상속받고, 다중 상속도 가능하다.
interface HisInter extends Inter1, Inter2{
	String STR = "hello";
	
}//HisInter/////////

//[1] MyClass2가 AbsClass와 HisInter를 상속받도록 하세요 에러 없게 처리하세요


public class MyClass2 extends AbsClass implements HisInter{
	@Override
	public void c() {
		System.out.println("c()@@@");
	}
	@Override
	public void a() {
		System.out.println("a()@@@");
	}
	@Override
	public String b() {
		return "b()$$$$";
	}

	public static void main(String[] args) {
		//[2] MyClass2타입의 객체 생성해서 메서드 각각 호출하고 STR값도 출력해보기
		MyClass2 mc  = new MyClass2();
		mc.c();
		mc.a();
		System.out.println("=============");
		
		
		//[3] HisInter 타입의 변수 선언하고 MyClass2 객체 생성해서 메서드 각각 호출하고 STR 값도 출력하기
		HisInter hi = new MyClass2();
		hi.a();
		String his = hi.b();
		System.out.println(his);
		System.out.println(HisInter.STR);
		System.out.println(MyClass2.STR);
		System.out.println("=============");
		//[4] AbsClass 타입의 변수 선언하고 MyClass2 객체 생성해서 메서드 각각 호출하고 STR 값도 출력하기
		AbsClass ac = new MyClass2();
		ac.c();
	}

}
