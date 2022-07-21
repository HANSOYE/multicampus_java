package day09;

class Super{
	void foo() {
		System.out.println("Super's foo()");
	}
	
}//Super/////////

//final + class : 다른 클래스에서 상속받지 못하도록 final 붙여줌
final class Sub extends Super{
	
	@Override
	protected void foo() { 
//		Super의 foo는 생략형이기 때문에 생략형보다 넓은 protected를 사용할 수 있다. 
//		그냥 생략형도 사용가능.'
		System.out.println("Sub's foo()");
		
	}
}//Sub//////////

//final인 sub를 상속받지 못해서 바로 밑의 코드 사용 불가능
//ex) java.lang.String 클래스 는 final 클래스이기 때문에 다른 데서 상속받아 쓸 수 없다.
//public class FinalTest1 extends Sub
public class FinalTest1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//main

}//FinalTest1
