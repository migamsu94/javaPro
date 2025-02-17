package days06;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 5:26:19
 * @subject 
 * @content
 */
public class Ex09_03 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		char one ;
		
		System.out.print("> 한 문자 입력 ? ");
		one = scanner.next().charAt(0);
		System.out.printf("%c\n", one);
		
		System.out.print("> 한 문자 입력 ? ");
		one = scanner.next().charAt(0);
		System.out.printf("%c\n", one);
	    
		scanner.close();
	    /*
	    > 한 문자 입력 ? a엔터
	    a	
	    > 한 문자 입력 ? b엔터
	    b
	    */
	} // main
	
} // class







