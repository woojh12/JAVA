package TEST;

import java.util.Scanner;

public class TEST5 {
	public int solution(String[] babbling) {
	       int answer = 0;
	       
	       String str[] = {"aya", "ye", "woo", "ma"};
	       
	       int num = 0;
	       int num3 = 0;
	       String temp[] = str;
	       
	       String finalStr[] = new String[1000];
	       	       
	       for(int i = 0; i < str.length; i++)
	       {
	    	   for(int j = 0; j < temp.length; j++)
	    	   {
	    		   finalStr[num] = str[i] + temp[j];
	    		   num++;
	    	   }
	       }
	       
//	       for(int i = 0; i < str.length; i++)
//	       {
//	    	   for(int j = 0; j < temp.length; j++)
//	    	   {
//	    		   finalStr[num] = str[i] + temp[j];
//	    		   num++;
//	    		   
//	    		   if(j == 0)
//	    		   {
//	    			   finalStr[num] = finalStr[num - 1] + temp[2];
//	    			   num++;
//	    			   finalStr[num] = finalStr[num - 1] + temp[3];	    			   
//	    			   num++;
//	    		   }
//	    	   }
//	       }
	       
	       
	       
	       for(int i = 0; i < finalStr.length; i++)
	       {
	    	   if(finalStr[i] != null)
	    	   {
	    		   System.out.println(finalStr[i]);
	    	   }
	       }
	       
	       for(int i = 0; i < babbling.length; i++)
	       {	    	   
	    	   for(int j = 0; j < temp.length; j++)
	    	   {
	    		   if(babbling[i].equals(temp[j]))
	    		   {
	    			   answer++;
	    		   }
	    	   }
	       }
	       
	       // equals 비교
	       for(int i = 0; i < babbling.length; i++)
	       {
	    	   for(int j = 0; j < finalStr.length; j++)
	    	   {
	    		   if(babbling[i].equals(finalStr[j]))
	    		   {
	    			   answer++;
	    		   }
	    	   }
	       }
	       
	       return answer;
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		TEST5 test = new TEST5();
		
		System.out.println("문자열 입력 : ");
		
		
		String babbling[] = new String[5];
		
		for(int i = 0; i < babbling.length; i++)
		{
			babbling[i] = scan.nextLine();
		}
		
		int result = 0;
		
		result = test.solution(babbling);
		
		System.out.println(result);
	}
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120956