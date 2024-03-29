package day10;
/*Map계열- Hashtable, HashMap, Properties
 * - Object유형을 저장할 수 있으며
 * - key와 value를 매핑하여 저장한다.
 * - 데이터가 75% 차면 자동으로 저장 영역을 확대한다.
 * - key값의 중복을 허용하지 않는다.
 * - 무순서
 * - 데이터 저장: Object put(Object key, Object val)
 * - 데이터 추출: Object get(Object key) 
 * */
import java.util.*;
public class HashtableTest {

	public static void main(String[] args) {
		Hashtable<String, Integer> h1 = new Hashtable<>();
		//Key: String, Value = Integer
		h1.put("생년", 2012);
		h1.put("나이", Integer.valueOf(20));
		h1.put("연봉", 5000);
		//있는 키를 다시 사용하여 새로운 value를 넣어주면 값이 덮어씌어진다.
		h1.put("나이", 30);
		
		//Map 계열은 검색이 용이하다.
		Integer age = h1.get("나이");
		System.out.println("나이"+age);
		System.out.println("h1.size(): "+h1.size());
		System.out.println("/////////////");
		
		//Enumeration<K> keys(): key값들만 Enumeration객체로 반환함
		//key값들 추출해서 출력한 뒤, value도 같이 출력해보기
		Enumeration<String> en = h1.keys();
		for(;en.hasMoreElements();) {
			String key = en.nextElement();
			System.out.println(key+">>"+h1.get(key));
		}
		
		System.out.println("/////////////");
		//Set<K> KeySet(): key 값들만 Set객체로 변환
		Set<String> set = h1.keySet();
		for(String ky:set) {
			System.out.println(ky);
		}
		System.out.println("/////////////");
		
		//Collection<V> values(): value값들만 반환
		Collection<Integer> cl = h1.values();
		for(Integer val : cl) {
			System.out.println(val);
		}
		System.out.println("/////////////");
		
		//boolean	containsKey(Object key): key값을 포함하고 있으면 true 없으면 false
		//boolean	containsValue(Object value): value값을 가지고 있으면 true, 없으면 false
		System.out.println(h1.containsKey("생년"));
		System.out.println(h1.containsValue(2013));
		

	}

}
