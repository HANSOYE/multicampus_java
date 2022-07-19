package day07;

public class School {

	public static void main(String[] args) {
		/*
		 * [1] 학생 객체를 생성하고, 학번 이름 전공값을 할당하세요
		 * [2] 교사 객체를 생성하고, 학번 이름 담당과목을 할당하세요
		 * [3] 직원 객체를 생성하고, 사번 이름 부서를 할당하세요
		 */
		
		//학생
		Student s1 = new Student();
		s1.setNo(1);
		s1.setName("송메");
		s1.setMajor("고분자");
		
		Student s2 = new Student();
		s2.setNo(2);
		s2.setName("송메2");
		s2.setMajor("고분자2");
		
		Student s3 = new Student();
		s3.setNo(3);
		s3.setName("송메3");
		s3.setMajor("고분자3");
		
		Student[] st = new Student[3];
		st[0] = s1;
		st[1] = s2;
		st[2] = s3;
		
		
		//교사
		Teacher t1 = new Teacher();
		t1.setNo(1);
		t1.setName("식빵1");
		t1.setSubject("데이터1");
		
		Teacher t2 = new Teacher();
		t2.setNo(2);
		t2.setName("식빵2");
		t2.setSubject("데이터2");
		
		Teacher arr2[] = {t1, t2};
		
		//직원
		Staff sf = new Staff();
		sf.setNo(3);
		sf.setName("송케");
		sf.setDept("GAN");
		
		
		//확인해보기
		System.out.println("학번: "+st[1].getNo());
		String mj = st[1].getMajor();
		System.out.println("전공: "+mj);
		
		st[1].showInfo();
		t1.showInfo();
		sf.showInfo();
		
		//문제1]학생 객체를 2개 더 생성하고...
				//        각각 이름,학번,전공 값을 넣어준뒤...
				//			배열에 저장하자.
				//			for루프 돌리면서 저장된 학생 객체들의
				//         정보를 출력해보자.
		
		for(int i =0; i<st.length; i++){
			Student std = st[i];
//			System.out.println(std);
			std.showInfo();
		}

		//문제2] 교사 객체 1개 더 생성
				//    값 할당 후 배열에 저장후, 확장 for루프 이용해서 교사정보 출력하기
		for(Teacher tc:arr2) {
			tc.showInfo();
		}
	}

}
