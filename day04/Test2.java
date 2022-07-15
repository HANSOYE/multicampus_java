package day04;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요=>");
		String value= sc.next();
		System.out.println(value);
		//반복문 이용해서 입력값들의 문자를 추출한 뒤, 해당 문자가 숫자 범위가 맞으면 "숫자입니다."
		//한 개라도 숫자가 아닌 문자가 있으면 "숫자가 아닙니다. 다시 입력하세요"를 출력하는
		//프로그램을 짜시오
		char number = ' ';

		for(int i = 0; i < value.length(); i++) {
		number = value.charAt(i);
		if(number>=0 && number<=9) {
			System.out.println("숫자입니다.");
			break;
		}//if---
		else {
			System.out.println("숫자가 아닙니다. 다시 입력하세요.");
			continue;
		}
		}//for---

	}//main--

}//Test2---
