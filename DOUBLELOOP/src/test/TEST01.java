package test;

import java.util.Scanner;

public class TEST01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 주사위 문제
//		for(int i = 1;i < 7;i++)
//		{
//			for(int j = 1;j < 7;j++)
//			{
//				System.out.print("(" + i + ", " + j + ") ");
//			}
//			System.out.println();
//		}
		
		// 2. 구구단
//		for(int i = 2;i < 10;i++)
//		{
//			for(int j = 1;j < 10;j++)
//			{
//				System.out.println(i + " X " + j + " = " + (i * j));
//			}
//		}
		
		// 별찍기 1
//		for(int i = 1;i < 6;i++)
//		{
//			for(int j = 0;j < i;j++)
//			{
//				System.out.print("＊");
//			}
//			System.out.println();
//		}
		
//		// 별찍기 2
//		for(int i = 5;i > 0;i--)
//		{
//			for(int j = 0;j < i;j++)
//			{
//				System.out.print("＊");
//			}
//			System.out.println();
//		}
		
		// 별찍기 3

//		for(int i = 4;i >= 0;i--)
//		{
//			for(int j = 1;j <= i;j++)
//			{
//				System.out.print(" ");
//			}			
//			System.out.print("*");
//			
//			for(int j = 4;j >= (i+1);j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 별찍기 4

//		for(int i = 4;i >= 0;i--)
//		{
//			for(int j = 1;j <= i;j++)
//			{
//				System.out.print(" ");
//			}			
//			System.out.print("*");
//			
//			for(int j = 4;j >= (i + 1);j--)
//			{
//				System.out.print("*");
//			}
//			
//			for(int j = 4;j >= (i + 1);j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 1. 구구단
//		System.out.print("단수 범위를 입력하세요 : ");
//		int dan = scan.nextInt();
//		int su = scan.nextInt();
//		
//		for(int i=dan;i<=su;i++)
//		{
//			for(int j = 1;j < 10;j++)
//			{
//				System.out.println(i + " X " + j + " = " + (dan * su));
//			}
//		}
		
		// 2. 별찍기
		
//		int num = 0;
//		int line = 0;
//		System.out.println("출력할 줄 수를 입력하세요 : ");
//		line = scan.nextInt();
//		
//		int temp = line;
//		
//		for(int i = 7;i > 0;i--)
//		{
//			for(int j = 1;j <= i;j++)
//			{
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			
//			for(int j = 0;j <= (2 * num) - 1; j++)
//			{
//				System.out.print("*");
//			}
//			num++;
//			System.out.println();
//			
//			if(num == temp)
//			{
//				break;
//			}
//		}
		
		// 3. 모래시계 출력하기
		
//		int line = 0;
//		System.out.println("모래시계 크기를 입력하세요 : ");
//		line = scan.nextInt();
//		
//		for(int i = 1;i < line + 1;i++)
//		{
//			for(int j = 1;j < line + 1; j++)
//			{
//				if((j % 2 == 1) && ((i % 2 == 1)))
//				{
//					System.out.print("*");
//				}
//				else if((j % 2 == 0) && ((i % 2 == 0)))
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
	}
}
