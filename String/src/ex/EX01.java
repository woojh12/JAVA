package ex;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String text1 = "Hello World";
		// 문자열 연산
		int number = 10;
		
		System.out.println("Hello " + number);
		System.out.println(text1 + " " + number);
		
		String text2 = "!!!";
		
		String newText = text1 + text2;
		
		String input1 = scan.next();
		String input2 = scan.next();
		
		System.out.println(input1 + input2);
		
		scan.nextLine();		// \n 개행문자 제거용
		
		System.out.println("문자열을 입력하세요 : ");
		String lineInput = scan.nextLine();
		
		System.out.println(lineInput);
		
		// 문자열 배열 
		String[] texts = {"apple", "bear", "car"};
		
		for(int i = 0; i < texts.length; i++)
		{
			System.out.println(texts[i]);
		}
	}
}
