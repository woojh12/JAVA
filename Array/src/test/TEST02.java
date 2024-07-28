package test;
import java.util.Scanner;

public class TEST02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 배열 값 변경
		
//		int numbers[] = {3, 5, 2, 10, 39};
//
//		int index = 0;
//		int val = 0;
//		
//		System.out.print("변경할 index와 값을 입력하세요 : ");
//		index = scan.nextInt();
//		val = scan.nextInt();
//		
//		for(int i = 0;i < numbers.length;i++)
//		{
//			if(index == i)
//			{
//				numbers[i] = val;
//			}
//		}
//		
//		for(int i = 0;i < numbers.length;i++)
//		{
//			System.out.print(numbers[i] + " ");
//		}
//		
//		System.out.println();
		
		// 2. 점수 체점
		
//		char[] scores = {'X','O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//		int score = 0;
//		
//		for(int i = 0;i < scores.length;i++)
//		{
//			if(scores[i] == 'O')
//			{
//				score += 10;
//			}
//		}
//		
//		System.out.println("채점 결과는 " + score + "점 입니다.");
//		
//		System.out.println();
		
		// 3. 임금 계산
		
//		int[] works = {3, 5, 5, 3, 5, 3, 5};
//		int money = 0;
//		
//		for(int i = 0;i < works.length;i++)
//		{
//			if(((i + 1) == 6) || ((i + 1) == 7))
//			{
//				money = money + works[i] * 9500;
//			}
//			else
//			{
//				money = money + works[i] * 8500;
//			}
//		}
//		
//		System.out.println("일주일간 총 임금은 : " + money + "원 입니다.");
		
		// 4. 배열 값 입력 
		
		int arr[] = new int[5];
		int idx = 0;
		while(true)
		{
			System.out.print("수를 입력하세요 : ");
			int num = scan.nextInt();
			
			if(num % 2 == 0)
			{
				arr[idx] = num;
				System.out.println("arr[" + idx + "] : " + arr[idx]);
				idx++;
				
				System.out.println("idx : " + idx);
			}
			
			if(idx >= 5)
			{
				break;
			}
		}
		
		System.out.println();
		
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
}
