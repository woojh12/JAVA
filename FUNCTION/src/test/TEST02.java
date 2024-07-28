package test;
import java.util.Scanner;

public class TEST02 {
	public int addNum(int num)
	{
		int total = 0;
		for(int i = 1;i <= num;i++)
		{
			total += i;
			if(total > 100)
			{
				break;
			}
		}	
		return total;
	}
	
	public static boolean primeCheck(int num)
	{
		boolean result = false;
		int cnt = 0;
		for(int i = 1;i <= num;i++)
		{
			if(num % i == 0)
			{
				cnt++;
			}
		}
		System.out.println("cnt : " + cnt);
		if(cnt == 2)
		{
			result = true;
		}
		return result;
	}
	
	public static boolean primeCheck2(int num)
	{
		int arr[] = new int[num+2];
		
		for(int i = 2;i <= num;i++)
		{
			arr[i+2] = num % i;
		}		
		if(arr.length == 2)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		TEST02 test02 = new TEST02();
		
		//1. 합 구하기
		
//		System.out.println("수를 입력하세요 : ");
//		int num = scan.nextInt();
//		
//		int result = test02.addNum(num);
//		System.out.println(result);
		
		// 2. 소수 판별
		
		System.out.println("수를 입력하세요 : ");
		int num = scan.nextInt();
		
//		boolean run = primeCheck(num);
//		System.out.println(run);
		
		System.out.println(primeCheck2(num));
		
	}
}
