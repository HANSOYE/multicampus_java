package day04;
import java.util.*;
//java의 정석 3판 연습문제 풀이
//ch3/Exercise3_4.java


public class Test4 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		num = num.substring(0, num.length()-2);
		System.out.println(num.concat("00"));
		
	}

}
