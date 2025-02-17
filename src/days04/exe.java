package days04;

import java.util.Scanner;

public class exe {

	public static void main(String[] args) {
		// [문제] if문 사용,  if ~ else문
				// 국어 점수를 입력받아서
				// 수/우/미/양/가
				// 출력
				// 수    90 이상 ~ 100이하
				// 우    80 이상 ~ 90 미만(89이하)
				// 미    70 이상 ~ 80 미만(79이하)
				// 양    60 이상 ~ 70 미만(69이하)
				// 가    0 이상 ~ 60 미만(59이하)
		
		byte kor;
		
		Scanner scanner = new Scanner(System.in);
		kor = scanner.nextByte();
		
		if ( 90 <= kor && kor <= 100 ) {
			System.out.println("수");
		} else if (80 <= kor && kor < 90) {
			System.out.println("우");
		} else if (70 <= kor && kor < 80) {
			System.out.println("미");
		} else if (60 <= kor && kor < 70) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		scanner.close();
		
		

	}

}
