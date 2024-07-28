package test;

import java.util.Scanner;

public class TEST02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 정수 문자열 변환
//		int year = 2000;
//		int month = 11;
//		int day = 15;
//		
//		String result = "";
//		result = Integer.toString(year) + Integer.toString(month) + Integer.toString(day);
//		
//		System.out.println(result);
		
		// 2. 문자열 정수 변환
		
//		String yearString = "1995";
//		
//		int year = Integer.parseInt(yearString);
//		
//		System.out.println(yearString + "년생의 나이는 " + (2024 - year) + "살");
		
		// 3. 개수 세기
		
		String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};
		
		System.out.println("제품명 : ");
		String food = scan.nextLine();
		int cnt = 0;
		
		for(int i = 0; i < goods.length; i++)
		{
			if(food.equals(goods[i]))
			{
				cnt++;
			}
		}
		
		System.out.println(cnt + "개");
	}
}
