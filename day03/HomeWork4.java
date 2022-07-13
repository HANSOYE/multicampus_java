package day03;
//연습문제5.png 파일임
import java.util.*;

public class HomeWork4 {

	public static void main(String[] args) {

		System.out.println("==4-1==");
		//4-1-1
		System.out.println("==4-1-1==");
		//Scanner sc = new Scanner(System.in);
		//System.out.println("숫자를 입력하세요");
		//int x = sc.nextInt();
		int x = 21;
		if (x>10 & x<20) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//4-1-2
		System.out.println("==4-1-2==");
		char ch = 'd';
		if (ch != ' ' || ch != '\t'){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//4-1-3
		System.out.println("==4-1-3==");
		char ch2 = 'x';
		if (ch2 == 'x' | ch2 == 'X'){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		//4-1-4
		System.out.println("==4-1-4==");
		char ch3 = '3';
		if (ch >= '0' & ch <= '9'){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//4-1-5
		System.out.println("==4-1-5==");
		char ch4 = 'd';
		if ((ch4 >= 'A' & ch4 <= 'Z') & (ch4 >='a' & ch4 <='z')){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//4-1-6
		System.out.println("==4-1-6==");
		int year = 2000;
		if (year%400==0 || (year%4==0 & year%100!=0)) {
			System.out.println(year+"년은 윤년입니다.");
		}
		else {
			System.out.println("false");
		}
		
		//4-1-7
		System.out.println("==4-1-7==");
		boolean powerOn = false;
		if (powerOn == false) { //if(!powerOn) 으로도 씀
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//4-1-8 중요함!!!!!!
		System.out.println("==4-1-8==");
		// == : 참조형에서는 주소값을 비교한다. 기본자료형에서는 값을 비교한다.
			//객체를 생성하면 (new String) 주소 값이 달라지기 때문에 false가 나온다
		//문자열의 내용값을 비교하는 메소드:
		//boolean equals(Object o): 문자열의 내용이 같으면 true를 반환

		//String str = "yes"; //str == 'yes'로 하면 result = true
		String str = new String("yes"); //str == 'yes'로 하면 result = false
		if (str.equals("yes")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//4-2
		System.out.println("==4-2==");
		int i = 1;
		int sum = 0;
		for(; i<=20; i++) {
			if(i%2!=0 & i%3!=0) {
				sum = sum +i;
			}
		}System.out.println("sum: "+sum);
		
		
		//4-3
		int sum_number = 0;
		System.out.println("==4-3==");
		for (int s = 1; s<=10; s++) {
			
		}
		

	}

}
