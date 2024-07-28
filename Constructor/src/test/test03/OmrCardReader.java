package test.test03;

public class OmrCardReader {
	int[] answer = new int[5];
	
	public void setAnswer(int answer1, int answer2, int answer3, int answer4, int answer5)
	{
		answer[0] = answer1;
		answer[1] = answer2;
		answer[2] = answer3;
		answer[3] = answer4;
		answer[4] = answer5;
	}
	
	public void printInfo()
	{
		System.out.println("정답 : ");
		for(int i = 0; i < answer.length; i++)
		{
			System.out.print(answer[i] + " ");
		}
		System.out.println();
	}
	
	// 채점 기능
	public int checkScore(OmrCard card)
	{
		int[] marking = card.getMarking();
		
		int score = 0;
		
		for(int i = 0; i < answer.length; i++)
		{
			if(marking[i] == answer[i])
			{
				score += 100 / answer.length;
			}
		}
		
		return score;
	}
	
	// 채점 결과 출력 기능
	
	public void printResult(OmrCard card)
	{	
		int score = checkScore(card);	
		System.out.println("이름 : " + card.getName());
		System.out.println("학번 : " + card.getStudentId());
		System.out.println("점수 : " + score);
	}
	
	// 여러장의 카드 채점 결과 출력 기능

	public void printResult(OmrCard[] cards)
	{
		for(int i = 0; i < cards.length; i++)
		{
			printResult(cards[i]);
		}
	}
}
