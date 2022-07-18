package day06;
import java.io.*;
/*
 * Exception
 * 		+--------IOException
 * 						+--------FileNotFoundException
 * 
 * throws로 처리하기
 */

public class FileIO2 {

	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("명령줄 인수로 읽을 파일명을 입력하세요");
			System.out.println("C:/myjava/day01/Hello.java");
			return;
		}
		String fileName = args[0];
		
		try {
			String contents =FileIO2.reading(fileName);
			System.out.println(contents);
		}catch(IOException e) {
			System.out.println("파일 읽는 중 예외 발생: "+e.getMessage());
		}
		
	}//main-----------
	
	/**
	 * 파일을 읽어서 파일 내용을 문자열로 반환하는 메소드
	 */
	public static String reading(String fname) 
	throws FileNotFoundException, IOException{
		FileReader fr = null;
		char[] data = new char[1000];

		//파일 내용은 data 배열에 담긴다. ==> 문자열로 만들자
		String contents = new String(data);
		
		return contents;
	}

}
