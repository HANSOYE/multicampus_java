package day06;

public class Student {
	//학번 이름 학년
	int no; //학번
	String name; //학생이름
	int grade;// 학년
	
	public void showInfo() {
		System.out.println("---학생 정보---");
		System.out.println("학번: "+no);
		System.out.println("학생 이름: "+name);
		System.out.println("학년: "+grade);
	}
	
	public String information() {
		String str = "학생의 이름은 "+name+"이며, "+grade+"학년이고, 학번은 "+no+"입니다.";
		return str;
	}
}
