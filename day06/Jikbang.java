package day06;
//부동산 관련 앱
/* 객체: 집, 중개인, 매도자, 매수자, 임대인...
 * 추상화: 현실세계에 존재하는 객체를 프로그램 세계로 표현하는 것
 * 클래스 명: House
 * 			속성(has a): 방의 개수, 주소, 소유주, 화장실 개수 ...
 * 			기능(행위): 얼마에 세를 놓다, 얼마에 매도하다, ...xx에 위치하다
 */

public class Jikbang {

	public static void main(String[] args) {
		//객체 2개 생성해서 각각 속성값을 주고
		//메소드를 호출해보기(showInfo, existAt, ...)
		House h1 = new House(); //객체 생성
		House h2 = new House();
		
		h1.room = 2;
		h1.addr = "부산시";
		h1.owner = "한소예";
		
		h2.room = 3;
		h2.addr = "동래구";
		h2.owner = "송메";
		
		h1.showInfo();		
		h2.showInfo();
		
		String s1 = h1.existAt(100);
		String s2 = h2.existAt(1000);
		System.out.println(s1);
		System.out.println(s2);
		
		h1.rent("", 1234);
	}

}
