package ex;

public class EX02 {
	public static void main(String[] args) {
		
		// 숫자가 저장된 문자열의 값을 정수로 변환
		String numberString1 = "30";
		String numberString2 = "20";
		
		System.out.println(numberString1 + numberString2);
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString2);
		
		System.out.println(number1 + number2);
		
		int number3 = 100;
		int number4 = 300;
		
		// 100300 으로 출력
		System.out.println(number3 + number4); 			// ---> 정수 연산
		
		String numberString3 = String.valueOf(number3);
		String numberString4 = String.valueOf(number4);
		
		System.out.println(numberString3 + numberString4);
		
		// 문자열 연산
		String numberString5 = number3 + "";
		String numberString6 = number4 + "";
		
		// 문자열 비교
		String word1 = "고양이";
		String word2 = "고양이";
		
		if(word1.equals(word2))
		{
			System.out.println("동일");
		}
	}
}
