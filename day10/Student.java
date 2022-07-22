package day10;
//값을 가지고 있는 도메인 객체이기 때문에 캡슐화 해야한다.
//도메인 객체 - VO(Value Object), DTO(Data Transfer Object)라고 한다.
//캡슐화를 한다 - setter, getter 만들어야한다.

public class Student {
	private int id;
	private String name;
	
	//기본생성자
	public Student() {
		this(0, "아무개");
	}
	
	//매개변수 받는 생성자
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//day11.ObjectTest의 id값과 name값이 같으면 true를 반환하게 하기위한 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student user = (Student)obj;
			boolean bool = user.name.equals(this.name)&& user.id == this.id;
			return bool;
			
		}
		else {
			return false;
		}
	}

		
		
	}//Student////////////
