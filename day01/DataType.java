//import java.util.Date;
import java.util.*;

public class DataType
{
	public static void main(String[] args)
	{
		//참조형
		Date d = new Date(); //java.utill 패키지에 있는 클래스
		System.out.println(d);
		System.out.println("2. 자료형-실수형-----");
		//float(4byte) < double(8byte)-default
		//float : 단정밀도 소수점이하 7자리 정도까지 표현 가능
		//double : 배정밀도 소수점이하 15자리~16자리 정도 (좀 더 정밀하다)
		float ft1 = 12.34F; //디폴트로 소수점일 시 더블을 사용하기 때문에 에러가난다. 
							//그러니 float사용시에는 F 접미사를 붙여줘야한다.
		System.out.println(ft1);
		float ft2 = 321;
		System.out.println(ft2);
		//promotion: 작은 자료형에서 큰 자료형으로 자동으로 형변환이 일어나는 것
		//float에 321을 넣으면 321.0으로 출력되어 나옴
		//byte < short < int < long < float < double
		//		 char  <
		//물리적으로 생각했을 때는 4바이트인 플롯이 8바이트인 롱보다 작지만,
		//실수형이 정수형보다 큰 값을 가진다
		double d1 = 100.1234567891011D; //접미사 D를 붙이기도 하지만 더블이 디폴트라 굳이 붙이지 않아도 된다.
		System.out.println(d1);
		byte i = 9;
		double d2 = i;
		System.out.println(d2);
		//과학적 지수 표기법 : e+4 => 10^4m, e-4 => 10^-4
		double d3 = 200e-4; //200*0.0001
		System.out.println(d3);

		float ft3 = 200e+4f; //200*10000
		System.out.println(ft3);

		float ft4 = 3.69f;
		int k = (int)ft4;

		//casting(강제형변환) : 큰 자료형을 작은 자료형으롭 변환하고자 할 때 사용
		//변수 = (자료형)값 => 주의! 값의 손실이 발생할 수 있다.
		System.out.println(ft4);
		System.out.println(k);

		byte x = (byte)128;
		System.out.println(x);

		System.out.println("3. 자료형 - char(문자형)");
		//문자형: character ==> char : 문자 1개를 저장할 수 있다(기본자료형) '글' 자 하나만 저장 가능함
		//문자열: String ==> 문자 여러개를 저장할 수 있다. (참조형) "문자열저장가능"
		//char(2byte): 0 ~ 2^16-1 ==> 0 ~ 65535 모든 국가의 언어 표현 가능. 유니코드 체계를 사용
		//short(2byte) : -2^15 ~ 2^15-1
		char ch = 'A';
		// char ch2 = 'Aa' 한 글자만 가능하기 때문에 에러가 남. A만 쓰거나 a만 써야함
		System.out.println(ch);

		String str = "AB";
		System.out.println(str);

		char ch3 = '한';
		char ch4 = '\uff57';
		System.out.println("ch3="+ch3); //문자열에 + 연산자를 사용하면 문자열 결합이 일어난다.
		System.out.println("ch4="+ch4);

		System.out.println("4. 논리형 -boolean");
		//boolean(1) : true, false값만 갖는다
		boolean bool = true;
		boolean bool2 = 2>5;
		System.out.println("bool="+bool);
		System.out.println("bool2="+bool2);
		//int a = (int)bool; //자바의 논리형은 형변환 할 수 없다. 0이나 1로 호환되지 않는다.

		/* int 형미만의 자료형 데이터들이 연산에 사용될 경우 그 결과는 int형으로 자동 형변환이 일어난다.
			byte
			short
			char
		*/
		byte m1 = 1;
		byte m2 = 2;
		//byte result = m1+m2; 연산하면 int로 강제형변환이 되기 때문에 바이트는 사용할 수 없다
		//연산할 때 int보다 큰 걸로 받으면 상관 없다.(double, long등)
		int result = m1 + m2;
		System.out.println("resurlt="+result);

		char c = 'A'; // 아스키 코드에 의하면 A는 65임, B는66임 
		System.out.println(c);
		System.out.println(c+1); // 결과로 66이 나오는데 아스키 코드에서 A(65)+1=66이기 때문
		System.out.println((char)(c+1));






	}


}