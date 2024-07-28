package ex;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		// 몸무게가 70kg이 넘지 않는다면 치킨을 먹자
//		
//		int weight = 0;
//		
//		weight = scan.nextInt();
//		
//		if(weight <= 70)
//		{
//			System.out.println("치킨을 먹자");
//		}
//		else
//		{
//			
//		}
		
		int weight = 0;
		weight = scan.nextInt();
		
		if(weight > 80)
		{
			System.out.println("다이어트 시작");
		}
		else if(weight <= 60)
		{
			System.out.println("폭식");
		}
		else if(weight == 68)
		{
			System.out.println("목표 달성!!");
		}
		else if(weight == 72)
		{
			System.out.println("72가 아니네?");
		}
		
		// if 조건 () 안에는 true 혹은 false 라는 값만 들어 갈 수 있다. 
		if(true)
		{
			System.out.println("조건이 맞다!");
		}
		
		// 비교 연산은 연산이다!
		// 비교 연산의 결과는 true 혹은 false 이다.
		System.out.println(weight <= 70);
		
		boolean result1 = true;
		boolean result2 = weight < 60;
		
		if(result2)
		{
			System.out.println("폭식!!!!!!!");
		}
		
		// 변수 끼리 비교 연산
		int number1 = 5;
		int number2 = 10;
		
		if(number1 < number2)
		{
			System.out.println("number2가 더 크다!");
		}
	}
}
