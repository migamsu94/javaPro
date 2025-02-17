package days06;

import java.util.Random;

public class EXEX {

	public static void main(String[] args) {
		int[] m;
		m = new int[10];
		
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random()*101);
		}
		
		int max, min;
		max = min = m[0];
		
		
		for (int i = 1; i < m.length; i++) {
			max = Math.max(max, m[i]);
			min = Math.min(min, m[i]);
		} 
		System.out.println( max );
		System.out.println( min );


	}

}
