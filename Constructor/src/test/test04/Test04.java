package test.test04;

public class Test04 {
	public static void main(String[] args) {
//		Lotto lotto = new Lotto();
//		
//		lotto.manual(5, 11, 25, 39, 28, 26);
//		lotto.auto();
//		lotto.printInfo();
//		
		LottoChecker checker = new LottoChecker();
		checker.drawLots();
		
		for(int i = 0; i < 1000; i++)
		{
			Lotto lotto = new Lotto();
			lotto.auto();
			int count = checker.checkCount(lotto);
			
			if(count == 6)
			{
				System.out.println("1등 당첨");
			}
		}
//		checker.printInfo();
//		
//		checker.printResult(lotto);
	}
}
