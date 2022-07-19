package day07;

public class Staff {
	private int no;
	private String name;
	private String dept;
	
	//setter
	public void setNo(int no) {
		/*
		 * 멤버변수와 지역변수의 이름이 동일할 경우
		 * 지역변수가 우선권이 있다.
		 * 이럴 때 멤버변수와 지역변수를 구분하기 위해
		 * 멤버변수 앞에는 this. 을 붙인다.
		 * this: 자기자신의 객체(instance)를 참조할 때 사용하는 키워드
		 */
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	//getter
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	
	public void showInfo() {
		System.out.println("===직원정보===");
		System.out.println("사번: "+no);
		System.out.println("이름: "+name);
		System.out.println("부서: "+dept);
	}
}
