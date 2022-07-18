package day06;

public class Staff {
	//직원번호, 이름, 부서
	int no;//직원번호
	String name; //이름
	String dept; //부서
	
	public void showInfo() {
		System.out.println("---교사 정보---");
		System.out.println("직원 이름: "+name);
		System.out.println("직원 번호: "+no);
		System.out.println("직원 부서: "+dept);
	}
	
	public String information() {
		String str = "직원의 이름은 "+name+"이며, 담당 부서는 "+dept+"이고, 직원 번호는 "+no+"입니다.";
		return str;
	}
}
