package day03;
import java.util.*;
/*
 * 스캔으로 월(month) 입력해서 해당 월의 일수(days)를 출력하는 프로그램을 작성할 것.
 * 13, 5, 7, 8, 10 ,12: 31일
 * 2: 28일 (윤년 제외)
 * 4, 6, 9, 11: 30일 
 * 
 * switch~case 구문을 이용해서 구현하세요
 */

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요[1~12]=>");
		int month = sc.nextInt();
		int days = 0; //월에 따라 일수가 달라짐
		
		//"1월은 31일까지 있습니다" 형식으로 출력
		int result = 0;
//		switch(month) {
//		case 1, 3, 5, 7, 8, 10, 12: 
//			System.out.println(month+"는 31일까지 있습니다.");
//			break;
//		case 2:
//			System.out.println(month+"는 28일까지 있습니다.");
//			break;
//		case 4, 6, 9, 11:
//			System.out.println(month+"는 30일까지 있습니다.");
//			;
//		default:
//			System.out.println("없는 달 입니다.");
//			return;
//		}
//		
		switch(month) {
		case 1,3,5,7,8,10,12:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
		case 4,6,9,11:
			days = 30;
			break;
		default:
			System.out.println("없는 달 입니다");
			return;
		}
		System.out.println(month+"월은 "+days+"일까지 있습니다");

		
	}

}
