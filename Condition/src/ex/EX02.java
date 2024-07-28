package ex;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int walking = 10002;
		int weight = 65;
		
		// 만보를 걷고 몸무게가 70kg가 넘지 않으면 치킨 먹자
		// 만약 만보를 걷는다 그리고 몸무게가 70kg이하다 그러면 치킨 먹자
		if((walking >= 10000) && (weight <= 70))
		{
			System.out.println("치킨먹자");
		}
		
		
		walking = 9000;
		weight = 72;
		// 만보를 걷거나 몸무게가 70kg가 넘지 않으면 치킨 먹자
		// 만약 만보를 걷는다 또는 몸무게가 70kg이하다 그러면 치킨 먹자
		if((walking >= 10000) || (weight <= 70))
		{
			System.out.println("치킨먹자");
		}
		
		int number = 20;
		// 10 < number< 40
		// 10보다 크고 40보다 작다
		if(number > 10 && number < 40)
		{
			System.out.println("10보다 크고 40보다 작다.");
		}
		
		// number <= 10, number >= 40	
		if(number <= 10 || number >= 40)
		{
			System.out.println("number <= 10, number >= 40");
		}
	}
}
