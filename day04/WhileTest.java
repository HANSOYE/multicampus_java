package day04;
import java.util.*;
/*
 * 변수 선언문
 * while(조건식){
 * 실행문;
 * 조건식;
 * }
 */

public class WhileTest {

	public static void main(String[] args) {
		int a=1;
		while (a<5) {
			System.out.println("Hello: "+a);
			a++;
			
		}//while---
		System.out.println("The End~~"+a);
		
		int b = 10;
		//b값이 0보다 클 때까지 반복 돌면서 "Java:"+b 출력하되
		//감소식은 2만큼씩 감소시키세요
		while(b>0) {
			System.out.println("Java: "+b);
			b -= 2;
		}
		
		//문제2] 구구단의 단을 입력받아서 구구단을 출력하기
		//while 문 이용하여 만들기
		System.out.println("구구단 몇 단을 출력할까요=>");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();// 입력
		int gu = 0;
		while (gu<9) {
			gu +=1;
			System.out.println(dan+"x"+gu+"="+dan*gu);
		}
				
				
		//문제2] 구구단 전체를 출력하되 while 문을 중첩해서 사용하기
		int gugu = 1;
		while (gugu<10) {
			int gugudan = 1;
			while (gugudan<10) {
				System.out.print(gugudan+"x"+gugu+"="+gugu*gugudan+"\t");
				gugudan++;
			}
			System.out.println("");
			gugu ++;
		}
		
		int j = 2;
		int k = 1;
		while(k<10) {
			while(j<10) {
				System.out.print(j+" x "+ k + " = "+j*k +"\t ");
				j++;
			}
			System.out.println();
			j = 2;
			k++;
		}
		int no1=1;
		while(no1<=9) {
			int no2=1;
			while(no2<=9) {
			System.out.print(no1+"x"+no2+"="+no1*no2+"\t");
				no2++;
			}System.out.println();
			no1++;
		}
		
		while(true) {
			System.out.println("무한루프됩니다");
		}


		

	}

}
