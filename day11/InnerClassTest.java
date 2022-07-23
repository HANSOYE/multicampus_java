package day11;

public class InnerClassTest {

	public static void main(String[] args) {
		//1) Outer클래스의 a,b변수값을 출력하세요
		System.out.println(Outer.b);
		Outer o = new Outer();
		System.out.println(o.a);
		System.out.println(o.b);
		
		//2) Inner클래스의 c변수값 출력하고
//			sub()메소드 호출하기
		Outer o2 = new Outer();
		Outer.Inner oin = o2.new Inner();
		// 위의 두 줄을 아래 한 줄로 요약 가능
		Outer.Inner oin2 = new Outer().new Inner();
		
		System.out.println("oin.c : "+oin.c);
		oin.sub();

		
		//3) SInner클래스의 d, e 출력
//			foo(), bar()호출하기
		Outer.SInner osin = new Outer.SInner();
		System.out.println("osin.d : "+osin.d);
		System.out.println("Outer.SInner.e : "+Outer.SInner.e);
		osin.foo();
		Outer.SInner.bar();

		

	}

}
