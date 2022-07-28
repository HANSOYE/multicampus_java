package day10;
import java.util.*;
import javax.swing.*;
/*
 * Java Collection Framework
 * 		- Collection: 객체를 수집해서 저장하는 역할
 * 		- Framework : 사용방법을 미리 정해놓은 라이브러리를 의미
 * 		- Vector, ArrayList, Hashtable, HashMap, HashSet, TreeSet...
 * # Vector
 * 	- List 계열
 * 	- 입력 순서를 기억한다
 * 	- 데이터 중복 저장 가능
 * 	- 유사 클래스: ArrayList(웹에서 사용)
 */

public class VectorTest {

	public static void main(String[] args) {
		//jdk1.4 이전 버전
//		Vector v = new Vector(); //초기용량: 10개, 가득차면 2배로 저장공간을 늘린다
		Vector v = new Vector(5,3);//5:초기용량, 3:증가치
		System.out.println("벡터 v의 현재 용량: "+v.capacity()); //result = 5
		System.out.println("벡터 v의 현재 크기: "+v.size()); //result = 0
		
		//데이터 저장: add(), addElement()
		//데이터 꺼내기: Object get(int index), Object elementAt(int index)
		
		v.add("Hello");
		v.add(new Integer(20));
		//위가 아래와같이 바뀜. 그래도 위도 사용가능
		v.add(Integer.valueOf(22));
		v.add(3.14);//double이 저장되는 것이 아니라 Double => Wrapper Class로 auto boxing 되어 저장된다.
		
		System.out.println("벡터 v의 현재 용량2: "+v.capacity()); //result = 5
		System.out.println("벡터 v의 현재 크기2: "+v.size()); //result = 4
		
		v.add(new Object());
		v.add(new javax.swing.JButton("OK"));
		
		System.out.println("벡터 v의 현재 용량3: "+v.capacity()); //result = 8
		System.out.println("벡터 v의 현재 크기3: "+v.size()); //result = 6
		
//		Object obj = v.get(0);
		//Object는 부모타입이라 String에서 사용할 수 있는 toUpperCase를 사용할 수 없다.
//		System.out.println(obj.toUpperCase);
		
		//String으로 강제 형변환
		String obj = (String)v.get(0);
		System.out.println(obj.toUpperCase());
		
		Double dbl = (Double)v.get(3);
		System.out.println(dbl);
		
		//JButton은 아래와 같이 String으로 형변환 할 수 없다.
//		String str = (String)v.get(5);
//		System.out.println(str);
		
		JButton jb = (JButton)v.get(5);
		System.out.println(jb); //출력하면 str.toString()을 호출해서 출력한다. 그래서 JButton의 속성정보가 나온다.
		
		//jdk 1.4 이후부터 5.0, 6.0 ...으로 부름
		//5.0 이후부터 Generic을 사용한다
		//Generic은 Vector를 사용할 때 어떤 유형만 사용할 것이라고 지정해놓는 것임
		Vector<String> v2 = new Vector<>();
		//String 유형만 저장하는 벡터 생성
		v2.add(new String("Java"));
		
		//String이 아닌 다른 유형을 저장하려고 하면 아래와 같이 add에서 에러가 남
//		v2.add(Integer.valueOf(5));
		//그럼 아래와 같이 toString()을 사용하면 된다.
		v2.add(Integer.valueOf(5).toString());
		
		String s2 = v2.get(0); //generic을 이용하면 형변환이 필요없다.
		System.out.println(s2.toLowerCase());
		
		System.out.println("================");
		
		//[1] for루프 이용해서 v2에 저장된 객체를 출력하기
		
		for(int i = 0 ; i<v2.size(); i++) {
			System.out.println(v2.get(i));
		}

		System.out.println("================");
		
		//[2] Float유형을 저장할 벡터 v3를 생성하고
		//		float객체 3개 이상 저장하기
		//		확장 for 루프문 이용해서 v3에 저장된 값들의 합계를 구해 출력하기
		Vector<Float> v3 = new Vector<>();
		v3.add(new Float(3.14));
		v3.add(new Float(1.59));
		v3.add(new Float(2.44));
		
		v3.add((float) 3.14);
		v3.add(3.14f);//float => Float으로 자동 auto boxing 되어 저장된다.

		
		float sum = 0.0f;
		
		for(float vf :v3) {//auto unboxing
			sum+=vf;
		}
		System.out.println(sum);
		
	}

}
