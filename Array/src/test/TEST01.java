package test;

import java.util.Scanner;

public class TEST01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 배열 값 접근
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		for(int i = 0;i < 8;i++)
		{
			if(i == 3)
			{
				numbers[i] = 6;
			}
		}
		
		// 2. 배열 출력
//		for(int i=0;i<numbers.length;i++)
//		{
//			System.out.print(numbers[i] + " ");
//		}
//		
//		System.out.println();
//				
//		// 3. 배열 출력(역순)
//		int temp[] = new int[8];
//		int num = 0;
//		
//		for(int i = 7;i >= 0;i--)
//		{
//			temp[num] = numbers[i];
//			num++;
//		}
//		
//		for(int i = 0;i <temp.length;i++)
//		{
//			System.out.print(temp[i] + " ");
//		}
//		
//		System.out.println();
//		
//		// 4. 배열 출력(짝수번째)
//		for(int i = 0;i < numbers.length;i++)
//		{
//			if((i+1) % 2 == 0)
//			{
//				System.out.print(numbers[i] + " ");
//			}
//		}
		
//		System.out.println();
		
//		// 5. index
//		
//		for(int i = 0;i < numbers.length;i++)
//		{
//			if(numbers[i] == 2)
//			{
//				System.out.print(i);
//			}
//		}
//		
//		System.out.println();
		
		// 6. 최대값
		
//		int max = numbers[0];
//		for(int i = 0;i < numbers.length;i++)
//		{
//			if(numbers[i] > max)
//			{
//				max = numbers[i];
//			}
//		}
//		
//		System.out.println("가장 큰 값 : " + max);
//		
//		System.out.println();
		
		// 7. 최소값 index
		
//		int min = numbers[0];
//		int index = 0;
//		for(int i = 0;i < numbers.length;i++)
//		{
//			if(numbers[i] < min)
//			{
//				min = numbers[i];
//				index = i;
//			}
//		}
//		
//		System.out.println("최소값의 index : "  + index);
//		System.out.println();
		
		// 8. 합계 
		
		int total = 0;
		
		for(int i = 0;i < numbers.length;i++)
		{
			total += numbers[i];
		}
		
		System.out.println("값의 합 : " + total);
	}
}
