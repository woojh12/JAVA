package test;

import java.util.Scanner;

public class TEST01 {
	public static int getSquared(int x)
	{
		return x * x;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4)
	{
		int total = score1 + score2 + score3 + score4;
		double avg = total / 4.0;
		
		return avg;
	}
	
	public static void printQuotientRemainder(int number1, int number2)
	{
		int num1 = number1 / number2;
		int num2 = number1 % number2;
		
		System.out.println("몫 : " + num1);
		System.out.println("나머지 : " + num2);
	}
	
	public int checkNum(int num)
	{
		int result = 3;
		if(num % 2 == 0)
		{
			result = 0;
		}
		else if(num % 2 == 1)
		{
			result = 1;
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 2의 제곱 함수
		
//		System.out.println("제곱값을 구할 숫자를 입력하세요 : ");
//		int num = scan.nextInt();
//		int ans1 = getSquared(num);
//		
//		System.out.println(num + "의 제곱은 " + ans1 + "이다.");
		
		// 2. 평균 구하기 함수
		
//		System.out.println("점수를 입력하세요 : ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		int score3 = scan.nextInt();
//		int score4 = scan.nextInt();
//		
//		double result  = getAverage(score1, score2, score3, score4);
//		
//		System.out.println("평균은 : " + result);
		
		// 3. 몫과 나머지 출력 함수
		
//		System.out.println("숫자와 나눌 수를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		printQuotientRemainder(num1, num2);
		
		// 4. 홀짝 함수
		
		TEST01 test01 = new TEST01();
		
		System.out.println("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		int result = test01.checkNum(num);
		
		System.out.println(result);
	}
}
