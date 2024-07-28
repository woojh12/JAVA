package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
//-----------------------------------------------------
//      1. 자료 입력
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		
		map.put("국어", 90);
		map.put("수학", 85);
		map.put("영어", 90);
		map.put("사회", 80);
		map.put("과학", 100);
		
		System.out.println(map);
//-----------------------------------------------------
//		2. 값 수정 
//		map.put("사회", 85);
		int score = map.get("사회");
		map.put("사회", score + 5);
		System.out.println(map);
		//-----------------------------------------------------
//		3. 값 찾기
		System.out.print("조회 할 과목명을 입력하세요 : ");
		String search = scan.nextLine();
		int name = map.get(search);
		System.out.println(name);
		//-----------------------------------------------------	
//		4. 값 찾기
		Set<String> keyset = map.keySet();
		for(String num:keyset)
		{
			int value = map.get(num);
			
			if(value >= 90)
			{
				System.out.println(num);
			}
		}
		//-----------------------------------------------------
//		5. 값 확인
		for(String num:keyset)
		{
			int value = map.get(num);
			
			if(value == 100)
			{
				System.out.println("수상가능");
			}
		}
	}
}
