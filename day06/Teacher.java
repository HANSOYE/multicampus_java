package day06;

public class Teacher {
	//교원번호, 이름, 연락처, 담당과목
	int no;//교원번호
	String name; //이름
	String sub; //담당과목:subject
	
	public void showInfo() {
		System.out.println("---교사 정보---");
		System.out.println("교사 이름: "+name);
		System.out.println("교원 번호: "+no);
		System.out.println("담당 과목: "+sub);
	}
	
	public String information() {
		String str = "교사의 이름은 "+name+"이며, 담당과목은 "+sub+"이고, 교원번호는 "+no+"입니다.";
		return str;
	}
}
