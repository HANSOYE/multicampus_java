package day06;
import java.util.*;
/*
 * 인사관리 프로그램
 * ==> 객체 : 집, 건물, 책상, 컴퓨터 등
 * 			사원, 부서, 급여... 등
 * 			일을 한다, 휴식을 취한다, 잠을 잔다, 점심을 먹는다...
 * 객체 = 속성(attribute) + (행동양식(behavior)
 * 		 명사형			  동사형
 * ==> 객체들을 프로그램 세계로 끌어들이는 것(추상화 - Abstraction)
 * 		[1] 속성 ==> 멤버변수
 * 		[2] 행동양식 ==> 메소드
 */

public class Employee {
	//속성: "has a"관계를 갖는다
	//Employee has a no, name, dept ...
	int no; //사번 ===> 멤버변수(인스턴스 변수)
	String name; //사원 이름
	String dept; //부서
	int salary; //급여
	Date indate; //입사일

	//해위 ==>메소드로 구성
	public void work(String type) {
		System.out.println(name+"은 "+type+"의 일을 하고 있어요");
	}
	public int receive_sal() {
		return salary*12;
	}
}


