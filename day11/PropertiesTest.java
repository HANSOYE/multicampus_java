package day11;
import java.util.*;
import java.io.*; // properties 파일에 있는 데이터를 불러오기 위함
/*
 * Properties: Map 계열
 * 		시스템의 설정정보 등을 xxx.properties 파일에 저장한 뒤, 
 * 		이 파일을 읽어서 해당 파일에 저장된 내용을 ㅏ용하고자 할 때 이용한다.
 */

public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String loc = "./src/day11/mysystem.properties"; //java에서 경로의 기준은 프로젝트폴더가 기준이다. 여기서는 Begin 폴더
		FileReader fr = new FileReader(loc);//파일과 노드를 연결하여 읽어들일 준비를 함
		//파일의 내용을 Properties 객체로 옮겨보자.
		
		Properties prop = new Properties();
		prop.load(fr);
		fr.close();
		//properties 파일 내용을 읽어서 Properties() 객체로 옮겨 저장해놓는다.
		
		//setProperties(String key, String value):저장
		//String get Properties(String Key): 꺼내기
		String os = prop.getProperty("Os");
		System.out.println("운영체제: "+os);
		
		String dbms = prop.getProperty("DB");
		System.out.println("DBMS: "+dbms);
		
		System.out.println("DB User: "+prop.getProperty("DbUser", "King"));//King은 디폴트값으로 준 것임
		System.out.println("Password: "+prop.getProperty("DbPwd"));
		System.out.println("Msg: "+prop.getProperty("Msg","메시지는 없습니다"));
		
		
		//properties 파일에 없지만 추가적으로 정보를 넣으려고 할 때는 setProperty를 사용한다.
		prop.setProperty("Lang", "Java");
		System.out.println("Lang: "+prop.getProperty("Lang"));
	}

}
