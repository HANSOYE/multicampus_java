package Question;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		System.out.println("알파벳을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		char y = x.charAt(0);
		
		switch(y) {
		case 'a','e','i','o','u':
			System.out.println("모음입니다.");
			break;
		
		default :
			System.out.println("자음입니다");
		}
	}

}
