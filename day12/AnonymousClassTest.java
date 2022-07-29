package day12;

import day12.MyObject;

class MyObject extends Object{
		@Override
		public String toString() {
			return "I am MyObject";
		
	}
}
public class AnonymousClassTest{
	
	
	public static void main(String[] args) {
		Object o1 = new Object();
		
		//o2를 오버라이드 하려면 이걸 상속받는 클래스를 만들어야한다.
		Object o2 = new Object() {
			@Override
			public String toString() {//이름 없는 로컬 이너 클래스
				return "Anonymous Object";
			}
		};
		
		System.out.println(o1);
		System.out.println(o1.toString());
		
		Object o3 = new MyObject();
		System.out.println(o3);
		
		System.out.println(o2);
		
	}

}
