package test.test01;

public class Dog extends Animal{
	@Override
	public void eat()
	{
		System.out.println("냠냠");
	}
	
	@Override
	public void cry()
	{
		System.out.println("멍멍");
	}
	
	@Override
	public void lash()
	{
		System.out.println("꼬리 흔들흔들");
	}
}
