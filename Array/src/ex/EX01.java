package ex;

public class EX01 {
	public static void main(String[] args) {
		
		// 여러개의 값을 저장할 배열 선언
		// 어떤 값이 당장 저장 될지는 모르지만, 정수 10개를 저장할 공간 확보
		
		int[] numbers = new int[10];
		
		
		// 시험 성적 5개를 저장하는 배열
		int scores[] = {90, 95, 85, 100, 80};
		
		// 세번째 점수 출력
		System.out.println(scores[2]);
	}
}
