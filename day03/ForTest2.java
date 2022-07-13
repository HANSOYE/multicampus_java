package day03;
/*
 * for 루프문을 이용해서 구구단 7단을 아래 형식으로 출력하세요
 * 7*1 =7
 * 7*2 = 14
 * ...
 * 7*9 = 63
 */

public class ForTest2 {

	public static void main(String[] args) {
		int dan = 7;
		int i = 1;
		for(; i<10; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
		}
		System.out.println("==sum & mul==");
		
		

		int sum = 0;
		int mul = 1;
		for(int j = 1; j<=10; j++) {
			//[문제2] 1~10까지의 합을 구해 출력하기
			sum = sum+j;

			//[문제3] 1~10까지의 곱을 구해 출력하기
			mul = mul*j;
		}

		System.out.println("합: "+sum);
		System.out.println("곱: "+mul);
		
		System.out.println("==even==");
		
	//[문제4] 1~100까지의 수 중 짝수들의 합을 구해 출력하기
		int even_sum = 0;
		for(int e = 1; e<=100; e++) {
			if (e%2 == 0) {
				even_sum = even_sum+e;
			}
		}
		System.out.println("짝수 합:"+even_sum);
			
		System.out.println("==eleven==");
	//[문제5] 1~100까지의 수 중 17로 나누어 떨어지는 수를 출력하세요
		int eleven = 0;
		for(int ev = 1; ev<=100; ev++) 
		{
			if (ev%17 == 0) 
			{
				eleven = eleven+ev;
			}
		}System.out.println("17로 나뉘어지는 값의 합: "+eleven);
			
	
	//[문제6] 대문자 알파벳[A~Z]을 for을 이용하여 출력하세요
		for(int a= 65; a<91;a++) {
			System.out.print((char)a+", ");
		}
		System.out.println(); //줄바꿈
		
		for(char a = 'A'; a<='Z'; a++) {
			System.out.print(a+", ");
		}
	}
	}


