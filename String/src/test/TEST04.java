package test;

import java.util.Scanner;

public class TEST04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 문자열 검색
		
//		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		
//		String[] temp = new String[files.length];
//		
//		int cnt = 0;
//		
//		for(int i = 0; i < temp.length; i++)
//		{
//			temp[i] = files[i];
//		}
//		
//		for(int i = 0; i < temp.length; i++)
//		{
//			temp[i] = temp[i].substring(temp[i].length() - 3, temp[i].length());
//		}
//		
//		for(int i = 0; i < temp.length; i++)
//		{
//			if(temp[i].equals("jpg"))
//			{
//				cnt++;
//			}
//		}
//		
//		System.out.println("jpg 파일 개수 : " + cnt);
		
		// 2. 영 단어 퀴즈
//		int score = 0;
//		int start = 0;
//		String test = "";
//		
//		String[] str = {"승리", "사랑", "컴퓨터", "노트북"};
//		String[] ans = {"victory", "love", "computer", "notebook"};
//		
//		while(start < 4)
//		{
//			System.out.println((start + 1) + str[start] + "를(을) 영어로 입력하세요 : ");
//			System.out.println();
//			test = scan.nextLine();
//			
//			if(test.equals(ans[start]))
//			{
//				score += 25;
//			}
//			start++;
//		}
//		
//		System.out.println("점수는 " + score + "점입니다.");
		
		
		// 3. 문자열 검색
		
//		String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
//		
//		String temp[] = membersString.split(":");
//		String tempName[] = temp;
//		
//		int cnt = 0;
		
		
//		for(int i = 0; i < temp.length; i++)
//		{
//			for(int j = (i + 1);j < tempName.length; j++)
//			{
//				if(temp[i].equals(tempName[j]))
//				{
//					//System.out.print("i : " + i + " j : " + j + "\t" + temp[i] + tempName[j]);
//					cnt++;
//				}
//				//System.out.println();
//			}
//		}
//		
//		System.out.println("동명 수 : " + cnt);
		
//		for(int i = 0;i < temp.length;i++)
//		{
//			String target = temp[i];
//			
//			for(int j = i + 1; j < temp.length;j++)
//			{
//				if(target.equals(temp[j]))
//				{
//					cnt++;
//				}
//			}
//		}
//		
//		System.out.println(cnt);
		
//		----------------------------------------------------------------
		
		String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재:송강호:이민정";
		String[] names = membersString.split(":");
		
		int count = 0;
		
		for(int i = 0; i < names.length; i++)
		{
			String target = names[i];
			
			if(target.equals("V"))
			{
				continue;
			}
			boolean isFind = false;
			for(int j = i + 1; j <names.length; j++)
			{
				if(target.equals(names[j]))
				{
					isFind =true;
					names[j] = "V";
				}
			}
			if(isFind)
			{
				count++;				
			}
		}		
		System.out.println(count);
	}
}

