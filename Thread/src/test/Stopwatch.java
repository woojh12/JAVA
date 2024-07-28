package test;

public class Stopwatch extends Thread{
	private boolean stop;
	
	@Override
	public void run()
	{
		int cnt = 0;
		System.out.println("스탑와치 시작");
		while(!stop)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cnt++;
		}
		System.out.println("걸린 시간 : " + cnt + "초");
	}
	
	public void setStop(boolean stop){
		this.stop = stop;
	}
}
