package multicampus;
import java.util.*;

public class School {
	//School has a students[배열]
	//String[] arr = new String[3]; -X
	static Student[] arr = new Student[3];//배열 ->> DB같은 역할을 함
	static int count = 0; //배열의 인덱스 번호로 사용할 변수

	public static void showMenu() {
		//Student s1 = new Student();
		/*
		s1.no = 100;
		s1.name = "소예";
		s1.major = "빅데이터";
		s1.phone = "010-1234-5678";
		*/
		
		System.out.println("****SchoolApp v1.1****");
		System.out.println("** 1. 등록 **");
		System.out.println("** 2. 출력 **");
		System.out.println("** 3. 검색 **");
		System.out.println("** 4. 삭제 **");
		System.out.println("** 9. 종료 **");
		System.out.println("************");
		System.out.println("메뉴 번호를 입력하세요=>");
		System.out.println("************");
		
	}
	
	public static void register() {
		Student s1 = new Student();
		s1.inputInfo();
		System.out.println("---등록한 정보---");
		s1.showInfo();
		
		System.out.println("입력한 학생 정보를 저장할까요? [1.yes 2.no]");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num==1) {
			//s1을 배열에 저장한다. ==>arr에 저장하기
			try {
				arr[count] = s1;
				count++;
				System.out.println("현재 등록된 인원: "+count);
			}catch(ArrayIndexOutOfBoundsException e ) {
				System.out.println("등록 마감했습니다! [현재인원: "+count+"명]");
			}
		}
		
	}//--------------
	
	/**
	 * 등록된 모든 학생정보를 출력하는 메소드
	 */
	public void printAll() {
		//배열 arr에 저장된 학생 정보를 for 루프를 이용해서 꺼내어 출력해보기
		for(int i=0; i<count;i++) {
			Student s = arr[i];
			//System.out.println(s); //s의 주소값이 나옴
			System.out.println("----학생 정보----");
			s.showInfo();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School obj = new School();
		int num= 0;
		do {
			//showmenu 호출하기
			School.showMenu();
			num = sc.nextInt();
			//menu에 없는 번호를 입력했을 경우 "메뉴에 없는 번호예요. 다시 입력하세요"
			if((num<=0 | (4<num && num!=9))) {
				System.out.println("메뉴에 없는 번호입니다. 다시 입력하세요");
				continue;
			}

			switch(num) {
			case 1: //등록 ==> register 메소드 호출
				School.register();//static 메소드(클래스 메소드)
				break;
			case 2://출력==>printAll() 메소드 만들어서 출력하기
				// arr에 저장된 학생들의 정보를 반복문 돌면서 출력하기
				obj.printAll(); //non-static 메소드 호출(인스턴스 메소드)
				break;
			case 3://검색
				break;
			case 4://삭제
				break;
			}
			
		}while(num !=9);
		System.out.println("프로그램을 종료합니다.");
	}

}
