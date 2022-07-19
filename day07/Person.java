package day07;

public class Person {
	String name;
	int age;
	//생성자(Constructor): 객체를 생성할 때 호출되는 메소드의 일종
	/*
	 * 	-규칙-
	 * <1> 생성자 이름은 클래스 이름과 동일하게
	 * <2> 반환타입은 명시하지 않는다.
	 * <3> 역할: 멤버변수 값을 초기화하는 일을 주로 함
	 * 
	 * public 생성자명(){
	 * }
	 */
	public Person() { //기본 생성자 - default constructor
		name = "아무개";
		age = 1;
	}
	
	public Person(int age) {//인자 생성자- constructor using fields
		name = "오잉";
		this.age=age;
	}
	
	public Person(String name,int age) {//인자 생성자- constructor using fields
		this.name = name;
		this.age=age;
	}
	public Person(int age,String name) {//인자 생성자- constructor using fields
		this.name = name;
		this.age=age;
	}
	
	/*
	 * 오버로딩이란?
	 * -동일한 메소드 이름을 여러 개 구성하는 것(다중정의, 중복정의)
	 * - 매개변수의 자료형이 다르거나, 갯수가 다르거나, 순서를 다르게 구성해야한다.
	 * - 반환타입은 달라도 되고 같아도 될다(신경쓰지 않는다)
	 * 
	 * int a(){
	 * 		int a(){}
	 * 		int a(byte b){}
	 * 		void a(String s){}
	 * }
	 * 의 식으로 매개변수만 다르게 하면 같은 이름을 여러개 만들 수 있다.
	 */
	
	
}////
