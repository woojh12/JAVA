package test;

public class Animal implements Runnable{
	private String cry;
	
	public Animal(String cry)
	{
		this.cry = cry;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println(cry);			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
