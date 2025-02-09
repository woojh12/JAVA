package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Person> list = new ArrayList<>();
				
		while(true)
		{
			System.out.println("1.입력 2.출력 3.삭제 4.종료");
			int sel = scan.nextInt();
			scan.nextLine();
			if(sel == 1)
			{
				System.out.println("이름 입력 : ");
				String name = scan.nextLine();
				
				System.out.println("생년월일 입력 : ");
				int birth = scan.nextInt();
					
				Person person = new Person(name, birth);
				list.add(person);
			}
			else if(sel == 2)
			{
				if(list.isEmpty())
				{
					System.out.println("비어있습니다.");
				}
				else
				{
					System.out.println(list);
				}
			}
			else if(sel == 3)
			{
				Iterator<Person> iter = list.iterator();
				System.out.println("삭제할 사람 이름을 입력하세요 : ");
				String delName = scan.nextLine();
				
				while(iter.hasNext())
				{
					String name = iter.next().getName();
					if(delName.equals(name))
					{
						System.out.println("삭제할 이름 : " + name);
						iter.remove();
					}
				}
				System.out.println("삭제 되었습니다.");
			}
			else if(sel == 4)
			{
				return;
			}
		}
	}
}
