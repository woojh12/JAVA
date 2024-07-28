package test;

public class Inventory {
	private String name;
	private int price;
	private int stock;
	
	public Inventory(String name, int price, int stock)
	{
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getStock()
	{
		return stock;
	}
	
	public void setStock(int stock)
	{
		this.stock -= stock;
	}
	
	@Override
	public String toString()
	{
		return "(제품명 : " + name + " 가격 : " + price + " 재고 : " + stock + ") ";
	}
}
