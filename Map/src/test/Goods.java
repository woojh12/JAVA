package test;

public class Goods {
	private String name;
	private int price;
	private	String status;
	
	public Goods(String name, int price, String status)
	{
		this.name = name;
		this.price = price;
		this.status = status;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public void setState(String status)
	{
		this.status = status;
	}
	
	@Override
	public String toString()
	{
		return "물품명 : " + name + " 가격 : " + price + " 판매상태 : " + status;
	}
}
