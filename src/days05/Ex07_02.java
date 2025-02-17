package days05;

public class Ex07_02 {

	public static void main(String[] args) {
		// 자바에서 임의의 수를 발생시키는 코딩.
		// 1) Math.random() 메서드 ***
		// 2) Random 클래스
		
		// Math 클래스 : 수학과 관련된 기능이 구현된 클래스
		System.out.println( Math.abs(10) );
		System.out.println( Math.abs(-10) );
		
		/*
		 * // 0.0 <= double < 1.0 for (int i = 0; i < 10; i++) { System.out.println(
		 * Math.random() ); } // for i
		 */		
		
		// 로또 번호 1~45 임의의 수 6개...
		
		int lottoNumber ;
		for (int i = 1; i <= 6; i++) {
			lottoNumber = (int)(Math.random() * 45) + 1;
			
		} // for ir
		
		
		// 국어 0 ~ 100
		// 0.0 <= Math.random() < 1.0 
		
		// 3 ~ 19
		int num ;
		
		for (int i = 1; i < 2; i++) {
			num = (int)((Math.random() * 17)+3 );
			System.out.printf("[%d]", num);
			
			
			
		} // for i

	} // main

} // class
