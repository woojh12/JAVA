package ex;

public class EX03 {
	public static void main(String args[])
	{
//		int weight = 72;
//		// 몸무게가 70이하면 치킨 먹자 그렇지 않으면 샐러드 먹자
//		
//		if(weight <= 70)
//		{
//			System.out.println("치킨먹자");
//		}
//		else
//		{
//			System.out.println("샐러드먹자");
//		}
//		
//		// 몸무게가 70이하면 치킨먹자
//		// 그렇지 않고 만약에 75이하면 닭가슴살 먹자
//		// 그렇지 않고 만약에 80이하면 샐러드 먹자
//		// 그렇지 않으면 굶어
//		
//		if(weight <= 70)
//		{
//			System.out.println("치킨먹자");
//		}
//		else if(weight <= 75 && weight > 70)
//		{
//			System.out.println("닭가슴살먹자");
//		}
//		else if(weight <= 80 && weight > 75)
//		{
//			System.out.println("샐러드먹자");
//		}
//		else
//		{
//			System.out.println("굶어");
//		}
		
		// 학점이 A이면 소고기
		// B이면 삼겹살
		// C이면 치킨
		// 그게 아니면 굶어
		
		char grade = 'A';
		
		if(grade == 'A')
		{
			System.out.println("소고기");
		}
		else if(grade == 'B')
		{
			System.out.println("삼겹살");
		}
		else if(grade == 'C')
		{
			System.out.println("치킨");
		}
		else {
			System.out.println("굶어");
		}
		
		switch(grade)
		{
		case 'A' : 
			System.out.println("소고기");
			break;
		case 'B' :
			System.out.println("삼겹살");
			break;
		case 'C' :	
			System.out.println("치킨");
			break;
		default : 
			System.out.println("굶어");
		}
		
		// A이면 소고기, 삼겹살
		// B이면 삼겹살
		// C이면 치킨
		
		switch(grade)
		{
		case 'A' : 
			System.out.println("소고기");
			
		case 'B' :
			System.out.println("삼겹살");
			break;
		case 'C' :	
			System.out.println("치킨");
			break;
		default :
		}
	}
}
