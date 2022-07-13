package day03;
/*
 * loop문
 * [1] for 루프문
 * 		for(변수 선언문; 조건식; 증감식)
 * 		{
 * 			실행문;
 * 		}
 * 		조건식이 true일 동안 실행문을 반복해서 실행한다.
 */

public class ForTest {
	int k; //멤버변수 => 초기화하지 않으면 기본값(0)이 할당된다.

	public static void main(String[] args) {
		System.out.println("Hello World~");
		
		for(int i = 1; i<=7; i++) {
			//지역변수 i의 scope(범위)=>for 루프내에서만 살아있음
			System.out.println("Hi world : "+i);			
		}//for---
		System.out.println("~~The End~~");
		
		int j = 10; //지역 변수 초기화식
		//method 안에 있거나(main 안에), for 같은 것 안에 있으면 지역변수임
		for(;j>3;j--) {
			System.out.println("Java: "+j);
		}
		System.out.println("##The End##"+j);
		
		//무한루프, 조건이 없으면 무한루프이다.
		for(;;)
			System.out.println("@@@@");
		
	}//main---

}//class---
