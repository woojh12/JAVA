package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
public static final Map<String, String> capitalMap = new HashMap<String, String>() {
	        {
	            put("대한민국", "서울");
	            put("덴마크", "코펜하겐");
	            put("독일", "베를린");
	            put("러시아", "모스크바");
	            put("벨기에", "브뤼셀");
	            put("브라질", "브라질리아");
	            put("스웨덴", "스톡홀름");
	            put("스위스", "베른");
	            put("스페인", "마드리드");
	            put("아르헨티나", "부에노스아이레스");
	            put("이집트", "카이로");
	            put("이란", "테헤란");
	            put("이탈리아", "로마");
	            put("일본", "도쿄");
	            put("필리핀", "마닐라");
	            put("핀란드", "헬싱키");
	            put("프랑스", "파리");
	            put("터키", "앙카라");
	            put("캐나다", "오타와");
	            put("콜롬비아", "보고타");
	        }
};
	public static void main(String[] args) {
//-------------------------------------------------------------------
//		1. 이씨 찾기
		Map<String, String> memberMap = new HashMap<>();
//		Map<String, Character> nameMap = new HashMap<>();		// Char형
		memberMap.put("유재석", "X");
		memberMap.put("박나래", "X");
		memberMap.put("이지은", "X");
		memberMap.put("서장훈", "X");
		memberMap.put("이광수", "X");
		
		Set<String> keyset = memberMap.keySet();
		for(String name:keyset)
		{
			String value = memberMap.get(name);
			if(name.subSequence(0,1).equals("이"))
			{
				value = "O";
				memberMap.put(name, value);
			}
		}
		System.out.println(memberMap);
		
//-------------------------------------------------------------------		
		
//-------------------------------------------------------------------	
//		2. 수도 맞추기 게임
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

	    Set<String> keys = capitalMap.keySet();
	    List<String> keyList = new ArrayList<>(keys);
//	    int score = 0;
//	    
//	    int randomNum[] = new int[5];
//	    for(int i = 0; i < 5; i++)
//	    {
//	    	randomNum[i] = rand.nextInt(20);
//	    	
//	    	for(int j = 0; j < i; j++)
//	    	{
//	    		if(randomNum[i] == randomNum[j])
//	    		{
//	    			i--;
//	    		}
//	    	}
//	    }
//	    
//	    for(int i = 0; i < 5; i++)
//	    {
//	    	System.out.print(keyList.get(randomNum[i]) + "의 수도 이름은 ?");
//	     	String answer = scan.nextLine();
//	     	String str = capitalMap.get(keyList.get(randomNum[i]));
//	     	if(answer.equals(str))
//	     	{
//	     		score += 20;
//	     	}
//	    }
//	
//	    System.out.println("총 점수는 : " + score);

	    //---------------------------OR---------------------------
	    int score = 0;
	    for(int i = 0; i < 5; i++)
	    {
	    	int randomIndex = rand.nextInt(keyList.size());
	    	
	    	String country = keyList.get(randomIndex);
	    	System.out.println(country + "의 수도 이름은?");
	    	String answer = scan.nextLine();
	    	String capital = capitalMap.get(country);
	    	if(answer.equals(capital))
	    	{
	    		System.out.println("정답입니다.");
	    		score += 20;
	    	}
	    	else
	    	{
	    		System.out.println("틀렸습니다.");
	    	}	    	
	    }
	    System.out.println("총점 : " + score);
	    
//-------------------------------------------------------------------
	}
}
