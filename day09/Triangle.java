package day09;
//직삼각형 : 가로*세로/2
//shape 추상 클래스 상속 받아서 오류 없게 메서드 재정의 하기
public class Triangle extends Shape{
	
	@Override
	public void area(int x, int y) {
		int k = x*y/2;
		System.out.println("직삼각형 넓이: "+k);
	}

}
