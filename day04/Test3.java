package day04;
import java.util.*;
//java의 정석 3판 연습문제 풀이
//ch3/Exercise3_3.java

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		String po_ne = sc.next();
		
		if (po_ne.charAt(0) == '0') {
			System.out.println("0입니다.");
		}
		else if(po_ne.charAt(0) == '-') {
			System.out.println("음수입니다.");
		}
		else if(po_ne.charAt(0) > 0 | po_ne.charAt(0) == '+') {
			System.out.println("양수입니다.");
		}
	}

}
