package day09;
//사각형
public class Rectangle extends Shape{
	//abstract class를 부모클래스로 받아올 때는 메소드를 재정의 해야한다.
	
	@Override
	public void area(int x, int y) {
		int k = x*y;
		System.out.println("사각형 면적: "+k);
	}

}
