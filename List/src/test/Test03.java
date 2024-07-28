package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
// -----------------------------------------------------------------------------------------------------
//		1. id 중복 체크
		List<String> list1 = new ArrayList<>(Arrays.asList("hagulu", "happy", "google", "bts", "iu", "cuteboy"));
		
		
		System.out.print("id : ");
		String id = scan.nextLine();
	
		if(list1.contains(id))
		{
			System.out.println("중복 입니다.");
		}
		else
		{
			System.out.println("사용가능");
		}
		
// -----------------------------------------------------------------------------------------------------
//		2. 체조 경기 평균 점수
		List<Integer> list2 = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
		
		int max = list2.get(0);
		int min = list2.get(1);
		
		for(int i = 0; i < list2.size(); i++)
		{
			if(max < list2.get(i))
			{
				max = list2.get(i);
			}
			
			if(min > list2.get(i))
			{
				min = list2.get(i);
			}
		}
		
		int maxnum = list2.indexOf(max);
		int minnum = list2.indexOf(min);
		
		list2.remove(minnum);
		list2.remove(maxnum);
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < list2.size(); i++)
		{
			sum += list2.get(i);
		}
		avg = (double)sum / list2.size();
		System.out.println(avg);
// -----------------------------------------------------------------------------------------------------
//		3. 로또 번호
		List<Integer> list3 = new ArrayList<>();

		Random ran = new Random();
		
		for(int i = 0; i < 6; i++)
		{
			int randomNumber = ran.nextInt(45) + 1;
			if(list3.contains(randomNumber))
			{
				i--;
				continue;
			}
			else
			{
				list3.add(randomNumber);
			}
		}
		
		
//		int arr[] = new int[6];
//		
//		Random ran = new Random();
//		
//		for(int i = 0; i < 6; i++)
//		{
//			arr[i] = ran.nextInt(45) + 1;
//			for(int j = 0; j < i; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					i--;
//				}
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			list3.add(arr[i]);
//		}
		list3.sort(Comparator.naturalOrder());
		System.out.println(list3);
// -----------------------------------------------------------------------------------------------------
//		4. 회원 추가하기
//		List<String> list4 = new ArrayList<>();
//		
//		list4.add("우솝");
//		list4.add("루피");
//		list4.add("상디");
//		list4.add("나미");
//		list4.add("로빈");
//		
//		System.out.print("이름 입력 : ");
//		String name = scan.nextLine();
//		int cnt = 0;
//		if(!list4.contains(name))
//		{
//			list4.add(name);
//		}
//		else
//		{
//			int indexNum = list4.indexOf(name);
//			cnt++;
//			name = name + cnt;
////			System.out.println(indexNum);
////			list4.add(indexNum+1, name);
//			list4.add(list4.size(), name);
//		}
//		
//		System.out.println(list4);
		
		List<String> memberList = new ArrayList<>();
		
		memberList.add("우솝");
		memberList.add("루피");
		memberList.add("상디");
		memberList.add("나미");
		memberList.add("로빈");
		
		List<String> newmemberList = new ArrayList<>();
		
		newmemberList.add("프랑키");
		newmemberList.add("루피");
		newmemberList.add("쵸파");
		newmemberList.add("로빈");
		newmemberList.add("루피");
	
		for(int i = 0; i < newmemberList.size(); i++)
		{
			String newMember = newmemberList.get(i);
			
			int count = 1;
			while(memberList.contains(newMember))
			{
				newMember = newmemberList.get(i) + count;
				count++;
			}
		
			memberList.add(newMember);			
		}
		
		System.out.println(memberList);
	}
}
