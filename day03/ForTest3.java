package day03;
/*
 * 중첩 for 루프문
 */

public class ForTest3 {

	public static void main(String[] args) {
		for(int i = 2; i<4; i++) 
		{
			for(int k = 1; k<3; k++)
			{
				System.out.println("i: "+i+", k="+k);
			}//for---
			System.out.println("*******************");
		}//for---
		 /*
		  * 문제1]중첩 for 루프를 이용해서 아래 모양이 출력되도록 해보세요
		  * ★★★★★
		  * ★★★★★
		  * ★★★★★	
		  */
		
		int star = 0;
		for(int s = 1; s<=3; s++)
		{
			for(int t = 1; t<=5; t++)
			{
				System.out.print("★");				
			}
			System.out.println("");
		}
		
		/*
		 * 문제2] 중첩 for 루프 이용해서 구구단 전체를 아래 형태로 출력하시오
		 * 2*1=2 3*1=3 ... 9*1=9
		 * ...
		 * 2*9=18 3*9=27 ... 9*9 =81
		 */
		for(int b = 1; b<=9; b++) 
		{
			for(int a = 2; a<=9; a++)
			{
				System.out.print(a+"x"+b+"="+a*b+"\t");
			}
			System.out.println("");
		}

	}

}
