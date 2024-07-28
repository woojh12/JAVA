package TEST;

import java.util.Scanner;

public class TEST1 {
	public int[][] solution(int n) {
		   Scanner scan = new Scanner(System.in);
		   
		   System.out.println("n : " + n);
		   System.out.println("입력 : ");
		   
//	       int[][] answer = new int[n][n];
	       int[][] answer = {};
	       
	       answer = new int[n][n];
	       
	       for(int i=0;i<n;i++)
	       {
	    	   for(int j=0;j<n;j++)
	    	   {
	    		   answer[i][j] = scan.nextInt();
	    		   //System.out.println("answer[" + i + "][" + j + "]"  + answer[i][j]);
	    	   }
	       }
	       
	       return answer;
	    }
	public static void main(String args[])
	{
		TEST1 test = new TEST1();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n의 값 입력 : ");
		int n = scan.nextInt();
		
		int[][] ans;
		
		ans = test.solution(n);
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181832
