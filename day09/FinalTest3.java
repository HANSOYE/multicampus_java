package day09;
//final + 변수 : 값 할당을 할 수 없게 함
//				public static final을 함께 사용한다.

class MyFinal{
	final public static int NONE=1; //상수
						int x = 2;
}
public class FinalTest3 {

	public static void main(String[] args) {
		//MyFinal의 x, NONE 변수값을 출력하세요
		System.out.println(MyFinal.NONE);//static이 붙으면 클래스 이름을 앞에 적어준다
		
		MyFinal my = new MyFinal();
		System.out.println(my.x);//static 안 붙었으면 변수 할당하고 불러와야한다.
		
		my.x = 20;
		System.out.println(my.x);
		
//		final 변수는 값을 변경할 수 없어서 밑의 코드는 에러 뜬다.
//		MyFinal.NONE = 10;
		
	}

}///////////////////////////////////
