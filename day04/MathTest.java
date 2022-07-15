package day04;

public class MathTest {

	public static void main(String[] args) {
		//java.lang.Math 클래스의 멤버변수
		//public static final double PI: 상수 원주율(3.14)
		System.out.println(Math.PI);
		//static이 붙은 변수들은 앞에 클래스 명을 붙여준다. ex) "클래스명.변수" 식으로 접근한다.
		
		//메소드: 기능을 가지고 있다.
		//static 메소드(클래스 메소드) : 클래스명, 메소드명(값)
		//public static double sqrt​(double a) : 매개변수 a의 제곱근을 구해서 반환한다.
		double b = Math.sqrt(64);
		System.out.println("64의 제곱급: "+b);
		
		double num = 45.678;
		//num의 올림값, 내림값, 반올림값 구해 출력하기. Math클래스 메소드 사용해서 출력하기.
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.round(num));
		
		//public static double ceil​(double a):a의 올림값을 반환		
		
		double c = Math.ceil(num);
		System.out.println(num+"의 올림값: "+c);
		//public static double floor​(double a):a의 내림값을 반환
		double f = Math.floor(num);
		System.out.println(num+"의 내림값: "+f);
		//public static int round​(float a):a의 반올림값을 int로 반환
		long r = Math.round(num);
		System.out.println(num+"의 반올림값: "+r);
		
		int r2 = Math.round((float)num);
		System.out.println(r2);
		//public static double random()
		//: 0.0 <= r < 1.0 사이의 임의 난수를 발생시켜 반환해준다
		double r3 = Math.random();
		System.out.println("r3: "+r3);
		
		//[1] 0<= r4 <=10 사이의 입의의 정수를 발생시켜 출력하세요 =>random() 사용
		//실수
		double r4 = Math.random();
		System.out.println("r4: "+r4*10);
		
		//정수
		int n = (int)(r4*10);
		System.out.println(n);
		
		//[2] 5 <= r5 <= 15
		//실수
		double r5 = Math.random();
		System.out.println("r5: "+(r5*10)+5);
		//정수
		int n2 = (int)(r5*10+5);
		System.out.println(n2);
		
		//정수로 표현하기
		//int x = (int)(Math.random()*범위(=5~15=10)+시작수(=5);
		
		//[3] 16 <= r6 < 48 사이의 임의의 정수
		int sixteen = (int)(Math.random()*32+16);
		System.out.println("16~48사이 임의의 정수: "+sixteen);
		
		//[4] 알파벳 대문자를 무작위로 추출해서 아래와 같은 형태로 출력되도록 하세요
		/*	W I P O A
		 * 	T B P W Z
		 * 	C E R Y I
		 */
		for (int i = 0; i<3; i++) 
		{
			for (int j =0; j<5; j++) 
			{
				char alpha = (char)(Math.random()*25+'A');	//a~z는 26개. 26-1=25, A는 65번이라서 'A'대신 65 써도 됨	
				System.out.print(alpha+"\t");
			}System.out.println();
		}			
			

	}

}
