package days05;

/**
 * @author migam
 * @date 2025. 2. 7. - 오후 2:29:27
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// [while] 		1~10=55
		
		int i = 1, sum = 0;
		while ( i <= 10) {
			if ( i == 11) break; // break 문
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}
		System.out.printf("\b=%d\n", sum);
		
		
		/*
		 * int i; i = 1; int sum = 0;
		 * 
		 * while ( i <= 10 ) { System.out.print( i ); sum += 1;
		 * 
		 * } if (i < 10) { System.out.print("+"); } i++; System.out.printf("%d", sum );
		 */
		
		

	} // main

} // class
