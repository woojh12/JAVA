package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market {
	private List<Goods> goodsList;
	
	public Market()
	{
		this.goodsList = new ArrayList<>();
	}
	
	public void insert(Goods goods)
	{
		Iterator<Goods> iter = goodsList.iterator();
			
		while(iter.hasNext())
		{
			Goods temp = iter.next();
			if(temp.getName().equals(goods.getName()))
			{
				System.out.println("등록된 상품이 존재합니다.");
			}
			else
			{
				goodsList.add(goods);
			}
		}	
		System.out.println("추가되었습니다.");
		System.out.println(goods);
	}
	
	public void read(Goods goods)
	{
		Iterator<Goods> iter = goodsList.iterator();
		
		while(iter.hasNext())
		{
			Goods temp = iter.next();
			if(temp.getName().equals(goods.getName()))
			{
				System.out.println(goods);
			}
			else
			{
				System.out.println("비어있습니다.");
			}
		}
	}
	
	public void updatePrice(String name, int price)
	{
		Iterator<Goods> iter = goodsList.iterator();
		boolean exist = false;
		
		while(iter.hasNext())
		{
			Goods temp = iter.next();
			if(temp.getName().equals(name))
			{
				exist = true;
				temp.setPrice(price);
			}
		}
		
		if(exist == false)
		{
			System.out.println("수정할 상품이 존재하지 않습니다.");
		}
	}
	public void updateStatus(String name, String Status)
	{
		Iterator<Goods> iter = goodsList.iterator();
		boolean exist = false;
		
		while(iter.hasNext())
		{
			Goods temp = iter.next();
			if(temp.getName().equals(name))
			{
				exist = true;
				temp.setState(Status);
			}
		}
		
		if(exist == false)
		{
			System.out.println("수정할 상품이 존재하지 않습니다.");
		}
	}
	
	public void delete(Goods goods)
	{
		boolean exist = false;
		Iterator<Goods> iter = goodsList.iterator();
		
		while(iter.hasNext())
		{
			Goods temp = iter.next();
			if(temp.getName().equals(goods.getName()))
			{
				exist = true;
				iter.remove();
			}
		}
		
		if(exist == false)
		{
			System.out.println("존재하지 않는 상품입니다.");
		}
		System.out.println("삭제되었습니다.");
		System.out.println(goods);
	}
	
	// http://marondal.com/lesson/quiz_code?lessonId=10238&lectureId=10010&lectureListId=10108&quizListId=10264&quizContentId=
}
