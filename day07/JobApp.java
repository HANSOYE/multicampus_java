package day07;
/*
 * [5] main()메소드에서 해당 객체들을 생성해 테스트 하세요
JobApp 클래스 만들어서 main 메소드 구성하기
 */

public class JobApp {

	public static void main(String[] args) {
		Job j1 = new Job("yeah", "so", 2000);
		System.out.println("이름: "+j1.name);
		System.out.println("회사명: "+j1.company);
		System.out.println("연봉: "+j1.salary);
		
	}

}
