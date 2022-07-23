package day11;
/*
 * Local Inner class: 메서드 블럭 안에 클래스를 구성한 경우
 *  [1] 이름있는 로컬 이너 클래스
 *  [2] 이름 없는 로컬 이너 클래스
 *  
 */
public class Local {
	String str = "멤버변수@@@";
	
	
	public void sub() {
		double pi = 3.14; //지역변수(local var)
		System.out.println("str: "+str);
		System.out.println("pi: "+pi);
		
		class LocalInner{ //local inner class
			String lstr = "LocalInner의 멤버변수 ###";
			void foo() {
				//str출력
				System.out.println("str: "+str);
				
				//lstr출력
				System.out.println("lstr: "+lstr);
				
				//pi출력
				System.out.println("pi: "+pi);
				/*
				 * 로컬이너 클래스 안에서는 final이 아닌 지역변수는 접근 불가
				 */
			}
		}
		/*
		 * 로컬이너 클래스는 자기가 속한 메서드 안에서 객체생성해야 함
		 * 또한 클래스가 구성된 후 객체 생성이 가능하다.
		 */
		
		LocalInner li = new LocalInner();
		li.foo();
	}//sub()///////////
	
	/*
	 * 로컬이너 클래스는 자기가 속한 메서드 안에서 객체생성해야 함
	 * 또한 클래스가 구성된 후 객체 생성이 가능하다.
	 */
	public static void main(String[] args) {
		//LocalInner의 foo()를 호출하기 - 불가능. 멤버변수가 아니고 지역변수와 같이 때문. 
		//							- foo가 속한 메서드 안에서는 호출 가능
		//Local의 sub()호출하기
		Local l = new Local();
		l.sub();
		
	}
}
