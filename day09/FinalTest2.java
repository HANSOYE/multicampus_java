package day09;
class SuperDemo{
	
	void sub() {
		System.out.println("SuperDemo's sub()");
	}
	final void bar() {
		System.out.println("SuperDemo's bar()");
	}
	
}//SuperDemo//////

class SubDemo extends SuperDemo{
	//sub() 오버라이딩(= 재정의) 하기
	@Override
	void sub() {
		System.out.println("서브()");
	}
	
	//final + method : 오버라이딩을 할 수 없다.
	//bar() 오버라이딩은 안 된다. final이 붙어 있어 상속받을 수 없기 때문이다.
//	@Override
//	final void bar() {
//		
//	}
	
}//SubDemo//////////

public class FinalTest2 {

	public static void main(String[] args) {
		//SuperDemo의
		//sub(), bar() 호출해보기
		SuperDemo sd = new SuperDemo();
		sd.sub();
		sd.bar();		
		
		//SubDemo의 sub()호출해보기		
		SubDemo sbd = new SubDemo();
		sbd.sub();
		
		//bar()는 final 때문에 오버라이딩은 못하지만
		//호출은 가능하다.
		sbd.bar();
	}//main////

}//FinalTest2//////////
