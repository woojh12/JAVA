package ex;

public class EX02 {
	
	public static void main(String[] args) {
		int result = getCandyPrice(5);
		System.out.println("츄파춥스 결과 : " + result);
		
		result = addNumbers(5,6);
		System.out.println("두개의 수 결과 : " + result);
	}
	
	// 츄파춥스의 개수에 따라 가격 계산 기능
	public static int getCandyPrice(int count)
	{
		int result = 250 * count;
		return result;
	}
	
	// 두개의 수를 더해주는 함수
	public static int addNumbers(int x, int y)
	{
		return x + y;
	}
}
