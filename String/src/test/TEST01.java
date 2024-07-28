package test;

import java.util.Scanner;

public class TEST01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 문자열 출력
		
//		String str1 = "Oh";
//		String str2 = "My";
//		String str3 = "God";
//		
//		System.out.println(str1 + " " + str2 + " " + str3);
		
		// 2. 문자열 입력 
		
//		System.out.println("Welcome! id");
//		
//		System.out.println("ID를 입력 하세요 : ");
//		String str = scan.nextLine();
//		
//		System.out.println("Welcome! " + str);
		
		// 3. 문자열 배열
		
//		String str = "Why so serious";
//		
//		//String strTemp[] = str.split(" ", 3);
//		String strTemp[] = str.split(" ");
//		
//		for(int i = 0; i < strTemp.length; i++)
//		{
//			System.out.println(strTemp[i]);
//		}

		String str1 = scan.next();
		String str2 = scan.next();
		String str3 = scan.next();
	
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}

