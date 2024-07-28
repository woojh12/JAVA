package ex;

public class EX01 {
	public static void main(String[] args) {
		// 변수 만들기
		// 츄파츕스 가격은 250원이다.
		int candy = 250;
		
		System.out.println(candy);
		
		// 츄파츕스 가격 : 250원
		System.out.println("츄파춥스 가격 : " + candy + "원");
		
		// "츄파춥스" 가격 : 250원
		System.out.println("\"츄파춥스\" 가격 : " + candy + "원");
		
		// 츄파춥스 3개의 가격
		int total = candy * 3;
		
		System.out.println("츄파춥스 3개의 가격 : " + total + "원");
	
		// 츄파춥스 가격 인상
		candy += 100;
		total = candy * 3;
		
		System.out.println("인상된 츄파춥스 3개의 가격 : " + total + "원");
		
		// 3000원으로 츄파춥스를 몇개 살 수 있을까?
		int money = 3000;
		int count = money / candy;
		
		System.out.println("최대 개수 : " + count);
		
		// 최대로 사고 남은 거스름 돈 계산
		int change = money % candy;
	
		System.out.println("거스름돈 : " + change + "원");
	}
}
