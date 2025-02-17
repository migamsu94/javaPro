package days06;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class EXEXE {

	public static void main(String[] args) {
		int[] m = IntStream.generate(() -> (int) (Math.random() * 100) + 1)
                .limit(10)
                .toArray();

// 최대값과 최소값 찾기
		IntSummaryStatistics stats = Arrays.stream(m).summaryStatistics();

// 결과 출력
		System.out.println("배열: " + Arrays.toString(m));
		System.out.println("최대값: " + stats.getMax());
		System.out.println("최소값: " + stats.getMin());

	}

}
