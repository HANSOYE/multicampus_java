package day09;

public class SubCircle extends Circle{
	
	@Override
	public void area(int x, int y) {}
	//빈 블럭으로라도 재정의해야 한다.
	
	//오버로드
	public void area(int r) {
		System.out.println("원의 넓이: "+(Circle.PI*r*r));
	}

}
