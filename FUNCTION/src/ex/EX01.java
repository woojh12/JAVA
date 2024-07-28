package ex;

public class EX01 {
	public static void main(String[] args) {
		
		// 반올림 함수
		long roundNumber = Math.round(3.5);
		System.out.println("결과 : " + roundNumber);
		System.out.println("결과 : " + Math.round(3.5));
		
		// 큰 값 구하기 함수
		int max = Math.max(10,50);
		System.out.println("결과 : " + max);
		System.out.println("결과 : " + Math.max(10, 50));
		
		
		// 제곱근 구하기 함수
		Math.sqrt(9);
		double sqrt = Math.sqrt(9);
		System.out.println("결과 : " + sqrt);
		System.out.println("결과 : " + Math.sqrt(9));
		
		int candyNum = 5;
		System.out.println(getCandyPrice(candyNum) + "원");
		
	}
	public static int getCandyPrice(int count)
	{
		int result = 250 * count;
		return result;
	}
}
