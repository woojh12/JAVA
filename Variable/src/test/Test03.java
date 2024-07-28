package test;

import java.util.Scanner;

public class Test03 {
	public static void main(String args[])
	{
		// ctrl + shift + o : 모든 기능 import
		Scanner scan = new Scanner(System.in);
//		int age = 0;
//		String name = "aaa";
//		System.out.println("나이를 입력하세요 : ");
//		age = scan.nextInt();
//		
//		System.out.println("이름 : " + name + " 나이 : " + age);

//		System.out.println("두 수를 입력 하세요 : ");
//		int num1, num2 = 0;
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
//		System.out.println("두 수를 입력 하세요 : ");
//		int num1, num2 = 0;
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		
//		System.out.println(num1 + " +-" + num2 + " = " + (num1 - num2));
		
//		System.out.println("단수를 입력 하세요 : ");
//		int num = scan.nextInt();
//		
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(num + " X " + (i + 1) + " = " + (num * (i + 1)));
//		}
		
//		System.out.println("지름을 입력하세요 : ");
//		double pi = 3.14;
//		double len = scan.nextDouble();
//		
//		double result = (0.5 * len) *  pi * (0.5 * len);
//		
//		System.out.print("원의 넓이는 ");
//		System.out.printf("%.2f", result);
//		System.out.println(" 입니다.");
		
//		System.out.println("입력1 : ");
//		System.out.println("입력2 : ");
//		
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//
//		System.out.println("덧셈 : " + (num1 + num2));
//		System.out.println("뺄셈 : " + (num1 - num2));
//		System.out.println("곱셈 : " + (num1 * num2));
//		System.out.println("나눗셈 : " + (num1 / num2));
	
//		System.out.println("입력1 : ");
//		System.out.println("입력2 : ");
//		
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		System.out.print("몫 : " + (num1/num2));
//		System.out.print("나머지 : " + (num1%num2));
		
//		int len = scan.nextInt();
//		System.out.println("길이 : " + len);
//		
//		int result = len * len;
//		
//		System.out.println("정사각형의 넓이 : " + result);
		
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		System.out.println("밑변 : " + num1);
//		System.out.println("높이 : "  + num2);
//		
//		double result = num1 * num2 * 0.5;
//		
//		System.out.println("삼각형의 넓이 : " + result);
		
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		System.out.println("x : " + num1);
//		System.out.println("y : " + num2);
//		
//		int temp = 0;
//		temp = num1;
//		num1 = num2;
//		num2 = temp;
//		
//		System.out.println("x : " + num1 + " y : " + num2);
		
//		int time = scan.nextInt();
//		int num1 = time / 60;
//		int num2 = time % 60;
//		System.out.println("초 : " + time);
//		
//		System.out.println(num1 + "분 " + num2 + "초");
		
//		int num = scan.nextInt();
//		
//		System.out.println(num/1000);
//		System.out.println((num%1000)/100);
//		System.out.println((num%100)/10);
//		System.out.println((num%10));
		
		int num = scan.nextInt();
		
		int num1 = ((num%10));
		int num2 = ((num%100)/10);
		int num3 = ((num%1000)/100);
		int num4 = (num/1000);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		int result = (num1 * 1000) + (num2 * 100) + (num3 * 10) + num4;
		
		System.out.println(result);
		
//		int num = scan.nextInt();
//		
//		int num1 = (num/1000);
//		int num2 = ((num%1000)/100);
//		int num3 = ((num%10));
//		int num4 = ((num%100)/10);
//		
//		int result = num1 + num2 + num3 + num4;
//		
//		System.out.println("합계는 : " + result + " 입니다.");
		
//		int num = scan.nextInt();
//		
//		int num1 = (num/100);
//		int num2 = ((num%100)/10);
//		int num3 = ((num%10));
//	
//		int result = (num3 * 100) + (num2 * 10) + num1;
//		
//		System.out.println(result);
	}
}
