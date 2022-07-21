package day09;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println("각 도형의 면적을 구해 봅시다.");
		System.out.println("가로;: "+7+", 세로: "+8+"------------");
		//사각형
		Rectangle rt = new Rectangle();
		rt.area(7,  8);
		
		//삼각형
		Triangle ta = new Triangle();
		ta.area(7,  8);
		
		System.out.println("반지름: 8인 원의 면적 -----------");
		//원
//		Circle cr = new Circle(); ---에러남
		/*
		 * 추상 클래스는 타입(변수) 선언은 가능하나, new 사용하여 객체 생성은 할 수 없다.
		 */
		Circle cr = new SubCircle();
		//부모타입 변수선언 = new 자식 객체를 생성
		cr.area(8,  0); //오버라이딩한 메서드 호출
//		cr.area(8); // 변수 하나 짜리는 안 됨. 오버 로드 한 건 호출 불가능
		((SubCircle)cr).area(8); //강제형변환 사용할 수 있다.
		SubCircle sc = new SubCircle();
		sc.area(8);
		
		/*
		 * [1] rt, ta, cr, sc 객체들을 저장할 배열을 생성하고 저장한 뒤
		 * for 루프 돌리면서 area() 호출 해보기 x, y = (20, 30)
		 */
		Shape sh[] = {rt, ta, cr, sc};
		for(int i=0; i<sh.length; i++) {
			if(i<2) {
				sh[i].area(20,30);
			}
			else if(i>=2) {
				((SubCircle)sh[i]).area(20);
			}
		}

		
		for(Shape shape : sh) {
			if(shape instanceof SubCircle) {
				((SubCircle)shape).area(20);
			}else {
				shape.area(20, 30);				
			}
			System.out.println("***********");
		}
	}

}
