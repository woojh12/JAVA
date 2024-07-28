package test.test01;

public class Test01 {
	public static void main(String[] args) {
		Circle circle = new Circle(8);
		
		circle.printInfo();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Production production = new Production("새우깡", 1300, "2021-03-02");
		
		production.printInfo();
		
		System.out.println("제품 5개의 가격 : " + production.getCount5());
		System.out.println("제품 13개의 가격 : " + production.getCount13());
		
		if(production.avaliableSale() == true)
		{
			System.out.println("판매 가능 상품");
		}
		else
		{
			System.out.println("판매 불가능 상품");
		}
	}
}
