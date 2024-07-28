package ex;

public class EX03 {
	public static void main(String[] args) {
		
		String text = "Hello";
		
		
		// 문자열 길이 구하기
		int length = text.length();
		
		System.out.println(text + "의 길이 : " + length);
		
		// 특정 위치 문자 구하기
		char alphabet = text.charAt(1);
		System.out.println(alphabet);
		
		// 문자열을 문자들을 통해서 출력
		for(int i = 0; i < text.length(); i++)
		{
			System.out.print(text.charAt(i));
		}
		System.out.println();
		
		// 문자열 자르기
		String part = text.substring(0, 3);
		
		// 특정 문자열로 시작. 끝나는지 확인
		String name = "가나다";
		
		boolean tempName1 = name.startsWith("가");
		System.out.println(tempName1);
		
		if(name.startsWith("가"))
		{
			System.out.println("가");
		}
		
		// 이름 확인
		if(name.endsWith("나다"))
		{
			System.out.println("이름 확인");
		}
	
		// 문자열 일부 바꾸기
		String newName = name.replace("가", "가가");
		System.out.println(newName);
		
		// 문자열 쪼개기
		String members = "abc,def,ghe,jjjj";
		
		String temp[] = members.split(",");
		
		for(int i = 0; i < temp.length; i++)
		{
			System.out.println(temp[i]);
		}
	}
}
