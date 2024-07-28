package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//-----------------------------------------------------------------------	
		Inventory inventory = new Inventory("새우깡", 1200, 150);
		List<Inventory> goodsList = new ArrayList();
		
		goodsList.add(inventory);
		goodsList.add(new Inventory("육개장", 850, 30));
		goodsList.add(new Inventory("신라면", 800, 15));
		goodsList.add(new Inventory("천마표팝콘", 1500, 0));
		
		System.out.println(goodsList);
		
//-----------------------------------------------------------------------		
		Iterator<Inventory> iter = goodsList.iterator();
		
		while(iter.hasNext())
		{
			Inventory goods = iter.next();
			
			int stock = goods.getStock();
			
			if(stock == 0)
			{
				iter.remove();
			}
		}
		System.out.println(goodsList);
//-----------------------------------------------------------------------	
		System.out.print("상품명 : ");
		String productName = scan.nextLine();
		System.out.print("개수 : ");
		int count = scan.nextInt();
		for(Inventory goods:goodsList)
		{
			String name = goods.getName();
			if(name.equals(productName))
			{
				int result = goods.getPrice() * count;
				System.out.println("가격 : " + result + "원");
				//int stock = goods.getStock() - count;
				goods.setStock(count);
			}
		}
		System.out.println(goodsList);
//-----------------------------------------------------------------------	
		for(Inventory goods:goodsList)
		{
			int stock = goods.getStock();
			if(stock <= 30)
			{
				System.out.println(goods);
			}
		}
	}
}
