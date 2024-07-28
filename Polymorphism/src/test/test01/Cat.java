package test.test01;

public class Cat extends Animal{
	
	@Override
	public void eat()
	{
		System.out.println("냠냠");
	}
	@Override
	public void cry()
	{
		System.out.println("야옹");
	}
	
	@Override
	public void grooming()
	{
		System.out.println("핥짝핥짝");
	}
}
