package test;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("정수를 입력 하세요 : ");
//		int num = scan.nextInt();
//		
//		if(num < 0)
//		{
//			System.out.println("움수 입니다.");
//		}
//		else if(num > 0)
//		{
//			System.out.println("양수 입니다.");
//		}
		
//		System.out.println("점수를 입력 하세요 : ");
//		int score = scan.nextInt();
//		
//		if(score >= 90)
//		{
//			System.out.println("A");
//		}
//		else if(score >=80 && score < 90)
//		{
//			System.out.println("B");
//		}
//		else if(score >= 70 && score < 80)
//		{
//			System.out.println("C");
//		}
//		else if(score >= 60 && score < 70)
//		{
//			System.out.println("D");
//		}
//		else
//		{
//			System.out.println("F");
//		}
		
//		System.out.println("1~7 사이의 날짜를 입력하세요 : ");
//		int day = scan.nextInt();
//		
//		switch(day)
//		{
//		case 1 : 
//			System.out.println("수요일");
//			break;
//		case 2 : 
//			System.out.println("목요일");
//			break;
//		case 3 : 
//			System.out.println("금요일");
//			break;
//		case 4 : 
//			System.out.println("토요일");
//			break;
//		case 5 : 
//			System.out.println("일요일");
//			break;
//		case 6 : 
//			System.out.println("월요일");
//			break;
//		case 7 : 
//			System.out.println("화요일");
//			break;
//		default :
//		}
		
//		int num[] = new int[3];
//		
//		for(int i = 0;i < num.length;i++)
//		{
//			num[i] = scan.nextInt();
//		}
//		
//		for(int i = 0;i < num.length;i++)
//		{
//			if(num[i] % 2 == 0)
//			{
//				System.out.println(num[i] + "는 짝수 입니다.");
//			}
//			else
//			{
//				System.out.println(num[i] + "는 홀수 입니다.");
//			}
//		}
		
//		System.out.println("bmi 수치를 입력 하세요 : ");
//		int bmi = scan.nextInt();
//		
//		if(bmi <= 10)
//		{
//			System.out.println("정상");
//		}
//		else if(bmi <= 20 && bmi > 10)
//		{
//			System.out.println("과체중");
//		}
//		else if(bmi > 20)
//		{
//			System.out.println("비만");
//		}
		
//		int score[] = new int[2];
//		
//		int avg = 0;
//		
//		System.out.println("두 점수를 입력 하세요 : ");
//		for(int i = 0;i < score.length;i++)
//		{
//			score[i] = scan.nextInt();
//			avg += score[i];
//		}
//			
//		if(avg >= 70)
//		{
//			System.out.println("합격");
//		}
//		else
//		{
//			System.out.println("불합격");
//		}
		
//		int num[] = new int[3];
//		
//		int max = 0;
//		
//		for(int i = 0;i < num.length;i++)
//		{
//			num[i] = scan.nextInt();
//			if(max < num[i])
//			{
//				max = num[i];
//			}
//		}
//		
//		System.out.println("max : " + max);
		
//		int month = 0;
//		
//		System.out.println("월을 입력 하세요 : ");
//		
//		month = scan.nextInt();
		
//		if(month == 3 || month == 4 || month == 5)
//		{
//			System.out.println("봄");
//		}
//		else if(month == 6 || month == 7 || month == 8)
//		{
//			System.out.println("여름");
//		}
//		else if(month == 9 || month == 10 || month == 11)
//		{
//			System.out.println("가을");
//		}
//		else if(month == 12 || month == 1 || month == 2)
//		{
//			System.out.println("겨울");
//		}
		
//		switch(month)
//		{
//		case 3,4,5 : 
//			System.out.println("봄");
//			break;
//		case 6,7,8 : 
//			System.out.println("여름");
//			break;
//		case 9,10,11 : 
//			System.out.println("가을");
//			break;
//		case 12,1,2 : 
//			System.out.println("겨울");
//			break;
//		}
		
//		int score[] = new int[2];
//		int avg = 0;
//		
//		int result = 0;
//		
//		System.out.println("점수 입력 : ");
//		
//		for(int i = 0;i < 2;i++)
//		{
//			score[i] = scan.nextInt();
//			avg += score[i];
//			avg /= 2;
//		}
//		
//		
//		for(int i = 0;i < score.length;i++)
//		{
//			if(avg >= 60)
//			{
//				result = 1;
//			}
//			else if(score[i] <= 50)
//			{
//				result = 2;
//			}
//			else if(avg < 60)
//			{
//				result = 3;
//			}
//		}
//		
//		if(result == 1)
//		{
//			System.out.println("합격");
//		}
//		else if(result == 2)
//		{
//			System.out.println("과락");
//		}
//		else if(result == 3)
//		{
//			System.out.println("불합격");
//		}
		
//		System.out.println("연도 : ");
//		int year = scan.nextInt();
//		
//		if(year % 4 == 0 || year % 400 == 0)
//		{
//			System.out.println("윤년");
//		}
//		else if(year % 100 == 0)
//		{
//			System.out.println("윤년이 아니다.");
//		}
		
//		int player1 = 0;
//		int player2 = 0;
//		
//		
//		System.out.println("영희 공격 : ");
//		player1 = scan.nextInt();
//		
//		
//		System.out.println("철수 공격 : ");
//		player2 = scan.nextInt();
//		
//		if((player1 == 1) && (player2 == 1))
//		{
//			System.out.println("비겼다.");
//		}
//		else if((player1 == 1) && (player2 == 2))
//		{
//			System.out.println("철수가 이겼다.");
//		}
//		else if((player1 == 1) && (player2 == 3))
//		{
//			System.out.println("영희가 이겼다");
//		}
//		else if((player1 == 2) && (player2 == 1))
//		{
//			System.out.println("영희가 이겼다.");
//		}
//		else if((player1 == 2) && (player2 == 2))
//		{
//			System.out.println("비겼다.");
//		}
//		else if((player1 == 2) && (player2 == 3))
//		{
//			System.out.println("철수가 이겼다");
//		}
//		else if((player1 == 3) && (player2 == 1))
//		{
//			System.out.println("철수가 이겼다.");
//		}
//		else if((player1 == 3) && (player2 == 2))
//		{
//			System.out.println("영희가 이겼다.");
//		}
//		else if((player1 == 3) && (player2 == 3))
//		{
//			System.out.println("비겼다.");
//		}
		
//		System.out.println("시간 분 입력 : ");
//		int hour = scan.nextInt();
//		
//		int min = scan.nextInt();
//		
//		min -= 45;
//		
//		if(min < 0)
//		{
//			min += 60;
//			hour--;
//		}
//		
//		if(hour < 0)
//		{
//			hour += 24;
//		}
//		
//		System.out.println(hour + "시" + min + "분");
		
		System.out.println("윷 상태를 입력하세요 : ");
		
		int sel[] = new int[4];
		int cnt = 0;
		
		for(int i = 0;i < sel.length;i++)
		{
			sel[i] = scan.nextInt();
		}
		
		for(int i = 0;i < sel.length;i++)
		{
			if(sel[i] == 1)
			{
				cnt++;
			}
		}
		
		if(cnt == 0)
		{
			System.out.println("모");
		}
		else if(cnt == 1)
		{
			System.out.println("도");
		}
		else if(cnt == 2)
		{
			System.out.println("개");
		}
		else if(cnt == 3)
		{
			System.out.println("걸");
		}
		else if(cnt == 4)
		{
			System.out.println("윷");
		}
	}
}
