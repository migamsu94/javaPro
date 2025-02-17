package days03;

import java.util.Scanner;

public class exex {

	public static void main(String[] args) {
		// [문제]
				// 이름, 국어, 영어, 수학 점수를 입력받아서
				// 총점
				// 평균
				// [ 출력 ]
				// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		String name;
		byte kor, eng, mat;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf(" > 이름 입력 ? ");
		name = scanner.nextLine();
		System.out.printf(" > 국어 입력 ? ");
		kor = scanner.nextByte();
		System.out.printf(" > 영어 입력 ? ");
		eng = scanner.nextByte();
		System.out.printf(" > 수학 입력 ? ");
		mat = scanner.nextByte();
		
		short tot = (short)(kor + eng + mat);
		double avg = (kor + eng + mat) / 3.0;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, mat, tot, avg);
		
		scanner.close();

	}

}
