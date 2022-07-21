package day09;
//MyInter를 상속받아서 에러나지 않게 처리해보자
//interface는 implements로 상속받는다

//YourInter도 상속받아 에러나지 않게 처리해보자

public class Myclass implements MyInter, YourInter{//인터페이스는 다중상속이 가능하다.
	//MyInter의 demo()가 그냥 void demo()라고 
	//접근지정자를 앞에 아무것도 안 붙이면 안 된다.
	//interface의 경우 public이 자동으로 붙기 때문에
	//오버라이딩할 때 public을 붙여줘야한다.
	
	@Override
	public void demo() {
		System.out.println("MyClass's demo()####");
	}
	
	@Override
	public int inter1() {
		return 100;
	}
	public void inter2(String s) {
		System.out.println(s.toUpperCase());
	}
	
	public static void main(String[] args) {
		//MyItner mi = new MyInter();
		//interface는 타입 선언은 할 수 있으나
		//위와 같이 new해서 객체 생성은 할 수 없다.
		MyInter mi = new Myclass();
		YourInter yi = new Myclass();
		
		//demo()
		mi.demo();
		
		//inter1()
		int num = yi.inter1();
		System.out.println(num);
		System.out.println(((Myclass)mi).inter1());
		//inter2()
		yi.inter2("hello");
		
		//PI 출력해보기
		System.out.println(YourInter.PI);
		System.out.println(Myclass.PI);
		
		//final 변수는 변경 불가능하다. 그래서 아래 코드는 에러가 난다.
//		Myclass.PI = 5.123;
		
		//아래는 가능하긴 하지만 위와 같이 사용하는 것을 권장한다.
		System.out.println(yi.PI);
	}
}
