package day08;
//부모클래스 : Super class, Base class

public class Human {//상속 받은 게 없으면 묵시적으로 Extends Object 하고 있음 = Object으로 부터 상속받는중
	String name;
	int height;
	
	public Human() { //부모클래스는 기본 생성자가 없으면 에러가 남. 이렇게 기본 생성자를 먼저 만들어놓는 것을 추천.
		this("아무개", 155);
		
	}
	public Human(String n, int h) {
		name = n;
		height = h;
	}
	
	public String getInfo() {
		return "이름: "+name+"\n키: "+height;
	}
}
