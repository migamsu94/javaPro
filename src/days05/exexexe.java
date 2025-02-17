package days05;

import java.util.Scanner;

public class exexexe {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=10; i <= 5000 ; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
	}


