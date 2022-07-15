package day03;
import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("평균 점수를 입력하세요");
		float score = sc.nextFloat();
		System.out.println("평균 점수: "+score);
		char hak = 'F';
		//지역변수 (local variable)는 반드시 초기값을 주고 사용해야한다.
		if(score>=80 & score<90) {
			hak = 'B';
		}
		else if(score>=90 & score < 100) {
			hak = 'A';
		}
		else if(score>=70 & score <80) {
			hak = 'C';
		}
		else if (score>=60 & score < 70) {
			hak = 'D';
		}
		else {
			hak = 'F';
		}
		
		System.out.println("학점: "+hak);
		/*
		 * 
		 */
	}

}
