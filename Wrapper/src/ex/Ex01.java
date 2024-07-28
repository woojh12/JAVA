package ex;

public class Ex01 {
	public static void main(String[] args) {
		int number1 = 10;
		Integer number2 = 10;
		
		double number3 = 3.0;
		Double number4 = 3.0;
		
		Integer number5 = 100;
		Integer number6 = 100;
		
		if(number5 == number6)
		{
			System.out.println("두 수는 같다!");
		}
		
		//  deprecated : 사용하지 말라는 경고(곧 사라짐)
		Integer number7 = new Integer(100);
		
		
		if(number5 == number7)
		{
			System.out.println("두스는 같다@@");
		}
		
		if(number5.equals(number7))
		{
			System.out.println("두수는 같다##");
		}
		
		int number8 = 100;
		if(number8 == number7)
		{
			System.out.println("두수는 같다$$$");
		}
		
	}
}
