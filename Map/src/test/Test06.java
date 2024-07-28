package test;

public class Test06 {
	public static void main(String[] args) {
		Goods goods1 = new Goods("신발1", 15000, "판매중");
		Goods goods2 = new Goods("가방1", 200000, "예약중");
		Goods goods3 = new Goods("가방1", 200000, "예약중");
		Market market = new Market();
		market.insert(goods1);
		market.insert(goods2);
		market.insert(goods3);
		market.read(goods1);
		market.updatePrice("가방1", 300);
		market.read(goods2);
		
	
	}
}
