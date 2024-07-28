package TEST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TEST3 {
	public int solution(int[][] lines) {
	       int answer = 0;
	        
	       int[] arr = new int[200];
	       
	       for(int i = 0; i < lines.length; i++)
	       {
	    	   // 범위 -100 ~ 100 으로 설정됨, 배열에서 음수부터 시작은 불가능이므로 + 100을 해줘야함
	    	   for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)		
	    	   {
	    		   arr[j]++;
	    	   }
	       }
	       
	       for(int i = 0; i < arr.length; i++)
	       {
	    	   if(arr[i] > 1)
	    	   {
	    		   answer++;
	    	   }
	       }
	       return answer; 
}
	
	public static void main(String[] args) {
		TEST3 test = new TEST3();
		
		Scanner scan = new Scanner(System.in);
		
		int lines[][] = new int[3][2];
		
		System.out.println("숫자 입력 : ");
		
		for(int i = 0; i < lines.length; i++)
		{
			for(int j = 0; j < lines[i].length; j++)
			{
				lines[i][j] = scan.nextInt();
			}
		}
		
		System.out.print("[[");
		
		for(int i = 0; i < lines.length; i++)
		{
			for(int j = 0; j < lines[i].length; j++)
			{
				if((j == lines[i].length - 1) && (i == lines.length - 1))
				{
					System.out.print(lines[i][j]);
				}
				else
				{
					System.out.print(lines[i][j] + ", ");
				}
			}
		}
		System.out.println("]]");
		
		int result = 0;
		result = test.solution(lines);
		System.out.println(result);
	}
}


// https://school.programmers.co.kr/learn/courses/30/lessons/120876