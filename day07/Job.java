package day07;
/*
[1] 잡코리아나 사람인 사이트를 살펴보고
해당 프로그램에 필요한 객체를 2개 추출하세요
 ex) 구직자, 구인회사, 헤드헌터,...

[2] 추출한 객체를 class로 구성하세요.
이때  속성은 3개, 메소드는 2개 이상 구성하세요

[3] 속성은 캡슐화하고, setter와 getter를 구성하세요

[4] 생성자를 구성하되 2개 이상 구성하세요=>오버로딩
==> this로 초기화

[5] main()메소드에서 해당 객체들을 생성해 테스트 하세요
JobApp 클래스 만들어서 main 메소드 구성하기
*/

import java.util.Scanner;

public class Job {
	//[1]잡코리아나 사람인 사이트를 살펴보고
	//해당 프로그램에 필요한 객체를 2개 추출하세요
	String name;
	String company;
	int salary;
	
	//[3] 속성은 캡슐화하고, setter와 getter를 구성하세요
	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String Company) {
		this.company = company;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public int getSalary() {
		return salary;
	}
	
	//[4] 생성자를 구성하되 2개 이상 구성하세요=>오버로딩
	public Job(String name) { //기본 생성자 - default constructor
		this.name = name;
	}
	public Job(String name, String company, int salary) {
		this.name = name;
		this.company = company;
		this.salary = salary;
	}
	
	/**[2] 추출한 객체를 class로 구성하세요.
	 * 출력 메소드
	 */
	
	public void showInfo() {
		System.out.println("구직자 이름: "+name);
		System.out.println("회사명: "+company);
		System.out.println("연봉: "+salary);
	}
	
	/**
	 * 입력받는 메소드
	 */
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구직자 이름 입력 =>");
		name = sc.next();
		
		System.out.println("회사명 입력=>");
		company = sc.next();
		
		System.out.println("연봉 입력=>");
		salary = sc.nextInt();
	}
	
	public void Job() {
		
	}
	

}
