package test;

import java.util.Scanner;

public class TEST03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 문자열 변환
		
//		String gradeString = "My grade is A";
//		
//		String grade[] = {};
//		
//		grade = gradeString.split("");
//		
//		for(int i = 0; i < grade.length; i++)
//		{
//			if(grade[i].equals("A"))
//			{
//				grade[i] = "B";
//			}
//		}
//		
//		for(int i = 0; i < grade.length; i++)
//		{
//			System.out.print(grade[i]);
//		}
		
//		-------------------------------------------------------------
		
//		String gradeString = "My grade is A";
//		
//		String replaceString = gradeString.replace("A", "B");
//		
//		System.out.println(replaceString);
		
		// 2. 문자열 자르기
		
//		String phoneNumber = "01012345678";
//		
//		System.out.println(phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 7) + "-" + 
//		phoneNumber.substring(7, phoneNumber.length()));
		
		// 3. 문자열 정수 변환
		
//		String birthString = "19950721";
//		String temp = birthString.substring(0,4);
//		int birth = 2024 - Integer.parseInt(temp);
//		
//		System.out.println(temp  + "년생의 나이는 " + birth + "살");
		
		
		// 4. 문자열 검색
		
//		System.out.println("단어를 입력하세요 : ");
//		String name = scan.nextLine();
//		
//		char[] charName = new char[name.length()];
//		int cnt = 0;
//		
//		for(int i = 0; i < name.length(); i++)
//		{
//			charName[i] = name.charAt(i);
//		}
//		
//		for(int i = 0; i < charName.length; i++)
//		{
//			if(charName[i] == 'e')
//			{
//				cnt++;
//			}
//		}
//				
//		System.out.println("e의 개수는 " + cnt + "개 입니다.");
		
		// 5. 단어 수 세기
		
//		String sentence = "To be, or Not to Be. That Is The Question";
//		String str1 = sentence.replace(",", "");
//		String str2 = str1.replace(".", "");
//		
//		String[] temp = str2.split(" ");
//		
//		System.out.println("단어 개수 : " + temp.length);
	}
}
