package test.test01;

import java.time.LocalDate;

public class Production {
	private String name;
	private int cost;
	private String date;
	
	public Production(String name, int cost, String date)
	{
		this.name = name;
		this.cost = cost;
		this.date = date;
	}
	
	public int getCount5()
	{
		return cost * 5;
	}
	
	public int getCount13()
	{
		return cost * 13;
	}
	
	public boolean avaliableSale()				// subString으로 비교해도됨 (년,월,일), replace함수로 '-'를 ''공백으로 변경
	{
		LocalDate now = LocalDate.now();
		
		String today = now + "";
		
		String[] temp = today.split("-");
		
		int todayInt = Integer.parseInt(temp[0])*10000 + Integer.parseInt(temp[1]) * 100 + Integer.parseInt(temp[2]);
		
		temp = date.split("-");

		int dateInt = Integer.parseInt(temp[0])*10000 + Integer.parseInt(temp[1]) * 100 + Integer.parseInt(temp[2]);
		
		if(todayInt < dateInt)
		{
			return true;
		}
		
		return false;		
	}
	
	public void printInfo()
	{
		System.out.println("이름 : " + this.name);
		System.out.println("가격 : " + this.cost);
		System.out.println("유통기한 : " + this.date);
		System.out.println();
	}
}
