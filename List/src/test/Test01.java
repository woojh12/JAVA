package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3,8,9,4,2,1,7,5));
		
//		list.add(3);
//		list.add(8);
//		list.add(9);
//		list.add(4);
//		list.add(2);
//		list.add(1);
//		list.add(7);
//		list.add(5);
		System.out.println(list);
		
		list.set(3, 6);
		System.out.println(list);
		
		list.add(2,10);
		System.out.println(list);
		
		list.remove(1);
		list.remove(6);
		System.out.println(list);
	}
}
