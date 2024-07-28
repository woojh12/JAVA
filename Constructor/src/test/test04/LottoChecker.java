package test.test04;

import java.util.Random;

public class LottoChecker {
	// 당첨 번호
	private int[] winningNumbers = new int[6];
	
	// 당첨 번호 뽑는 기능
	public void drawLots()
	{
		Random random = new Random();
		
		for(int i = 0; i < winningNumbers.length; i++)
		{
			int randomNumber = random.nextInt(45) + 1;
			winningNumbers[i] = randomNumber;
			for(int j = 0; j < i; j++)
			{
				if(randomNumber == winningNumbers[j])
				{
					i--;
					break;
				}
			}
		}
	}
	
	public void printInfo()
	{
		System.out.print("당첨 번호 : " );
		for(int i = 0; i < winningNumbers.length; i++)
		{
			System.out.print(winningNumbers[i] + " ");
		}
		System.out.println();
	}
	
	// 일치하는 개수를 확인
	public int checkCount(Lotto lotto)
	{
		int[] numbers = lotto.getCheckNumbers();
		int count = 0;
		
		for(int i = 0; i < numbers.length; i++)
		{
			int number = numbers[i];
			for(int j = 0; j < winningNumbers.length; j++)
			{
				if(number == winningNumbers[j])
				{
					count++;
					break;
				}
			}
		}		
		return count;
	}
	
	// 당첨 결과 출력
	public void printResult(Lotto lotto)
	{
		int count = checkCount(lotto);
		
		switch(count)
		{
		case 6 : 
			System.out.println("1등");
			break;
		case 5 : 
			System.out.println("2등");
			break;
		case 4 : 
			System.out.println("3등");
			break;
		case 3 : 
			System.out.println("4등");
			break;
		case 2 : 
			System.out.println("5등");
			break;
		default : 
			System.out.println("꽝!");
		}
	}
}
