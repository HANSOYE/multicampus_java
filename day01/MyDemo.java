//package my.com;
//[1] 패키지 선언문 = package명;
//import java.lang.System; //java.lang : 기본패키지임 java.lang 패키지 import문은 생략이 가능하다.
//[2] import문 = import 패키지명.클래스명;

//[3] class 선언문
public class MyDemo
{
	//main method가 있어야 한다.
	public static void main(String[] args)
	{
		System.out.println("--자바의 자료형--");
		//cmd에서 컴파일 후 실행
		//정수형: byte(1) short(2) int(4) long(8바이트 차지함)
		//실수형: float(4) double(8바이트 차지함)
		byte a = -128; //1 byte => 8bit : -2^7 ~2^7-1 : -128~127
		double b = 127;
		System.out.println(a);
		System.out.println(b);

		short c = 128; //2 byte => 16bit : -2^15 ~2^15-1
		short d = 5000;
		System.out.println(c);
		System.out.println(d);

		int e = 70000; // 4 byte => 32bit : -2^31 ~2^31-1
		System.out.println(e);

		long ln = 40; //8바이트 => 64비트 : -2^63 ~ 2^63-1
		long ln2 = 40L; //long의 경우 접미사 (L, l)를 붙일 수 있다.
		System.out.println(ln);
		System.out.println(ln2);

		int i = 1000000000; //0이 아홉 개 4바이트 : -21억~21억 정도
		long j = 10000000000l; //0이 열 개

		System.out.println(i);
		System.out.println(j);

		System.out.println('--------------');
		System.out.println("1"+"2");
		System.out.println(true+ "");
		System.out.println('A' + 'B');
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println('J'+'ava');
		System.out.println(true+null);


	}
}