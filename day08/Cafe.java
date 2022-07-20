package day08;

public class Cafe {

	public static void main(String[] args) {
		//밀크 커피 만들기
		
		CoffeeMachine cm1 = new CoffeeMachine();
		String mk = cm1.makeTea(1,2,3);
		System.out.println(mk);
		
		//설탕 커피
		cm1.makeTea(10, 4);
		
		//블랙 커피
		cm1.makeTea(3);
		
		//크림 커피
		cm1.makeTea((short)1, 3);
		
		//유자차
		Yuja x = new Yuja();
		x.setYuja(3);
		x.setSugar(5);
		cm1.makeTea(x);

	}

}
