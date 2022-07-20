package day08;
/*
 * 상속성: Inheritance
 * 부모 클래스
 * 
 * 자식 클래스 extends 부모 클래스
 * => 부모 클래스가 가진 멤버변수, 메소드를 자식 클래스에서 그대로 물려받아 쓸 수 있다.(상속성)
 * "is a"관계가 성립해야한다
 * - 자바는 1개의 클래스만 상속받을 수 있다.(단일 상속)
 *   c++(다중 상속 가능)
 */
public class Inheritance {

	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 177);
		
		//h1의 정보 출력하기
		System.out.println(h1.getInfo());
		
		//슈퍼맨 객체 생성해서, 이름, 키, 초능력 값을 할당하고
		//정보 출력하기 => 눈에 안 보여도 getInfo()가 있음
		Superman sp = new Superman();
		sp.name = "슈퍼마켓";
		sp.height = 256;
		sp.power = 1000;
		String spgi = sp.getInfo();
		System.out.println(spgi);
		
		
		
		//아쿠아맨 객체 생성해서, 이름, 키, 초능력 값 할당하고 정보 출력하기 =>getInfo()
		Aquaman aq = new Aquaman();
		aq.name = "아쿠아리움";
		aq.height = 190;
		aq.speed = 1500;
		String aqgi = aq.getInfo();
		System.out.println(aqgi);
		
		//슈퍼맨 객체 1개 더 생성해서 이름, 키, 초능력 주고
		//제목을 가진 슈퍼맨 정보 출력하기
		Superman sp1 = new Superman();
		sp1.name = "슈퍼로켓";
		sp1.height = 128;
		sp1.power = 500;
		System.out.println(sp1.getInfo("날아라로켓"));
		
		
		//제목을 가진 슈퍼맨 정보 출력하기=> 초능력을 100충전해서 출력하기

		sp1.getInfo("날아라로켓", -100);
	}

}
