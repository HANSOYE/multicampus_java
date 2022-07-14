package day02;

public class MyOperator {
	static public void main(String[] args) {
		System.out.println("1.산술 연산자---");
		//+, -, *, /, %(나머지 연산자)
		int a = 10;
		System.out.println(a-6);
		System.out.println(a*3);
		System.out.println(a/3);
		System.out.println(a%3);
		
		double b = 10;
		System.out.println(b/3); // double/int -> 결과 double
		System.out.println("2. shift 연산자 (<<, >> , >>>)------");
		//42 : 00000000 00000000 00000000 00101010
		System.out.println(42<<3); //00000 00000000 00000000 00101010 000 -> 101010000 을 계산
		System.out.println(42>>3); //000 00000000 00000000 00000000 00101 -> 101만 계산
		System.out.println(42>>>3);
		/* 시프트 연산자
		1) >> :  오른쪽으로 비트수 만큼 이동
					앞에 남은 빈칸은 부호비트로 채운다. 제일 첫 숫자가 0이면 0으로, 1이면 1로 채운다
	    2) << : 왼쪽으로 비트수 만큼 이동
					뒤에 남은 빈칸은 0으로 채운다.
		3) >>> : 오른쪽으로 비트수 만큼 이동
					앞에 남은 빈칸은 무조건 0으로 채운다.
	*/
		//-43: 11111111 11111111 11111111 11010101
		System.out.println(-43<<2); //111111 11111111 11111111 11010101 00 -> 101010100 -256+64+16+4 = -172
		System.out.println(-43>>2); //11 11111111 11111111 11111111 110101 -> 10101 = -16+4+1 =-11
		System.out.println(-43>>>2); // 00 11111111 11111111 11111111 110101 -> 10101 = -11
		
		System.out.println("3. 비교 연산자: ==, !=, >, >=, <, <=, instanceof");
		int m = 50;
		int n = 60;
		
		/* 1) > : 큰가?
		 * 2) >= : 크거나 같은가
		 * 3) < : 작은가
		 * 4) <= : 작거나 같은가
		 * 5) == : 같은가
		 * 6) != : 다른가
		 * 7) 참조변수 instanceof 클래스명: 참조변수가 클래스의 객체인가?
		 * 
		 */
		
		System.out.println(m>n);
		
		if(m>=n) {
			System.out.println("@@@@");
		}else if(m<n) {
			System.out.println("####");
		}


		
	}
	

}
