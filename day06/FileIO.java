package day06;
import java.io.*;
/*
 * Exception
 * 		+--------IOException
 * 						+--------FileNotFoundException
 * 
 * try~catch로 발생한 예외를 처리
 */

public class FileIO {

	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("명령줄 인수로 읽을 파일명을 입력하세요");
			System.out.println("읽을 파일:  C:/myjava/day01/Hello.java");
			return;
		}
		String fileName = args[0];
		String contents =FileIO.reading(fileName);
		System.out.println(contents);
		
	}//main-----------
	
	/**
	 * 파일을 읽어서 파일 내용을 문자열로 반환하는 메소드
	 */
	public static String reading(String fname) {
		FileReader fr = null;
		char[] data = new char[1000];
		
		try {
			fr = new FileReader(fname); //FileNotFoundException 발생
			//파일과 노드를 연결함
			
			fr.read(data, 0, 1000);//IOException
			//파일을 읽어서 char 타입 배열 data에 담아준다
			
			fr.close();//IOException
			//노드 연결 끊기
			
			//파일 내용은 data 배열에 담긴다. ==> 문자열로 만들자
			String contents = new String(data);
			
			return contents;
		}catch(FileNotFoundException e) {
			System.out.println("에러 발생: "+e);
		}catch(IOException e) {
			System.out.println("에러 발생: "+e);
		}
		
		return fname;//string에 맞는 타입을 반환하면 됨. ex) null, "", 등
	}

}
