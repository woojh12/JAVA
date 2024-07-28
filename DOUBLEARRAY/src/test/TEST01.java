package test;

import java.util.Scanner;

public class TEST01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 학생 별 평균 구하기
		double avg[] = new double[5];
		
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
				};
		
		for(int i = 0;i < scores.length;i++)
		{
			int total = 0;
			for(int j = 0;j < scores[i].length;j++)
			{
				total += scores[i][j];
				avg[i] = total / (double)scores[i].length;
			}
		}
		
		for(int i = 0; i < avg.length; i++)
		{
			System.out.println((i+1) + "번째 학생의 평균 : " + avg[i]);
		}
		
		System.out.println();
		
		// 2. 학생 별 최고점 구하기
		
		int max[] = new int[5];
		
		for(int i = 0; i < max.length; i++)
		{
			max[i] = 0;
		} 
		
		for(int i = 0; i < scores.length; i++)
		{
			int maxScore = 0;
			for(int j = 0; j < scores[i].length; j++)
			{
				if(maxScore < scores[i][j])
				{
					maxScore = scores[i][j];
				}
				max[i] = maxScore;
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println((i+1) + "번째 학생의 최고점 : " + max[i]);
		}
		
		System.out.println();
		
		// 3. 평균 최고점 구하기
		
		double avgMax = 0.0;
		int avgMaxIndex = 0;
		
		for(int i = 0; i < scores.length; i++)
		{
			if(avgMax < avg[i])
			{
				avgMax = avg[i];
				avgMaxIndex = i;
			}
		}
		
		System.out.println("평균이 가장 높은 학생 : " + (avgMaxIndex + 1) + "번째 학생");
		System.out.println("평균 : " + avgMax);
		
		// 4. 특정 과목 최고점
		
		int index4Max = 0;
		int temp = 0;
		
		for(int i = 0; i < scores.length; i++)
		{
			if(index4Max < scores[i][4])
			{
				index4Max = scores[i][4];
				temp = i;
			}
		}
		
		System.out.println("index 4 과목의 최고 성적자는 " + (temp + 1) + "번째 학생");
		System.out.println("점수 : " + scores[temp][4]);
		
		System.out.println();
		
		
		// 5. 일부 평균 최고점
		
		double indexAvg[] = new double[5];
		int indexNum = 0;
		double maxAvg = 0.0;
		
		for(int i = 0; i < scores.length; i++)
		{
			int total = 0;
			for(int j = 3; j <= 7; j++)
			{
				total += scores[i][j];
				indexAvg[i] = total / 5.0;
			}
		}
		
		for(int i = 0; i < indexAvg.length; i++)
		{
			if(maxAvg < indexAvg[i])
			{
				maxAvg = indexAvg[i];
				indexNum = i;
			}
		}
		
		System.out.println("평균이 가장 높은 학생 : " + indexNum + "번 index");
		System.out.println("평균 : " + maxAvg);
		
		
	}
}
