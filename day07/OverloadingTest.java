package day07;

public class OverloadingTest {

	public static void main(String[] args) {
		Superman s1 = new Superman("vheh");
		System.out.println("s1.name: "+s1.name);
		
		Superman s2 = new Superman("슈퍼 사장님", 189, 55);
		System.out.println("s2.name: "+s2.name);
		System.out.println("s2.height: "+s2.height);
		System.out.println("s2.power: "+s2.power);
		
		
		String fo = s2.getInfo();
		System.out.println(fo);
		
		System.out.println("=====================");
		
		Aquaman a1 = new Aquaman("포포", 180, 77);
		System.out.println("a1.name: "+a1.name);
		System.out.println("a1.height: "+a1.height);
		System.out.println("a1.speed: "+a1.speed);
		
		Aquaman a2 = new Aquaman();
		System.out.println("a2.name: "+a2.name);
		
		String aa = a1.getInfo();
		System.out.println(aa);
		
		/*
		 * 슈퍼맨 객체4개를 배열에 저장하세요.
		 * 그런 뒤 for루프 이용해서 슈퍼맨들의 정보를 출력하세요
		 */
		Aquaman[] arr = {a1, a2};
		for(int i=0; i<arr.length; i++) {
			System.out.println("*****************");
			System.out.println(arr[i].getInfo());
		}
	}

}
