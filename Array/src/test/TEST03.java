package test;

import java.util.Random;
import java.util.Scanner;

public class TEST03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		// 1. 위치 변경(swap)
		
//		int[] numbers = {3, 5, 2, 10, 39};
//		
//		System.out.println("두 개의 index를 입력 하세요 : ");
//		int idx1 = scan.nextInt();
//		int idx2 = scan.nextInt();
//		
//		for(int i = 0;i < numbers.length;i++)
//		{
//			for(int j = 0;j < numbers.length;j++)
//			{
//				if(((i + 1) == idx1) &&((j + 1) == idx2))
//				{
//					int temp = 0;
//					
//					temp = numbers[idx1];
//					numbers[idx1] = numbers[idx2];
//					numbers[idx2] = temp;
//				}
//			}
//		}
//		
//		for(int i = 0;i < numbers.length;i++)
//		{
//			System.out.print(numbers[i] + " ");
//		}
//		
//		System.out.println();
		
		// 2. 셔플
		
//		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for (int i = 0; i < 100; i++) {
//		    int randomNumber = rand.nextInt(10);
//		    
//		    int temp = 0 ;
//		    temp = arr[0];
//		    arr[0] = arr[randomNumber]; 
//		    arr[randomNumber] = temp; 
//		}
//		
//		for(int i = 0;i < arr.length;i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		
		// 3. 없는 수 찾기
		
//		int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
//		int[] cnt = new int[10];
//		int number = 0;
//		
//		for(int i = 0;i < cnt.length;i++)
//		{
//			cnt[i] = 0;
//		}
//			
//		for(int i = 0;i < numbers2.length;i++)
//		{
//			for(int j = 1; j< 10; j++)
//			{
//				if(numbers2[i] == j)
//				{
//					cnt[j] = numbers2[i];
//				}
//				else
//				{
//					number = i;
//				}
//			}
//		}
//		
//		System.out.println("없는 수는 " + number + " 입니다.");
		
		// 4. 빈도수 구하기
		
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int [] cnt = new int[5];
		
		for(int i = 0; i < cnt.length; i++)
		{
			cnt[i] = 0;
		}
		
		for(int i = 0; i < numbers3.length; i++)
		{
			for(int j = 1;j < 6;j++)
			{
				if(numbers3[i] == j)
				{
					cnt[j-1]++;
				}
			}
		}
		
		for(int i = 0;i < cnt.length; i++)
		{
			System.out.println((i+1) + " : " + cnt[i]);
		}
		
	}
}
