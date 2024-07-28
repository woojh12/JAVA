package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// 셋(set)
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(10);
		set1.add(20);
		set1.add(40);
		
		// set은 순서가 없다. (index가 없다.)
		System.out.println(set1);
		
		set1.add(20);
		// 중복된 값이 저장되지 않는다.
		System.out.println(set1);
		
		if(set1.contains(20))
		{
			System.out.println("20이 존재한다.");
		}
		
		for(int number:set1)
		{
			System.out.println(number);
		}
		
		Iterator<Integer> iter = set1.iterator();
		
		while(iter.hasNext())
		{
			int number = iter.next();
			System.out.println(number);
		}
	}
}
