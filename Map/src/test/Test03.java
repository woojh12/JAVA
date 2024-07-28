package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
//--------------------------------------------------------------------
//		  1. 책이름으로 작가명 찾기
		  Map<String, Map<String, String>> bookMap = new HashMap<>();

		  Map<String, String> map1 = new HashMap<>();
	      map1.put("더 해빙", "이서윤,홍주연");
	      map1.put("말 그릇", "김윤나");
	      map1.put("메모의 마법", "마에다 유지");

	      Map<String, String> map2 = new HashMap<>();
	      map2.put("어린왕자", "생텍쥐페리");
	      map2.put("아몬드", "손원평");
	      map2.put("나미야 잡화점의 기적", "히가시노 게이고");
	      map2.put("해변의 카프카", "무라카미 하루키");

	      Map<String, String> map3 = new HashMap<>();
	      map3.put("시간은 흐르지 않는다", "카를로 로벨리");
	      map3.put("코스모스", "칼 세이건");
	      map3.put("평행우주", "미치오 카쿠");

	      bookMap.put("자기계발", map1);
	      bookMap.put("소설", map2);
	      bookMap.put("과학", map3);
	      System.out.println(bookMap);

	      // 책 이름 입력
	      Scanner scan = new Scanner(System.in);
	      System.out.print("책이름을 입력해주세요: ");
	      String searchBook = scan.nextLine();
	      
//	      Set<String> keySet = bookMap.keySet();
//	      
//	      for(String id:keySet)
//	      {
//	    	 Map<String, String> key = bookMap.get(id);
//
//	    	 String value = key.get(searchBook);
//	    	 if(key.containsKey(searchBook))
//	    	 {
//	    		 System.out.println(value);
//	    		 break;
//	    	 }
//	    	 System.out.println(key);
//	      }
	      
	      Set<String> genreSet = bookMap.keySet();
	      
	      for(String genre:genreSet)
	      {
	    	  Map<String, String> authorMap = bookMap.get(genre);
	    	  if(authorMap.containsKey(searchBook))
	    	  {
	    		  String author = authorMap.get(searchBook);	    		  
	    		  System.out.println(author);
	    	  }
	      }
	}
}
