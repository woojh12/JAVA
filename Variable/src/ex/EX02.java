package ex;

public class EX02 {
	public static void main(String[] args) {
		
		// 문자 저장
		// 퀴즈의 정답은 O입니다.
		char answer = 'O';
		System.out.println("퀴즈의 정답은 " + answer + "입니다.");
		
		// 소수(실수) 저장
		// 원주율은 3.14
		double pi = 3.14;
		System.out.println("원주율은 " + pi);
		
		// 형변환 (casting)
		// double -> int
		int intpi = (int)pi;
		System.out.println("intpi : " + intpi);
		
		// int -> double
		double doublepi = intpi;
		System.out.println("doublepi : " + doublepi);
	
		// 평균 구하기
		int score1 = 95;
		int score2 = 100;
		
		//double average = (score1 + (double)score2) / 2;
		double average = (score1 + (double)score2) / 2.0;
		System.out.println("평균 : " + average);
		
	}
}
