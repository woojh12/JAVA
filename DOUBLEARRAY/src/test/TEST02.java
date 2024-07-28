package test;

import java.util.Scanner;

public class TEST02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 10 입력하기
		
//		int arr[][] = new int[2][3];
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				arr[i][j] = 10;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		System.out.println();
		
		// 2. 순서대로 입력하기
		
//		int num1 = 3;
//		int num2 = 4;
//		
//		int arr[][] = new int[num1][num2];
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				arr[i][j] = (j + 1);
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
		
		
		// 3. 배열 별로 입력하기
		
//		int arr[][] = new int[3][3];
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				arr[i][j] = (i + 1);
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
		
		
		// 4. +자 그리기 
		
//		int maxArrnum = 5;
//		
//		int arr[][] = new int[maxArrnum][maxArrnum];
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				arr[i][j] = 0;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				if((j == 2) || (i == 2))
//				{
//					arr[i][j] = 1;
//				}
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		// 5. 전체 수 입력
		
//		int maxArr = 3;
//		int num = 1;
//		
//		int arr[][] = new int[maxArr][maxArr];
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				arr[i][j] = num;
//				num++;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// 6. 전체 수 입력 
						
		int maxArr = 3;
		
		int arr[][] = new int[maxArr][maxArr];
		int val = 1;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[j][i] = val;
				val ++;
 			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
