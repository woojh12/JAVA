package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		Member member1 = new Member("qqq", "010-1111-2222");
		
		List<Member> memberList = new ArrayList();
		memberList.add(member1);
		memberList.add(new Member("유재석", "010-5555-1111"));
		memberList.add(new Member("강호동", "010-3333-1111"));
		memberList.add(new Member("유재석", "010-9999-8888"));
		
		System.out.println(member1);
		System.out.println(memberList);
		
		Member member2 = memberList.get(2);
		System.out.println(member2);
		
		// 멤버 이름 출력 : 이름 + 님 호출
		System.out.println(member1.getName() + "님");
		
		for(Member member:memberList)
		{
			System.out.println(member.getName() + "님");
		}
		
		// 모든 멤버의 이름과 전화번호 출력 : qqq(1111)
		 Iterator<Member> iter = memberList.iterator();
		 while(iter.hasNext())
		 {
			 Member member = iter.next();
			 String phoneNumber = member.getPhoneNumber();
//			 String[] phone = phoneNumber.split("-");
			 String lastPart = phoneNumber.substring(9);
//			 System.out.println(member.getName() + "(" + phone[2] + ")");
			 System.out.println(member.getName() + "(" + lastPart + ")");
		 }
		 
	}
}
