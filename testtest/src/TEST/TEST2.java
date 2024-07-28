package TEST;

import java.util.Scanner;

public class TEST2 {
	public int solution(int[][] dots) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
//		int resultX[] = new int [6];		// x 차이의 값 저장
//		int resultY[] = new int [6];		// y 차이의 값 저장
		int answer = 0;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(j == 1)
				{
					continue;
				}
				if(num > 3)
				{
					num = 3;
				}
				System.out.print("[[" + dots[num][j] + "," + dots[num][j+1] + "]");
			}
			num++;
		}
		
		// 기울기 공식 ---> y/x 동일시 1반환
		int result1 = Math.abs((dots[2][1] - dots[0][1]))/ Math.abs((dots[2][0] - dots[0][0])); 
		int result2 = Math.abs((dots[3][1] - dots[1][1]))/ Math.abs((dots[3][0] - dots[1][0])); 
		
		if(result1 == result2)
		{
			answer = 1;
		}
		
	    return answer;
   }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TEST2 test2 = new TEST2();
		
		int result = 0;
		int arr[][] = new int[4][2];
		
		System.out.println("dots 입력 : ");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		
		result = test2.solution(arr);
		
		System.out.println("\t" + "RESULT : " + result);
	}
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120875?language=java