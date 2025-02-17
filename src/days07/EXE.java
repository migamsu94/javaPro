package days07;


public class EXE {

	public static void main(String[] args)  {
		 int d = 2; 

	        while (d > 0 && d <= 9) {
	            if (d == 3) {
	                d++;
	                continue;
	            }

	            int i = 1;
	            while (i > 0 && i <= 9) {
	                System.out.printf("%d * %d = %2d  ", d, i, d * i);
	                i++;
	            }
	            System.out.println();
	            d++;
	        }
		

	} // main

} // class
