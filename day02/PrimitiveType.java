package day02;

public class PrimitiveType {
	public static void main(String[] args) {
		System.out.println("기본자료형------"); //ctrl + D : 현재 커서행을 삭제
		System.out.println("");
		//ctrl+s : 저장 -> 자동으로 컴파일됨(javac)
		//ctrl + F11: 현재 파일을 실행시킴(java)
		int a = 10;
		int b = 010; //정수(8진수) : 8진수는 앞에 0을 접두어로 붙인다 (0~7)
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c = 0123; // 1*8^2 + 2*8^1 + 3*8^0 = 64+16+3=83
		System.out.println("c="+c);//result = 83
		
		int d = 0x12; //정수(16진수) : 16진수는 앞에 0x를 접두어로 붙인다
		// result = 1*16^1 + 2*16^0 = 18
		//0 ~ 15: 0~9 A, B, C, D, E, F
		int e = 0x2ac;
		// result = 2*16^2 + 10*16^1 + 18*16^0 = 512+160+12 = 684
		System.out.println("d="+d);
		System.out.println("e="+e);
		
		char c1 = 'a';
		System.out.println("c1="+c1);
		char c2 = '0';
		System.out.println("C2="+c2);
		
		//int 미만의 자료형 (byte, short, char) => 연산에 사용되면 int로 자동형변환이 일어난다
		//그래서 c1+c2로 더하는 순간 int로 받게 되기 때문에 에러가 난다.
		int c3 = c1+c2; //97 + 48 =145
		char c4 = (char)(c2+2); //48+ 2 = 2 ? c2가 연산이 안 되네
		System.out.println(c3);
		System.out.println(c4);
		
		double d2 = .456E+2; //0.456*10^2 = 45.6
		System.out.println(d2);
		
		
	}

}
