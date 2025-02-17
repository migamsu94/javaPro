package days08;

import java.util.Scanner;

public class EXEXEX {

	public static void main(String[] args) {
		// 1+2+4+7+11+16+22+29+...=???   
		int sum= 0;
		int show = 1;
		int plus = 1;
		
		for (int i = 0; i < 10; i++) {
			sum += show;
			System.out.printf("%d+", show);
			show += plus++;
		} // for i
		System.out.printf("\b=%d", sum);
	}
 // show / 1 == 0 && show / show == 0 && show % 2 == 0 && show % 2 == 1
}
