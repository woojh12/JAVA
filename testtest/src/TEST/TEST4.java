package TEST;
import java.util.Scanner;

public class TEST4 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        answer = new int[2];
        
        int num1[] = {};
        int cnt1 = 0;
        int num2[] = {};
        int cnt2 = 0;
        
        int resultDenom = 0;
        int resultNumer = 0;
        
        if(denom1 == denom2)
        {
        	resultDenom = denom1;
        	resultNumer = numer1 + numer2;
        }
        else if(denom2 > denom1)
        {
        	if(denom2 % denom1 == 0)
        	{
        		resultDenom = denom2;
        		int multipleNum = resultDenom / denom1;
        		numer1 = numer1 * multipleNum;
        		resultNumer = numer1 + numer2;
        	}
        	else
        	{
        		int temp = denom2 % denom1;
        		resultDenom = (denom1 * denom2) / temp;
        		numer1 = (resultDenom / denom1) * numer1;
        		numer2 = (resultDenom / denom2) * numer2;
        		resultNumer = numer1 + numer2;
        		
        	}
        }
        else if(denom1 > denom2)
        {
        	if(denom1 % denom2 == 0)
        	{
        		resultDenom = denom1;
        		int multipleNum = resultDenom / denom2;
        		numer2 = numer2 * multipleNum;
        		resultNumer = numer1 + numer2;
        	}
        	else
        	{
        		int temp = denom1 % denom2;
        		resultDenom = (denom1 * denom2) / temp;
        		numer1 = (resultDenom / denom1) * numer1;
        		numer2 = (resultDenom / denom2) * numer2;
        		resultNumer = numer1 + numer2;
        		
        	}
        }
    
        answer[0] = resultNumer;
        answer[1] = resultDenom;
        
    
        return answer;
    }
	public static void main(String[] args) {
		
		System.out.println("숫자 입력 : ");
		Scanner scan = new Scanner(System.in);
		
		int numer1 = scan.nextInt();
		int denom1 = scan.nextInt();
		int numer2 = scan.nextInt();
		int denom2 = scan.nextInt();
		
		TEST4 test = new TEST4();
		
		int[] answer = new int[2];
		answer = test.solution(numer1, denom1, numer2, denom2);
		
		System.out.println("[" + answer[0] + ", " + answer[1] + "]");
	}
}


// https://school.programmers.co.kr/learn/courses/30/lessons/120808?language=java