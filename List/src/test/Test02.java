package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
//-----------------------------------------------------//
// 1. List 만들기
		List<Integer> list = new ArrayList<>();
		
		list.add(20);
		list.add(3);
		list.add(5);
		list.add(84);
		list.add(17);
		System.out.println(list);
//-----------------------------------------------------//	
// 2. 최소값 구하기
		int min = list.get(0);
		for(int i = 0; i < list.size(); i++)
		{
			int num = list.get(i);
			if(min > num)
			{
				min = num;
			}
		}
		System.out.println(min);
//-----------------------------------------------------//		
// 3. 합계 구하기
		Iterator<Integer> iterator = list.iterator();
		
		int sum = 0;
		while(iterator.hasNext())
		{
			int num = iterator.next();
			sum += num;
		}
		System.out.println(sum);
//-----------------------------------------------------//		
// 4. 리스트 삭제
//		for(int i = 0; i < list.size(); i++)
//		{
//			int num = list.get(i);
//			if(num % 2 == 0)
//			{
//				list.remove(i);
//			}
//		}
//		System.out.println(list);
		
		Iterator<Integer> iter2 = list.iterator();
		
		while(iter2.hasNext())
		{
			int num = iter2.next();
			if(num % 2 == 0)
			{
				iter2.remove();
			}
		}
		System.out.println(list);
//-----------------------------------------------------//
	}
}
