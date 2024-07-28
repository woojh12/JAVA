package test.test03;

public class Test03 {
	public static void main(String[] args) {
		OmrCard omrcard = new OmrCard("1234567890", "abc");
		
		// omrcard.setMarking(1, 2, 3, 1, 1);
		
		omrcard.setMarking(1,1);
		omrcard.setMarking(2,2);
		omrcard.setMarking(3,3);
		omrcard.setMarking(4,1);
		omrcard.setMarking(5,1);
		
		omrcard.printInfo();
		
		OmrCardReader reader = new OmrCardReader();
		
		reader.setAnswer(1,2,3,4,5);
		reader.printInfo();
		
		int score = reader.checkScore(omrcard);
		
		System.out.println("점수 : " + score);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		reader.printResult(omrcard);	
	}
}
