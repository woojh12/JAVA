package test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Stopwatch watch = new Stopwatch();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작을 쓰면 스톱워치가 수행되고, 그만을 쓰면 스톱워치가 중단됩니다.");
		
		while(true)
		{
			String text = scan.nextLine();
			
			if(text.equals("시작"))
			{
				watch.setStop(false);;
				watch.start();
			}
			else if(text.equals("그만"))
			{
				watch.setStop(true);	
				break;
			}	
		}
		
		// http://marondal.com/lesson/quiz_content?lessonId=10238&lectureId=10010&lectureListId=10111&quizListId=10266
	}
}
