package test.test01;

public abstract class Shape {
	// 도형 이름
	private String name;
	
	public Shape(String name)
	{
		this.name = name;	
	}
	
	public abstract double calculateArea();
	public abstract double calculateRound();
	
	public void printAreaAndRound()
	{
		System.out.println(name + " 넓이 : " + calculateArea() + " 둘레 : " + calculateRound());
	}
}
