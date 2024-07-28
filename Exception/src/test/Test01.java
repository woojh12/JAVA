package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = new String[5];
		
		try
		{
			for(int i = 0; i < 6; i++)
			{
				System.out.print("이름 입력 : ");
				String name = scan.nextLine();
				names[i] = name;
				System.out.println();
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			for(int i = 0; i < names.length; i++)
			{
				System.out.println(names[i]);
			}
		}
	}
}
